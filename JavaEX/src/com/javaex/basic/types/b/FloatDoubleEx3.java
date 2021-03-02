package com.javaex.basic.types.b;
//실수
//float (4)   double (8)
//정밀도를 포기하고 표현 범위를 넓힌 자료형
//표현범위 : 중요!!!!!!!!!   byte < short < int (4) <  long (8) <  float(4) < double(8)
public class FloatDoubleEx3 {

	public static void main(String[] args) {
		float floatVar = 3.14159F;   // f  or F 둘다 가능
  		double doubleVar = 3.14159;  //실수형 기본은 double임
  		
  		
  		int intVar = 30000000;
  		floatVar = 3E7f;   //3*10^7이라는 뜻
  		doubleVar = 314159E-5;  // 3.14159라는 뜻
  		System.out.println("int: "+ intVar);
  		System.out.println("float: "+floatVar);
  		System.out.println("double: "+ doubleVar);
  		//부동소수점 계산의 유의점 : 정밀계산에 활용시에는 유의   그 예시는 다음줄
  		System.out.println(0.1*3);
  		
  		
		
	}

}
