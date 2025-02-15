package com.nt.service;
//? can begiven in replace of * only in date and week places
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.LastModified;

@Service
public class SchedulerService {
	//@Scheduled(fixedDelay = 3000,initialDelay = 5000)
	//@Scheduled(fixedDelay = 3000,initialDelay = 5000)
	//@Scheduled(fixedRate = 15000)// max time to finish then task, if 12000 then gap pf 3 ms and
	// automatically buisness method execute without calling it manually in runner class
	// enable scheduing in the main class wiht spingboot application annotaion
	// inital delay : time gap after the app is started
	// TimerTask,Timer , Period of time-school everyday , point of time-school start date
//	public void reportgeneration()
//	{
//		
//		System.out.println("SchedulerService.reportgeneration()---> "+new Date()+"thresd name:::"+Thread.currentThread().getName()); //total 8 seconds gap should come
//		
//		try {
//			Thread.sleep(18000);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
	
//	@Scheduled(fixedRate = 3000)
//	public void getreport() {
//		System.out.println("SchedulerService.getreport() main method:::"+Thread.currentThread().getName() );
//	}
	
	//every min 15 scs
	// six star means: 0-59 secs, 0-59 mins, 0-23 hours, 1-31 dates,1-12 months, SUN-SAT 0-7: 0 and 7 both represent sunday
	//industry preferend, both point of time and period of time
	@Scheduled(cron = "15 * * * * *")
	public void getreport1() {
		System.out.println("SchedulerService.getreport1()"+new Date());
	}
	
	// every min 30 secs
	@Scheduled(cron = "30 * * * * *")
	// ever hour 10 mins ever second
	@Scheduled(cron = "* 10 * * * *")
	//every hour 50 minute  52 second minute
	@Scheduled(cron = "52 50 * * * *")
	
	//every hour 52 secs put 0 in mins
	@Scheduled(cron = "52 0 * * * *")
	
	// every hour at 52 mins
	@Scheduled(cron = "0 52 * * * *")
	
	// every second of 54 minute every hour hours every seconds of
	@Scheduled(cron = "* 54 * * * *")
	
	// every second of every minute
	@Scheduled(cron = "* * * * * *")
	
	// everyday at 9 AM
	@Scheduled(cron="0 0 9 * * *")
	
	//everyday at 12 59
	@Scheduled(cron = "0 59 12 * * *")
	
	// which happy independence dday August 15th 9 AM
	@Scheduled(cron = "0 0 9 15 8 *")
	
	// execute the task at june 29th 1:3 pm
	@Scheduled(cron="0 3 13 29 6 *")
	
	// wish me happy birthday on my birthday // only week days can be given in letters
	@Scheduled(cron = "0 23 11 3 3 *")
	
	//which me happy new year on jan first 10 hour
	@Scheduled(cron = "0 0 10 1 1 *")
	
	//sec,min,hour,date,month,
	
	//meaning of "20 30 20 * * *" every day 8:30pm 20 secs
	
	// every sec,every min, every hour,every day, every month, any day
	/// every hour at 8 min and 10 mins
	@Scheduled(cron = "0 8,10 * * * *")
	
	
	/// ever hour at 8 min and 10 min
	@Scheduled(cron = "0 8,10 * * * *")
	
	// execute the task from 10th min to 20min on 30th sec of every hour
	@Scheduled(cron = "30 10-20 * * * *")
	
	// every month 1st only if it is sunday
	@Scheduled(cron="0 0 9 1 * SUN")
	//@Scheduled(cron="0 0 9 1 * 0")
	//@Scheduled(cron="0 0 9 1 * 7")
	
	
	//every month 10 only if it is weekend SAt or SUN
	@Scheduled(cron = "0 0 10 10 * SAT,SUN")
	//@Scheduled(cron = "0 0 10 10 * SAT-SUN")
	// @Scheduled(cron = "0 0 10 10 * 6,7")
	
	// the task should execute only on sun days at 10am of every month
	@Scheduled(cron = "0 0 10 * * SUN")
	
	//execute the task at 10:00am only on SUn-Thu days of week 
	// ? can begiven in replace of * only in date and week places
	@Scheduled(cron = "0 0 10 ? * SUN-THU")
	
	// execute task on any weekday of Octuber month at 10am
	@Scheduled(cron = "* * 10 ? 10 ?")
	@Scheduled(cron = "* * 10 * 10 *")
	
	
	// execute the task on anyday of nov month having weekday Sun-Tues
	@Scheduled(cron = "0 0 11 ? 11 SUN-TUE")
	
	//---------------------------------------------------------------------------------------------------------
	/// task should execute every second having 20 sec gap
	@Scheduled(cron = "0/20 * * * * *")
	public void display() {
		
	}
	
	//@Scheduled(cron = "${cron.expresion}")
	// every min having 15 mins timegap
	@Scheduled(cron = "10 0/15 * * * *")
	
	// task should start at 7 :01 should be repeated at every 2 mins
	@Scheduled(cron = "0 1/2 * * * *")
	
	// execute task for every 5 mins at 30 secs starting with 10th minute
	@Scheduled(cron = "30 10/5 * * * *")
	
	//Execute the given task having 12 hours gap start with 1 am
	@Scheduled(cron = "0 0 1/12 * * *")
	
	@Scheduled(cron="0/20 0/30 10 * * *")
	
	//every day 10am starting with 9 min::: gap of 10 min ,starting with 4 sec with 5 secs gap 
	@Scheduled(cron = "4/5 9/10 10 * * *")
	
	//execute the given task for every 15 days at 7pm 10 mins 20 secs // date starts with 1-31
	@Scheduled(cron = "20 10 19 1/15 * *")
	
	/// execute the given task only on weekends every hour every 15 days gap
	@Scheduled(cron = "0 0 * 1/15 * SAT-SUN")
	
	//execute the task only on Sun days for every second
	@Scheduled(cron = "* * * * * SUN")
	
	//execute the task only on feb 29th at 2pm
	@Scheduled(cron = "0 0 14 29 2 *")
	
	//@macros @daily @weekly @monthly @yearly 
	
	// LAST DAY CONCEPT from Sppring 5.3------> ONLY HAPPEN FOR DAYS AND WEEKENDS of the month
	// last day of the month at midnight
	@Scheduled(cron = "* * * L * *")
	
	// last friday of the month at midnight
	// weekday mon-fri, iif n= in sat, it will go to friday, if sat in fri, then it will go on mon
	@Scheduled(cron = "* * * LW * 6L")
	public void display1() {
		
	}
	
	
}