package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MatrimonialProfile;
import com.nt.service.IMatrimonyService;

@Component
public class LOBRunnerTest implements CommandLineRunner {
	
	@Autowired
	private IMatrimonyService service;

	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter name");
		String name=sc.next();
		System.out.println("please enter mobile no");
		Long mobile=sc.nextLong();
		System.out.println("please enter phone path");
		String photoPath=sc.next();
		System.out.println("please enter file path");
		String ResumePath=sc.next();
		
		
		//photopath: byte[] large files fileinputStream blob
		FileInputStream fo= new FileInputStream(photoPath);
		byte[]  photocontent=new byte[fo.available()];
		photocontent=fo.readAllBytes();
		
		//resume char[] file and filereader clob
		File file=new File(ResumePath);
		FileReader freader=new FileReader(file);
		char[] resumecontent=new char[(int) file.length()];
		freader.read(resumecontent);
		
		
		MatrimonialProfile m=new MatrimonialProfile(name,mobile,photocontent,resumecontent);
		
		try {
			System.out.println(service.registerInfo(m));
		}catch (Exception e) {
			System.out.println("record not found");
			e.printStackTrace();
		}
//		
////		
////		MatrimonialProfile m=new MatrimonialProfile();
////		m.setName(name);
////		m.setMobile(mobile);
////		m.setPhoto(photoContent);
//		//m.setResume(resumecontent);
		
		
		
		
//		FileInputStream fl=new FileInputStream(photoPath);
//		byte[] photoContent= new byte[fl.available()];
//		photoContent=fl.readAllBytes();
//		
//		File file=new File(ResumePath);
//		FileReader reader=new FileReader(file);
//		char[] resumeContent= new char[(int) file.length()];
//		reader.read(resumeContent);
		
		
//		Optional<MarriageProfile> opt=profileService.showProfileById(102);
//		if(opt.isPresent()) {
//			System.out.println("Marriage Profile::");
//			MarriageProfile profile=opt.get();
//			System.out.println(profile.getPid()+"  "+profile.getName()+"  "+profile.getMobileNo());
//			byte[] photoContext=profile.getPhoto();
//			char[]  resumeContent=profile.getResume();
//			FileOutputStream fos=new FileOutputStream("retrive_photo.jpg");
//			fos.write(photoContext);
//			fos.flush(); fos.close();
//			FileWriter writer=new FileWriter("retreive_resume.txt");
//			writer.write(resumeContent);
//			writer.flush();writer.close();
//			System.out.println("photo and resume files are retrived");
//			
//		}
//		else {
//			System.out.println("profile not found");
//		}
		
		
	
	}

}
