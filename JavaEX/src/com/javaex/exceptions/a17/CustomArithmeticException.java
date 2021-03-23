package com.javaex.exceptions.a17;
//ppt03-56-62p/62

//<<<<<<<<<<"사용자 정의 Exception>>>>>>>>>>>>>>>	
public class CustomArithmeticException extends ArithmeticException {         //-만드는 방법   class만들때 superclass에서 Browse에서ArithmeticException검색후 클래스 만들기
	//예외상황정보를 담을 수 있는 필드 담기 
	//	필드
	private int num1;
	private int num2;
	
	//	생성자
	public CustomArithmeticException(String message, int num1, int num2) {
		//	부모 생성자 호출
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}
//getter만 만들기 setter는 셋팅 할 거니까  - select getters만 선택해서 만들기 
	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}
}