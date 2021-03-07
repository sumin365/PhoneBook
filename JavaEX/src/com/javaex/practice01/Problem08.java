package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		//몇번의 루프를 돌려야 할지 모르니까 무한loop
		 Scanner scanner = new Scanner (System.in);
		 
		 int balance  = 0;
		 boolean run = true;   //굳이??????????????????????????써야하나?케이스 4보면 알수 있다 
		 
		 while(run) {
			 System.out.println("================================");
			 System.out.println("1.입급  | 2.출금  | 3.잔고  |4. 종료");
			
			 System.out.println("================================");
			 System.out.println("선택>> ");
			 int menu = scanner.nextInt();
			 
			 int amount =0;
			 
			 switch (menu) {
			 case 1: 
				 System.out.println("입금액>> ");
				 amount = scanner.nextInt();
				 balance += amount;
				 break;
			 case 2: 
				 System.out.println("출금액>> ");
				 amount = scanner.nextInt();
				 balance -= amount;
				 break;
			 case 3: 
				 System.out.println("잔고액>> " + balance );
				 break;
			 case 4: 
				 run = false;
				 break;
			default :                                 // 다시 시작하는건가? switch문 안이니까 다시 시작
				System.out.println("다시 입력해 주세요. ");
			 }
		 }
	}

}
