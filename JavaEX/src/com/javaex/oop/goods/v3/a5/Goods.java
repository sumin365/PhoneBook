package com.javaex.oop.goods.v3.a5;
//ppt 03 - 26p [위문제]
//v3.생성자 
//new 키워드와 함께 사용되고 객체의 초기화를 담당한다. 


public class Goods {
	//	필드
	private String name;
	private int price;
	
	//	코드 내에 생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가
	//	사용자 정의 생성자가 있으면 기본 생성자를 추가하지 않는다       ------그래서에러????????????
	//기본생성자가 없는 클래스다 그러니까 바꾸자   사용자 정의 생성자를 활용하자 ========================
	
	//	모든 필드를 초기화하는 생성자
	//생성자의 이름은 클래스와 같아야 한다.
	//리턴값이 없다. 그렇지만void쓰지 않는다. 
	//메소드처럼 파라미터를 전달받을 수 있다. 
	public Goods(String name, int price) { // 클래스 명과 동일 //파라미터 전달 
		this.name = name;                  //초기화 작업 - 외부 값을 내부에 넣기 
		this.price = price;
	}
	
	//	Getter/Setter
	// 장점 -> 데이터의 변경을 제한 할 수 있다 
	//	getter만 있고, setter가 없으면 -> ReadOnly(읽기 전용)
	public String getName() {
		return name;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	//	출력용 메서드
	public void showInfo() {
		System.out.printf("상품 이름:%s%n가격: %d원%n", name, price);
	}
}