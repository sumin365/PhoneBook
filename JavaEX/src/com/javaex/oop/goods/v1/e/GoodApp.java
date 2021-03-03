package com.javaex.oop.goods.v1.e;

public class GoodApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		//참조변수가 생김 
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
