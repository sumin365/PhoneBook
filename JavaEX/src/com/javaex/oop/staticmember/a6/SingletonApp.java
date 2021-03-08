package com.javaex.oop.staticmember.a6;

public class SingletonApp {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton(); 안됨 생성자가 private이니까
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 -> " + s1);
		System.out.println("s2 -> " + s2);

		System.out.println("s1과 s2는 같은 객체 ? " + (s1 == s2));
	}

}