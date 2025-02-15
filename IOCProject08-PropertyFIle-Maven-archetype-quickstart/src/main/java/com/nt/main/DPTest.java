package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import com.nt.config.AppConfig;
import com.nt.sbean.P1InfoEnvironemnt;
import com.nt.sbean.Pinfo;

public class DPTest {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	Pinfo msg=ctx.getBean("pinfo",Pinfo.class);
    	System.out.println(msg);
    	
    	// Environment built in obj
      	ConfigurableEnvironment env = ctx.getEnvironment();
    	System.out.println(env.getProperty("os.name"));
    	System.out.println(env.getProperty("per.id"));
    	
    	P1InfoEnvironemnt Envmsg=ctx.getBean("p1infoenvi",P1InfoEnvironemnt.class);
    	Envmsg.showdata();
    	
    	ctx.close();
    }
}
