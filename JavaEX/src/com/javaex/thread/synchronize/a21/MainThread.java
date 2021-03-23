package com.javaex.thread.synchronize.a21;
//3
////ppt05-8p/13에 설명 그려놓음 
public class MainThread {
	public static void main(String[] args) {
		SharedMemory memory = new SharedMemory();
				    //여기 메모리가 ------|
		//쓰레드 생성                    |일로 내려감 
		User user1 = new User("철수", memory, 100); //공유객체를 공유한 것이다. 
		User user2 = new User("영희", memory, 50);
		
		user1.start();
		user2.start();

	}

}

