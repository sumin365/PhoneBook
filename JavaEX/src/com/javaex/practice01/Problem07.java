package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner (System.in);
		// loop 가 2개 필요할듯
		 //바깥 loop -> 게임을 더 할 거야??? -> while
		 //안쪽 loop -> 게임로직
		 while (true) {
		
			 int num = (int)(Math.random()*100)+1;
			 System.out.println("============");
			 System.out.println("게임을 시작합니다.");
			 System.out.println("============");
			 
			 while (true) {
				 System.out.print(num +">>");
				 int inputNum = scanner.nextInt();
				 if (inputNum ==num ) { //================================값이 계속 변하니까 equals사용하지마
					 System.out.println("정답입니다.");
					 break;
				 }else if   (inputNum <num ) {
					 System.out.println("더 높게");
					 
				 }else {
					 System.out.println("더 낮게");
				 }
			 }
			 
			 
		     System.out.print("게임을 종료하시겠습니까? (y/n)>> ");
			 String retry = scanner.next();   
			 if (retry.equals("y")) {//===============================false면 while문이니까 다시 돈다. 
				 break;
			 
			 
		 }
		
		
		//랜덤값

	}
		 scanner.close();
}
}
