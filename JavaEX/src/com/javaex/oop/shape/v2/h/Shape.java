package com.javaex.oop.shape.v2.h;
//03ppt - 52p/62

//추상클래스: 
//객체화 될수 없고 
//자식 클래스에게 필드와 메서드를 물려주는 역할
//특정 기능의 구현을 강제 (규약)하는 역할을 수행

public abstract class Shape {
//필드
	protected int x ;
	protected int y ;
	
	//생성자 
	public Shape (int x , int y ) {
		this.x = x;
		this.y = y ;
	}
	
	
	//	추상 클래스는 1개 이상의 추상 메서드를 갖는다(구현부가 없다)
//	public abstract void draw();	//	-> 파일 v1과 다르게 Drawable 인터페이스에 위임
	public abstract double area();
}