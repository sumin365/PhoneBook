package com.javaex.oop.goods.v2.e;
//ppt03 -19p
//v2. 필드의 접근제한  
//getter와 setter를 이용한 필드의 우회 접근

public class Goods {
//필드
	//public > protected > default > private 
	private String name; //----------------------------------------그래서 안 name(필드 name)은 this.name으로 한다. 
	private int price;
    
	//Getter /Setter 만들기
	
//1.name먼저 만들기
	//이건 밖에서 접근할 수 있도록 해야하기 떄문에 public으로
	public String getName() {
		return name ;
	}
	//외부에 있는 필드 데이터 name을 세팅할수있는 setter을 만들것이다.
		//setter는 돌려줄 필요가 없다.내부데이터에  세팅만 하면 되니까
	public void setName(String name) {	//밖에서 받은 데이터를 집어넣어햐함 
										//그런데 밖에 name(필드 name)과 안에있는 name(파라미터name)이 같아서 헷갈린다. 밖은 그냥 name
	
		this.name = name; /////this는 현재 instance을 말한다.(사용가능한 실제객체 )!!!!!!!!!!!!
	}
	
//2.price 만들기
   public int getPrice() {
	   return price;
   }

   public void setPrice(int price) {
	   this.price = price;
   }
    
//3.츨력용 메서드 - 리턴 필요없어서 void로 설정
   public void showInfo() {
	   System.out.printf( "상품이름: %s%n가격: %d원%n",name , price);
	   
   }
}
