package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.study.springboot.bean.Config;
import com.study.springboot.bean.Member;
import com.study.springboot.bean.Printer;

@SpringBootApplication
public class Springdi1Application {

	public static void main(String[] args) {
//		SpringApplication.run(Springdi1Application.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Member member1 = (Member) context.getBean("member1");
		member1.print();

		Member member2 = context.getBean("hello", Member.class);
		member2.print();

		Printer printer = context.getBean("printerB", Printer.class);
		member1.setPrinter(printer);
		member1.print();

		if (member1 == member2) {
			System.out.println("동일한 객체입니다.");
		} else {
			System.out.println("서로 다른 객체입니다.");
		}
	}

}
