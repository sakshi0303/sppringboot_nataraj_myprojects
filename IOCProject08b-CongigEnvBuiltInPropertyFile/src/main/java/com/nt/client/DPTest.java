package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbean.P1;
import com.nt.sbean.P2;

/**
 * Hello world!
 */
public class DPTest {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
       
       P1 p1=ctx.getBean("p1",P1.class);
       System.out.println(p1);
       
       // using getenviornemt from @autowired
       P2 p2=ctx.getBean("p2",P2.class);
       p2.showenvvalued();
       
       
    }
}
