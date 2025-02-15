package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class I18nTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter language code ");
        String lang=sc.next();
        System.out.println("enter country code");
        String contry=sc.next();
        Locale locale=new Locale(lang,contry); // java.util/lang class
        String msg1=ctx.getMessage("Welcome.msg", new Object[] {}, locale); // additional arg="raja";
        String msg2=ctx.getMessage("Goodbye.msg", new Object[] {}, locale);
        String msg3=ctx.getMessage("FestivalWishes.msg", new Object[] {}, locale);
        System.out.println(msg1+"  "+msg2+"  "+msg3);
        sc.close();
        ctx.close();
        
    }
}
