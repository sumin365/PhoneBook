package com.javaex.practice01;//Practice01-2_Java_Basic.pdf

public class problem01 {

	public static void main(String[] args) {
//[문제] 1에서 100까지의 수에서 5의배수 이면서 7의 배수인 수를 출력하세요 
       for (int num = 1; num <=100; num++ ){
    	   if( num% 5==0 && num%7==0) {
    		   System.out.println(num);
    	   }
    	   }
       }

}
