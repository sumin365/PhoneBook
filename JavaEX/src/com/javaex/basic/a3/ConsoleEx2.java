package com.javaex.basic.a3;

//클래스 임포트는 클래스 바깥쪽에서 입력해야한다.
import java.util.Scanner;

public class ConsoleEx2 {

	public static void main(String[] args) {
		//consoleOutputEx();
		consoleInputEx();

	}
	
	
//콘솔 출력
	private static void consoleOutputEx() {
		//표준 출력 (stdout) : System.out
		//표준 에러 (stderr) : System.err  2개 동일하다. 
		//메서드 print() - 출력후 개행을 하지 않음
		//매서드 println() - 출력 후 개행
		//printf() - 포멧 출력 - String 항목에서 정리
		System.out.print("Hello");
		System.out.println("Java");
		System.out.println("New line");
		
		//이스케이프 문자 
		//  \n(개행) ,    \t(탭),   \"(따옴표),  \\(역슬래시)
		System.out.println("Hello \nJava");    //강제 개행
		System.out.println("Hello \t\tJava");    //탭
		System.out.println("Hello \"Java\"");    
		
		String filePath = "D:\\myfolder\\myfile.txt";   //역슬래시
		System.out.println(filePath);    
	}
	
		

//콘솔입력  - 75p 아래문제 풀어보기- 이름과 나이를 입력받아 출력하는 프로그램을 작성하세요
	
		//스캐너 불러주고 - //클래스 임포트는 클래스 바깥쪽에서 입력해야한다.  -> import java.util.Scanner;
		
		private static void consoleInputEx() {
			 Scanner scanner = new Scanner (System.in);  //표준입력장치 (키보드)
            		System.out.print("이름은?");
            		String name = scanner.next(); //문자열 입력
            		System.out.print("나이는?");
            		int age = scanner.nextInt(); //숫자 입력
            		System.out.println("당신의 이름은 " +name + "이고 나이는 "+ age + "입니다. ");
            		//자원을 사용한 후에는 반드시 !!!! 닫아주자
            		scanner.close();
            	
            	
           
			
		
	}
}
