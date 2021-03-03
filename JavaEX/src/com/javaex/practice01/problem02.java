package com.javaex.practice01;

import java.util.Scanner;

public class problem02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
	    int num = scanner.nextInt();                                           //3
	    
	    for (int row = 1; row <= num ; row++) {                                //1                2             3
	    	for (int col = 1; col <=row ; col++) {                                  //1           22            333
	    		System.out.print(row);  //System.out.println(row);하면 안됨 
	    	}
	    	System.out.println();
	    }
	    scanner.close();

	}

}
