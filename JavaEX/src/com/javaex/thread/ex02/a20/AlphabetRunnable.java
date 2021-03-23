package com.javaex.thread.ex02.a20;


////ppt05-7p/13
////방법2-   run메서드만 구현, thread의 생성자로 전달 
//        -   thread를 상속받은 것이 아니기 떄문에 thread,getName을 사용할 수 없다. 

public class AlphabetRunnable implements Runnable {
	
	@Override
	public void run() {
		//main  thread : A~Z까지 출력
	
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(Thread.currentThread().getName()+ch ); //현재 이 객체의 thread를 얻어낼 수 있다.여기에 getName하면 됨  
			
			
			try{//Thread도 반드시 오류처리해줘야하는 cheacked다
				Thread.sleep(300); //잠시 thread 대기 300ms =0.3s멈춤
			}catch (InterruptedException e ) {
				e.printStackTrace();
			}

	}

}
}