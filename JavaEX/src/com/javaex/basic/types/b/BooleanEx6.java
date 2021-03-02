package com.javaex.basic.types.b;
    //불린형
	//조건의 결과 (참, 거짓)을 다루는 자료형
	//값에 따라서 조건문, 제어문을 이용 흐름제어에 사용 
public class BooleanEx6 {
  
	public static void main(String[] args) {
	 boolean b1 = true;
	 boolean b2 = false;

	 System.out.println(b1);
	 System.out.println(b2);
	   
	 //비교, 논리 연산의 결과로 추출된다. 
	 int v1 = 3, v2=5;
	 boolean result = v1<v2;
	 System.out.println(v1 + "<" + v2 + "?" + result);
	}

}
