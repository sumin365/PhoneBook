package com.javaex.practice01;

import java.util.Scanner;

public class problem05 {

	public static void main(String[] args) {
		int max = 0 ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
	    for (int i =1; i<=5; i++) {
	    	 System.out.print("숫자: ");
	    	 int num = scanner.nextInt();
	    	 //첫번쨰 입력 값은 그냥 max에 넣어야 한다. 
	    	 if (i ==1 ||num > max ) max= num;
	    	 
	    }
	    System.out.println("최댓값은 "+ max + "입니다. ");
	    scanner.close();
	}

}
