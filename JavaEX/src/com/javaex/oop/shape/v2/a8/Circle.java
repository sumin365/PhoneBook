package com.javaex.oop.shape.v2.a8;
//03ppt - 52p/62
public class Circle extends Shape implements Drawable { // 오류가 있네 -생성자의 문제  /추상메서드는 만든시 구현해줘야한다. 두개의 이유가 있을 듯

	//필드
	//쉐이프로 부터 xy받음
	private double radius;
	
	//	생성자
	public Circle(int x, int y, double radius) {
		super(x, y);  //shape (x,y) 생성자가 있다. 
		this.radius = radius;
	}
	
	//추상 클래스를 상속받은 자식 클래스는 반드시 부모의
	//	추상 메서드를 구현해야 한다
	@Override
	public void draw() {
		System.out.printf(
				"원[x=%d, y=%d, r=%f, area=%f]을 그렸습니다.%n",
				x, y, radius, area());
	}
	
	@Override
	public double area() {
	//	double area = Math.PI * Math.pow(radius, 2);
	//	return area;
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	
	}
