package com.javaex.api.objectclass.v4.a11;
//ppt04- 12p/69
//<<<<<<<<<<<<<<깊은복제>>>>>>>>>>>>>>>>>>>>
import java.util.Arrays;

import com.javaex.api.objectclass.v3.a11.Point;

public class Scoreboard implements Cloneable {
	// 참조형 필드
	private int[] scores;

	// 생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	// getter/setter
	public int[] getScores() {
		return scores;
	}

//	public void setScores(int[] scores) {
//		this.scores = scores;
//	}

	@Override
	public String toString() {                                     ///////LangClassTest 에서 어디있을까
		                                                           //package com.javaex.api.objectclass.v1.j;에서 toString() : 출력시 or 문자열과 연결될 때 자동으로 호출 -> 패키지 정보.클래스명@16진수메모리 형태로 나온다.
                                                                  //그렇지만 우리가 원하는건 Point(x=10, y=10) 이형태 . 그래서 toString()을 override해서 우리만의 포맷을 새로 만들면 된다. 
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}

	
	
	public Scoreboard getClone() {
		Scoreboard clone = null;

		try {
			clone = (Scoreboard) clone(); // 복제
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}
////	복제 메서드 - point 클래스에서 복제메서드를 수행하면 똑같은 객체를 만들어 반환하는 메서드를 만들어보자 
//		public Point getClone() {
//			//	1.객체 복제
//			Point clone = null; //2.새 객체를 반환해줘야하기 때문에 비어있는 새로운 포인트를 만들어줘야한다. 
//			                   // 7.만약 복제에 성공했다. 똑같이 생긴 새로운 객체가 여기에 할당이 될 것이고 그렇지 않으면 null상태로 비어있을 것이다.그래서 return clone;해줄것이다
//			
//			try {	//4.	시도해서 예외가 있으면 처리하겠다
//				clone = (Point)clone();   // 3.클론메서드를 사용할 수 있게 되었다.  클론을 하면 객체가 튀어나오니까 point 로 casting해줘야한다. 그런데 clone같은 시스템관련 메소드들은 예외발생할 가능성이 높다. 그래서 예외를 처리해줘야한다
//			                              //5.예외발생하면 프로그램이 종료된다. 그렇지만 종료안시키고 내가 처리해주겠다라는 의미가 다음줄 이다
//			
//			} catch (CloneNotSupportedException e) {  
//				//	6.예외 발생을 처리하는 로직
//				e.printStackTrace();
//			}
//			
//			return clone;
//		}
	
	
	
	
	
//<<<<<<<<<<<<<<깊은복제>>>>>>>>>>>>>>>>>>>>	 이거 먼저 끝내고 위에거 try catch 구문 하면된다. 
	//	깊은 복제를 위해 내부 참조 필드를 복제
	//	clone 메서드를 재정의(Override)
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//	먼저 얕은 복제를 시도
		Scoreboard clone = (Scoreboard)super.clone();
		//	내부 참조 필드 복제 (깊은 복제) 
		clone.scores = Arrays.copyOf(scores, scores.length);
		return clone;
	}

}
