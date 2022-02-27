package com.study.springboot.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 설정으로 사용됨을 의미
public class Config {

	@Bean
	public Member member1() {
		Member member1 = new Member();
		member1.setName("홍길동");
		member1.setNinkname("도사");
		member1.setPrinter(new PrinterA());

		return member1;
	}

	@Bean(name = "hello")
	public Member member2() {
//		Constructor Injection (생성자를 이용한 의존성 주입)
		return new Member("전우치", "도사", new PrinterA());
	}

	@Bean
	public PrinterA printerA() {
		return new PrinterA();
	}

	@Bean
	public PrinterB printerB() {
		return new PrinterB();
	}

}
