package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.nt.sbean.Employee;

@SpringBootApplication
@PropertySource("com/nt/commons/Info.properties")
public class SpringBootStarterProject05BulkDataInjectionUsingConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootStarterProject05BulkDataInjectionUsingConfigurationPropertiesApplication.class, args);
		Employee empm=ctx.getBean("emp",Employee.class );
		System.out.println(empm);
	}

}
