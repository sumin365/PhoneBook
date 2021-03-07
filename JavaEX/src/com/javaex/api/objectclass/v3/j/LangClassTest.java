package com.javaex.api.objectclass.v3.j;
//ppt04- 11p/69

public class LangClassTest {
	public static void main(String[] args) {
		Point p = new Point(10, 10);
		Point p2 = p;	//	참조 복사 -> 주소만 복사 : 동일 객체
		
		System.out.println("p => " + p);
		System.out.println("p2 => " + p2);
		
		
		p2.setY(30);
		
		System.out.println("p => " + p);
		
		
		
		
		
////<<<<<<<<v3. 얕은 복제>>>>>>>>>
		
		Point p3 = new Point(10, 10);
		Point p4 = p3.getClone();
		
		System.out.println("p3 => " + p3);
		System.out.println("p4 => " + p4);
		
		p4.setX(20);
		p4.setY(30);
		
		System.out.println("p3 => " + p3);
		System.out.println("p4 => " + p4);
	}
}