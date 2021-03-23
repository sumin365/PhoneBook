package com.javaex.thread.ex02.a20;
////ppt05-7p/13

//public class MainThread1 {
//	public static void main(String[] args) {
//		//main thread의 흐름과 다른 별도의 작업흐름을 만들어보자  -> thread를 만들어보자 
//		//방법1 .Thread상속  (extends Thread)새로운 thread를 만들어보자  :  상속받은 파일에서 override로 thread내부 로직을 정밀하게 제어 가능
//		//-> thread를 만들어보자 
//		Thread thread = new DigitThread2();
////		쓰레드 시작
//			thread.start();	//start() 메서드 내에서 run 메서드를 대신 수행 하므로 run메소드 호출하지마
////			주의 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
////			thread.run();	//	-> 일반 메서드로 run을 수행한 것
//		
//			System.out.println("MainThread 종료!"); 
//			
//			//runable로 만든 인터페이스 클래스를 집어넣자. 
//			Thread thread2 = new Thread(new AlphabetRunnable());
//	     	thread2.setName("AlphabetRunnable");
//			//생성자에 run메서드가 구현된 runnable객체를 전달한다. 
//		    thread.start();
//		    
//		    
//			//	Working Thread(thread.join();와thread2.join();) 의 제어권을 유지하기 위해
//			//	작업 흐름을 main 쓰레드에 합류
//		    try {
//				thread.join();
//				thread2.join();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//	}
//}  위에 어디가 틀린건지 모르겠네 아래는 선생님꺼 복사한것

public class MainThread1 {

	public static void main(String[] args) {
		//	main thread의 흐름과 다른 별도의 작업 흐름
		Thread thread = new DigitThread2();
		thread.setName("DigitThread");
		//	쓰레드 시작
		thread.start();	//	start() 메서드 내에서 run 메서드를 대신 수행
		//	주의 
//		thread.run();	//	-> 일반 메서드로 run을 수행한 것
		
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.setName("AlphabetRunnable");
		//	생성자에 run 메서드가 구현된 Runnable 객체를 전달
		thread2.start();
		
		//	Working Thread의 제어권을 유지하기 위해
		//	작업 흐름을 main 쓰레드에 합류
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MainThread 종료!");
	}

}