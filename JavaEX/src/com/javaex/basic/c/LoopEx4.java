package com.javaex.basic.c;

import java.util.Scanner;

public class LoopEx4 {//반복문에 관한 모든것

	public static void main(String[] args) {
		//whileEx01();
		//whilegugudan(); //브레이크 포인트 
//doWhileEx();
//infLoop();
	//	forGugudan();
	//	continueEx();
	//	breakEx();
	//	nestedFor();
		nestedForStar();
	//	sixRandom();
	}

	
//while문
//p89예제 풀이
	private static void  whileEx01() {
		int i=0;
		while (i<=5) {
		System.out.println("I like java"+ i);
		//종료될 수 있는 상황을 개발자가 설정해야한다.
		//i++;    
		//i=i+1;  
		i+=1;
		}
	}
	
//p90예제풀이
	private static void whilegugudan() {
		Scanner scanner =new Scanner (System.in); //////////////////////다시보기===================================
		System.out.print("단을 입력하세요:");
		int num = 1;//
		
		int dan = scanner.nextInt();
		while (num<=9) {
			System.out.println(dan + "*" + num + "=" + (dan * num));
			num++;
		}
		scanner.close();
	}
	
		
	
//프로그램의 흐름과 변수의 변화를 확인 : 디버그 작업 이라고 한다. ==============================
//패키지   클라스   메인  매소드  해당 매소드로     
	
	
//91p - 최소 1회 반드시 실행되어야 하는 반복문	
	private static void doWhileEx() {
		int total = 0 ; //합산결과
		Scanner scanner = new Scanner(System.in);
		int num = 0 ; //사용자 입력 값
		
		do {
			System.out.print("정수를 입력하세요 [0이면 종료]:");
			num = scanner.nextInt();
			total = total + num;
			//total +=num ;  같은 말이다.
			
		} while (num != 0 ); //num가 0 이 아니면 반복 
	System.out.println ("합산값:" +total);
	scanner.close();
	
	}
	
	
	private static void infLoop() {
		//while, do~while 의 경우 반복조건은 개발자가 책임
		//반복조건이 true 일 경우 무한 루프에 빠진다.
		//특별한 경우가 아니라면 무한루프는 피하도록 한다.
		while (true) {
			System.out.println("Press Terminate Button");
			
		}
		
	}
	
	
	private static void forGugudan() {  //녹화를 못하므ㅡㅜㅜㅜㅜㅜ   점도 한번 찍어야 하느,ㄴ데 ?
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요 :");
		int dan = scanner.nextInt();
		for (int i = 1 ; i <=9; i++) {
			System.out.print(dan + "*" + i  +"=" + (dan *i));
		}
		}
	
//==========================================================================================================	
//반복의 횟수를 알수 있을 때 , 범위를 주어졌을 때 : for
//반복의 횟수를 알 수 없을 때 , 법위를 주어지지 않았을 때 : while
//p100 예제 풀이
	private static void continueEx() {
		//먼저 루프로 1~ 20 찍어내자  //2배수  3배수를 제외해보자
		for (int i=1; i<=20; i++) {
			if (i%2==0 || i%3==0) continue;
			
			System.out.println(i);
		}
	}
	
//102p 예제풀이 
	private static void breakEx() {
		//범위가 안정해져 있으니 일단 무한루프로 돌리자
		int num = 1;
		while (true) {
			if (num %6 ==0 && num%14==0) break;  //break문을 만나면 루프를 탈출한다. 
			num++;
			
		}
		System.out.println(num);
	}
	
//101p 위에 예제풀이 - 2단에서 9단까지 구구단 출력
	private static void nestedFor() {
		for(int dan = 2; dan <= 9 ; dan++) {
			System.out.println(dan+"단");
			//중첩 loop ======================================================================================
			for (int num =1 ; num <= 9 ; num ++) {
				System.out.println(dan+"*"+ num + "=" + (dan * num));
			}
		}
	}
//101p - while 문으로 작성해보자 - 숙제
	
	
//101p - 아래 문제 풀이 	
	private static void nestedForStar() {
		int rowCount  = 5 ; //몇줄할지 설정
		for (int row = 1 ; row <=rowCount; row ++) {  //row 행
			for (int col = 1; col <= row; col ++) {   //col 열
				System.out.print("*");
			}
			System.out.println();//개행한다. 
		}
	}
	
	//101p - while 문으로 작성해보자 - 숙제
	
	
	
//104p 1~45 정수난수중 6개 출력
	private static void sixRandom() {
		for (int i=1; i<=6; i++) {
			System.out.println((int)(Math.random()*45)+1);
			
		}
	}
	
	//103p - while 문으로 작성해보자 - 숙제
	
}