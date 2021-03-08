package com.javaex.api.a13;

//사용자 정의 클래스를 비교할 때 ==============================????????????????????
//소트 같은것 
//comparable 인터페이스를 구현하고 있어야 한다. 
//비교가능하도록

	
	public class Member implements Comparable{
	 String name;
	
	public 	Member (String name ) {
		 this.name =name;
	 }
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	
	//두 객체의 대소 비교 로직
	@Override
	public int compareTo(Object o) {
		// 두 대상이 같으면 
		// 앞의 것이 작으면 
		// 앞의 것이 큰경우 
		//비교 대상 파라미터 o가 member인지 확인해야 한다. 비교가능한 대상인가를 확인
		if (o instanceof Member) {
			Member other = (Member)o;
			//=====================================================================================================================핸드폰 사진과 비교해보기 
		}
		return 0;
	}
	}
