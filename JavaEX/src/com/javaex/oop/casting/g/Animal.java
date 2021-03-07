package com.javaex.oop.casting.g;
//03번ppt - 44p/62

public class Animal {
  //필드만들기  애완동물 이름설정
	protected String name ;
	
	
	//생성자 만들기 
	public Animal (String name) {
		this.name = name;
		
	}
	//메서드
	public void eat () {
		System.out.println(name +" 이 먹고 있습니다. ");
		
	}
	public void walk (){
		System.out.println(name +" 이 걷고 있습니다. ");
		}
}
