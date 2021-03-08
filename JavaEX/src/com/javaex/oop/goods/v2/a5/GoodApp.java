 package com.javaex.oop.goods.v2.a5;

public class GoodApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		//참조변수가 생김 
		
		//name price의 정보가 은닉되어 있어서 오류가 남 
//		notebook.name = "LG Gram";
//		notebook.Price= 1500000;
		
		//setter를 이용한 우회접근 
		notebook.setName( "LG Gram");
		notebook.setPrice( 1500000);
		
		
		
		Goods smartphone = new Goods();
		 
		//setter를 이용한 우회접근 
		smartphone.setName("iPhone SE");
		smartphone.setPrice( 650000);
		
		
		
		
		
		
		
		//getter를 이용한 우회접근
		System.out.printf("%s, %d원%n",
				notebook.getName(), notebook.getPrice());
		
		//객체가 내부에 가지고 있는 출력 기능 . 우리가 만든 메소드를 이용해서 출력하는 방법도 있다. 
		notebook.showInfo();
		
		
		
		System.out.printf("%s, %d원%n",
				smartphone.getName(), smartphone.getPrice());
		
		smartphone.showInfo();
	}

}
