package com.javaex.oop.summary.a9;
//03ppt - 54p/62

//<<<<<<<추상클라스>>>>>>>>>>
//객체화 불가
//필드를 가질 수 있다. 
//일반 메서드, 추상 메서드를 가짐

public abstract class Animal {
    //필드 
	protected String name;
	protected int age;
	
	//생성자
	//자바가 기본 생성자를 넣는다. 
	//명시적으로 생성자를 추가 한다면  기본 생성자는 안생긴다. 
	
	public Animal(String name) {
		this.name =name ;
	}
	public Animal(String name, int age ) {
		this (name);    //내부의 다른 생성자를 호출 할 수 있다. 
		this.age = age; //외부의 다른 생성자를 호출 할 수 있다. 
		
	}
	
	//	일반 메서드
	public void eat() {	
		System.out.println(name + "is eating...");
	}
	
	//	반드시 1개 이상의 추상 메서드를 가진다 -> 반드시 Override 해야 한다
	
	public abstract void say();	//	선언만 한다
}