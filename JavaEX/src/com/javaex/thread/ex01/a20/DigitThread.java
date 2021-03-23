package com.javaex.thread.ex01.a20;
//ppt05-4-5p/13
//방법1 .Thread상속  (extends Thread) :  thread내부 로직을 정밀하게 제어 가능

public class DigitThread extends Thread{

	@Override
	public void run() {
		// 실제  thread 실행로직 먼저 만들자 1~30까지 쓰기 
		for (int i=1 ; i<=30 ; i++) {
			System.out.printf("%s:%d%n", getName(), i ); // thread 네임까지 출력하게 만들자 
			
			try {
				Thread.sleep(300); //300ms멈춰라 0.3초대기라는뜻
				}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}

}
 