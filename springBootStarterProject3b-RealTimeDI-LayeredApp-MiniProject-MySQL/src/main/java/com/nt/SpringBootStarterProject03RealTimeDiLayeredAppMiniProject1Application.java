package com.nt;

import java.beans.BeanProperty;
import java.security.spec.NamedParameterSpec;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.EmployeeOperationController;
import com.nt.model.Employee;

@SpringBootApplication(exclude = {JdbcTemplateAutoConfiguration.class})
public class SpringBootStarterProject03RealTimeDiLayeredAppMiniProject1Application {
	
	
	@Bean
	public ComboPooledDataSource createc3P0ds() throws Exception {
		ComboPooledDataSource ds=new ComboPooledDataSource();
		ds.setJdbcUrl("jdbc:mysql:///NareshITSBMS");
		ds.setDriverClass("com.mysql.cj.jdbc.Driver");
		ds.setUser("root");
		ds.setPassword("S@kshi12");
		return ds;
	
	}

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
		
		String Beanids[]=ctx.getBeanDefinitionNames();
		System.out.println("++++++++++++++++++++++++++");
		System.out.println(Arrays.toString(Beanids));
		ctx.close();
		
	}

}
