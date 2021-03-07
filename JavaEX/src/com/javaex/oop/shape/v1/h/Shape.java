package com.javaex.oop.shape.v1.h;
//003ppt - 48p 위 문제/62

//<<<<<<<추상클라스>>>>>>>>>>
//객체화 될수 없고 
//자식 클래스에게 필드와 메서드를 물려주는 역할
//특정 기능의 구현을 강제 (규약)하는 역할을 수행

public abstract class Shape {                            //abstract
    //필드
	protected int x ;
	protected int y ;
	
	//생성자 
	public Shape (int x , int y ) {
		this.x = x;
		this.y = y ;
	}
	
    //	추상 클래스는 1개 이상의 추상 메서드를 갖는다(구현부가 없다)
	public abstract void draw();                        //abstract
	public abstract double area();                      //abstract
}
//	일반 메서드도 가질 수 있다. 
//public void eat() {	
//	System.out.println(name + "is eating...");
//}