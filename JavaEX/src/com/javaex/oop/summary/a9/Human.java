package com.javaex.oop.summary.a9;
//03ppt - 54p/62

public class Human extends Animal {
//	생성자
	public Human(String name, int age) {
		super(name, age);
	}

	@Override
	public void say() {
		System.out.printf("안녕, 내 이름은 %s야%", name);
	}
}
