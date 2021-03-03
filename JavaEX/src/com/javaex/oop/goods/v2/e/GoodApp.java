package com.javaex.oop.goods.v2.e;

public class GoodApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		//참조변수가 생김 
		
		//name price의 정보가 은닉되어 있어서 오류가 남 
		
		notebook.name = "LG Gram";
		notebook.price = 1500000;
		
		Goods smartphone = new Goods();
		smartphone.name = "iPhone SE";
		smartphone.price = 650000;
		
		System.out.printf("%s, %d원%n",
				notebook.name, notebook.price);
		System.out.printf("%s, %d원%n",
				smartphone.name, smartphone.price);
	}

}
