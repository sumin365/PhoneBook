package com.javaex.oop.shape.v1.a8;
//003ppt - 48p 위 문제/62
public class Rectangle extends Shape {
// 오류가 있네 -생성자의 문제 또는 추상메서드는 반드시 구현해줘야한다. 두개의 이유가 있을 듯
	//필드 필요
	private int width;
	private int height;
	
	//생성자
	public Rectangle (int x,int y,int width,int height) {
      super (x,y);
      this.width = width ;
      this.height = height;
      
	}


	@Override
	public void draw() {
		System.out.printf(
				"사각형[x=%d, y=%d, width=%d, height=%d, area=%.2f]을 그렸습니다.%n",
				x, y, width, height, area());
	}

	@Override
	public double area() {
		return width * height;
	}

}