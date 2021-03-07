package com.javaex.practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// 입력한 값이 홀수면 1부터 짝수면 2부터 더하기 시작 => for 이용하자 
       Scanner scanner = new Scanner (System.in);
       System.out.print("숫자를 입력하세요: ");
       int num = scanner.nextInt();
       int startNum = (num %2 ==0)?2:1;
       int sum = 0;
       for (int i =startNum ; i <= num ; i +=2) {
    	   sum  +=i;
       }
       System.out.println ("total: " + sum  );
       scanner.close();
       }

}
