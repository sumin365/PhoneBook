package com.javaex.oop.casting.a7;

public class Dog extends Animal {//부모를 상속 받아야함 //생성자가 필요하다. super초기화필요 

	
	    //생성자
		public Dog (String name ) {
			super (name);
			
		}
		//메소드
		public void bark() {
			System.out.println(name +": 멍멍~ ");
		}
	}
