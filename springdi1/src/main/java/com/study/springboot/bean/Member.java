package com.study.springboot.bean;

public class Member {
	private String name;
	private String nickname;
	private Printer printer;

	public Member() {

	}

	public Member(String name, String ninkname, Printer printer) {
		super();
		this.name = name;
		this.nickname = ninkname;
		this.printer = printer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNinkname() {
		return nickname;
	}

	public void setNinkname(String ninkname) {
		this.nickname = ninkname;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void print() {
		printer.print("Hello " + name + " : " + nickname);
	}

}
