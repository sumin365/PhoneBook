package com.javaex.thread.ex01.a20;
//ppt05-4-5p/13

public class MainThread1 {
	public static void main(String[] args) {
		//main thread의 흐름과 다른 별도의 작업흐름을 만들어보자  -> thread를 만들어보자 
		//방법1 .Thread상속  (extends Thread)새로운 thread를 만들어보자  :  상속받은 파일에서 override로 thread내부 로직을 정밀하게 제어 가능
		//-> thread를 만들어보자 
		Thread thread = new DigitThread();
//		쓰레드 시작
			thread.start();	//start() 메서드 내에서 run 메서드를 대신 수행 하므로 run메소드 호출하지마
//			주의 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//			thread.run();	//	-> 일반 메서드로 run을 수행한 것
		//main  thread : A~Z까지 출력
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread:" +ch );
			
			
			try{//Thread도 반드시 오류처리해줘야하는 cheacked다
				Thread.sleep(300); //잠시 thread 대기 300ms =0.3s멈춤
			}catch (InterruptedException e ) {
				e.printStackTrace();
			}
			
			
		} 
	}
}
