package com.javaex.oop.shape.v1.h;
//003ppt - 48p 위 문제/62
public class Circle extends Shape {
// 오류가 있네 -생성자의 문제 또는 추상메서드는 반드시 구현해줘야한다. 두개의 이유가 있다
	
	//필드 
	//쉐이프로 부터 xy받음 추가로 반지름만 추가하기 
	private double radius;
	
	//생성자 
	//shape (x,y) 생성자가 있다. 
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
//아직 오류가 해결이 안됨 
//	추상 클래스를 상속받은 자식 클래스는 반드시 부모의
//	추상 메서드를 구현해야 한다
	
// <<@Override하는 방법>> - ctrl + space바
//	                    - 우측 버튼 -> source-> override
	
	@Override
	public void draw() {
		System.out.printf(
				"원[x=%d, y=%d, r=%.2f, area=%.2f]을 그렸습니다.%n",
				x, y, radius, area());
	}

	@Override
	public double area() {
//		double area = Math.PI * Math.pow(radius, 2);
//		return area;
//      또는 이렇게 간단히 해도 된다. 
		return Math.PI * Math.pow(radius, 2); //Math.pow(radius, 2); 제곱메소드이다. ~을 ~곱해라
	} 

	
	
}
