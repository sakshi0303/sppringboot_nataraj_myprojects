package com.nt.mains;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbean.Flipkart;

/**
 * Hello world!
 */
public class Qualifier4mOutsideTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        Flipkart fk=ctx.getBean("fkpt",Flipkart.class);
        
        System.out.print(fk.shopping());
        
    }
}
