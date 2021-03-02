package com.javaex.basic.types.b;
//정수 타임 연습
//바이트 쇼트 인티져 (인트)  롱
public class IntLongEx2 {

	public static void main(String[] args) {
		
		int intVar =2021;
		//타입의 범위를 넘어가는 값을 할당 할 수 는 없다.
		int intVar2;
		//intVar2 = 123456789012345;  범위초과해서 안됨
		long longVar =2021;
		long longVar2 = 123456789012345L;//long임을 확인해야한다.   L or l 둘중 하나 써도 가능
	
		short s1=100;
		short s2 =200;
		//short result = s1+s2;   //int 변환되어야 한다. 
		//정수 정수 합산할 떄는 int로 변환되서 연산이 된다. 
		int result = s1+s2;
		System.out.println(s1 + "+" + s2 + "=" + result);
		
		
		int bin, oct, hex;
		bin = 01100;  //원래는 0b1100인데 왜 오류가 뜨지 0b를 접두어   2진수
		oct = 072;  //0을 접두어   8진수
		hex= 0xff; //0x를 접두어  16진수
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}

}
