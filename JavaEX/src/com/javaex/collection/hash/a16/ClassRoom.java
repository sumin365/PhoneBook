package com.javaex.collection.hash.a16;
//ppt04-64p/69

public class ClassRoom {
	//	필드
	private String subject;
	private String roomName;
	
	//	생성자

	
	public ClassRoom(String subject, String roomName) {
		this.subject = subject;
		this.roomName = roomName;
	}
	
	//1.classroom의 생성자를 만들어 준다. 
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	 
	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}

	//hashcode 동등조건 비교 
	//1. hashcode 비교  2. equals 비교  3.모두 같으면 동등객체다
	
	//1.subject가 같으면 hashcode가 같게 설정한다. 
    //2.roomname이 달라도  subject가 같으면 	동등한 객체라고 설정한다. equals을 통해서 
	
	//1.classroom의 생성자를 만들어 준다. 
	//2.hashcode 를 override해준다. 
	//3.equals를 override해준다.
	
	
	//2.hashcode 를 override해준다. 
	@Override
	public int hashCode() {
		// 가정: 과목은 같으나 강의실은 다를 수 있다
		//	과목의 hashCode가 같으면 식별자가 같은 것으로 하자
		return subject.hashCode();
	}
	//3.equals를 override해준다.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ClassRoom) {
			//	다운 캐스팅
			ClassRoom other = (ClassRoom)obj;
			return subject.equals(other.subject);
		}
		return super.equals(obj);
	}


}