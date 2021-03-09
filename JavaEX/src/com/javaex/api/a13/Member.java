package com.javaex.api.a13;
//ppt04-25p/69

//사용자 정의 클래스를 비교할 때 -sort작업할때(앞에서부터 계속 비교비교하면서 나아가야하니까 
//comparable 인터페이스를 구현하고 있어야 한다. -비교가능하도록
///comparable 인터페이스내의 모든 메소드를 override로 compareTo해주기  
	
	public class Member implements Comparable{
	 //필드
		String name;
	//생성자
	public 	Member (String name ) {
		 this.name =name;
	 }
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	
	
	////사용자 정의 클래스<<<<<< 정렬>>>>>>>>
	//두 객체의 대소 비교 로직을 넣어야 한다. 
	@Override
	public int compareTo(Object o) {
		// 두 대상이 같으면 0
		// 앞의 것이 작으면 -1
		// 앞의 것이 큰경우 +1
		//비교 대상인 (매개변수)파라미터 o 가 member인지 확인해야 한다. 비교가능한 대상인가를 확인
		if (o instanceof Member) {
			Member other = (Member)o;
			return name.compareTo(other.name); //other과 name을 순서대로 비교하면 된다. 라는의미 
			                                   //두 객체의 필드 name의 선후관계를 비교하겠다라는 의미 
			//============== =======================================================================================================핸드폰 사진과 비교해보기 
		}
		return 0;
	}
	}
