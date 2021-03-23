package com.javaex.thread.synchronize.a21;
//2
//메모리를 공유할 thread객체 유저를 만들자. 
////ppt05-8p/13에 설명 그려놓음 
public class User extends Thread {
	private SharedMemory memory;
	private int data;
	
	//	생성자
	public User(String name, SharedMemory memory, int data) {
		this.setName(name);	//	쓰레드의 이름 설정
		this.memory = memory;	//	공유 객체 설정
		this.data = data;
	}

	@Override
	//쓰레드가 시작되면 내가 전달받은 (SharedMemory memory) 공유메모리에 데이터에다가 . 내가 생성자로부터 받은 data를 집어넣을 것이다. 
	//그러면 public class SharedMemory 에 public synchronized void setMemory(int memory)<<- 여기에 100이 전달.int memory=100으로 전달후 출력됨 
	
	
	
	//쓰레드가 시작되려면 -일단 메모리가 있는지 확인해봐야한다. 
	public void run() {
		if (memory != null) {
			memory.setMemory(data); //이것을 테스트해보기 위해 public class MainThread 만들기 
		}
	}
}