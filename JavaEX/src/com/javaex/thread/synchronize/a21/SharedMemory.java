package com.javaex.thread.synchronize.a21;
//1
public class SharedMemory {
	private int memory;

	public int getMemory() {
		return memory;
	}
////ppt05-8p/13에 설명 그려놓음 
	//	임계 영역 : 여러곳에서 동시에 사용하면 안되는 영역 -> synchronized 추가하기 public synchronized void setMemory(int memory)
	//	사용이 끝날 때까지 메서드가 잠김(Lock);
	public synchronized void setMemory(int memory) { //<--바깥에서 받은 메모리를 여기에(int memory) 셋팅해주고 잠시  기다리기 
		this.memory = memory;
		try {
			Thread.sleep(1000); //	1초 대기
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	
	
}
