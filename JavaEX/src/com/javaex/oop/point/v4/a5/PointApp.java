package com.javaex.oop.point.v4.a5;

public class PointApp {
//ppt03번 - 42p/62

	public static void main(String[] args) {
		Point p1 = new Point(5, 10); 
		p1.draw();
		p1.draw(false); // 오버로딩된 메서드를 호출

		Point p2 = new Point(15, 30); // 사용자 정의 생성자
		p2.draw();
		p2.draw(false); // 오버로딩된 메서드를 호출
		
		ColorPoint cp = new ColorPoint(20, 40, "검정");
		cp.draw();
		cp.draw(false);

		System.out.println("==========");
		ColorPoint cp2 = new ColorPoint(30, 40, "빨강");
		cp2.draw();
		
		//	부모 타입으로 자식을 참조할 수 있다
		Point cp3 = new ColorPoint(50, 100, "파랑");
		cp3.draw();
	}

}