package com.nt;
import java.time.LocalDate;
import java.util.Date;

// no need of config and client package all can be done here
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.nt.sbean.SeasonFinder;

@SpringBootApplication
public class SpringBootStarterProject1SpingToolSuiteApplication {
	
	@Bean(name="dt")
	public LocalDate createdt() {
		return LocalDate.now();
	}
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootStarterProject1SpingToolSuiteApplication.class, args);
		SeasonFinder sfo=ctx.getBean("sf", SeasonFinder.class);
		System.out.println(sfo.Seasonbuisnessm());
		ctx.close();
	}

}
