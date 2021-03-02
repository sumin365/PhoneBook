package com.javaex.basic.types.b;

//변수연습
public class VarEX1 {
	public static void main(String[] args) {
		//변수 식별자 규정
		//문자 , 숫자, $, _ 조합으로 생성
		//숫자로 시작하면 안된다. 
		//키워드 (예약어) 사용할 수 없다. 
        //관례: (가급적 지켜줘야함) 소문자로 작성, 2개단어의 조합일 경우 뒷단어의 첫글자는 대문자로 한다.  
			//자바 클래스명으로 할 떄 :PaeaCase
			//자바 변수, 메소드 명을 할 떄 :camelCase  
			//snake_case: 리눅스나 c언어일때 
			//ekae-case :HTML, XML일때
		
		//초기화 필요 
		int myAge;  //선언
		myAge = 20; //초기화
		System.out.println("내 나이는: " + myAge); //조회
		//int myAge = 20; //선언 초기화를 동시에 가능
		//불가능한 경우 myAge = "아"  한번 선언되면 타입 변경 불가 
		
		//한번에 여러 변수 선언 할 때
		int v1=10, v2=20, v3=49;
		v1=v2=v3=40;
	}

}
