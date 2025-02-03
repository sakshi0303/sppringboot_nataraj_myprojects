package com.nt;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.EmployeeOperationController;
import com.nt.model.Employee;

@SpringBootApplication
public class SpringBootStarterProject03RealTimeDiLayeredAppMiniProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootStarterProject03RealTimeDiLayeredAppMiniProject1Application.class, args);
		EmployeeOperationController controller=ctx.getBean("empController",EmployeeOperationController.class );
		
		try {
			List<Employee> list=controller.showEmpwithDesg("Lead", "Developer", "Director");
			list.forEach(emp->{
				System.out.println(emp);
			});
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("problem in code"+e.getMessage());
			
		}
		
		
//		String beanids[]=ctx.getBeanDefinitionNames();
//		System.out.println("All bean ids are"+Arrays.toString(beanids));
		ctx.close();
		
	}

}
