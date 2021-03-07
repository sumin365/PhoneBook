package com.javaex.oop.goods.v3;

public class GoodApp {


	public static void main(String[] args) {
		Goods notebook = new Goods("LG Gram", 1500000);	//	사용자 정의 생성자 활용		
		Goods smartphone = new Goods("iPhone SE", 650000);
		
		notebook.showInfo();
		
		//	누군가 악의적, 실수로  가격을 바꿔도 Good파일에서 getter만 있고, setter가 없으면 -> ReadOnly(읽기 전용)이 됨
		/* 
		notebook.setPrice(15000);
		notebook.showInfo();
		*/
		
		System.out.printf("%s, %d원%n", 
				notebook.getName(), notebook.getPrice());
		notebook.showInfo();
		
		System.out.printf("%s, %d원%n",
				smartphone.getName(), smartphone.getPrice());
		smartphone.showInfo();
	}

}