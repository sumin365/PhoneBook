package com.javaex.oop.summary.a9;
//03ppt - 54p/62

public class Panda extends Animal{   //생성자를 안만들었다 라는 이유로 오류 발 생 //두번쨰 추상메서드를 오버 라이드 안했다. 

	
	// 생성자
	public Panda(String name, int age) {
		super(name, age);  //부모인 Animal생성자에서 호출 
	}

	// 부모의 추상 메서드는 반드시 Override!
	@Override
	public void say() {
		System.out.println(name + ": zzz~");
	}
}