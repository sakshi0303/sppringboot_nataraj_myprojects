package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.EmpCont;
import com.nt.model.Employee;

@SpringBootApplication
public class SpringBootStarterProject06DataInjectionYaml1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(SpringBootStarterProject06DataInjectionYaml1Application.class, args);
		EmpCont empo =ctx.getBean("empController",EmpCont.class );
		try {
			List<Employee> list =empo.showEmpbyDesg("Lead", "Manager", "Test");
			
			for (Employee emp : list) {
				System.out.println(emp);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
		
		
	}

}
