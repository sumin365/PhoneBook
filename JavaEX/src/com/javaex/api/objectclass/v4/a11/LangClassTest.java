package com.javaex.api.objectclass.v4.a11;
//ppt04- 12p/69

public class LangClassTest {
	public static void main(String[] args) {
		Scoreboard s1 = new Scoreboard(new int[] { 10, 20, 30, 40, 50 });
		System.out.println("s1 = " + s1);
		
		//	복제
		Scoreboard s2 = s1.getClone();
		System.out.println("s2 = " + s2);
		
		System.out.println("s1과 s2는 같은 객체 ? " + (s1 == s2));  // ->false  다른 객체가 되었지만 s2 내부참조자료를 바꾸면 s1도 같이 바뀐다. 즉 내부필드 주소가 동일하니까
		                                                         //따라서 필드 필드를 끊어버려야한다. s1필드를 새로 복제후 다시 s2에 연결하면된다. 
		 
		//	복제된 객체의 내부 참조 자료를 변경                   ////ppt03- 18,19p/62
//		s2.getScores()[2] = 100;                         //V3에서는 p2.setX(20);로 셋팅을 바꾸기 //   p2.getX()=20;로 읽기    =============V3와 무슨차이????????
		int scores[] = s2.getScores();
		scores[2] = 100;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		
		//	내부 필드의 주소 비교
		System.out.println("s1.scores와 s2.scores는 같은 객체 ? " 
				+ (s1.getScores() == s2.getScores()));
		
	}
}