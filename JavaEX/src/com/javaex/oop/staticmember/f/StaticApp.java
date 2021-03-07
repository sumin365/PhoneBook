package com.javaex.oop.staticmember.f;

public class StaticApp {

	public static void main(String[] args) {
//		1번째 로드: static 호출 -> 생성자 호풀
			StaticEx s1 = new StaticEx();                           
			System.out.println("참조카운트:" + s1.refCount);
//			static 멤버는 new를 하지 않고도 호출할 수 있다.
			System.out.println("참조카운트:" + StaticEx.refCount);
			
			//	2번째 로드: static 블록은 수행되지 않음
			StaticEx s2 = new StaticEx();
			System.out.println("참조카운트:" + StaticEx.refCount);
			
			//	해제
			s1 = null;    //해제가 일어났으니까 finalize가 호출되야 하지만 아무것도 안 찍혔다. 바로 garbage collecter가 작동되지 않는다.   
			System.out.println("s1 해제");
			System.out.println("참조카운트:" + StaticEx.refCount);
			
			//	임의로 gc 부르지 말자!   그냥 설명상 한것뿐
			System.gc(); // 가비지 콜렉터 호출
			try {//몰라도됨
				Thread.sleep(1000); //	1초 대기
				System.out.println("참조카운트:" + StaticEx.refCount);
			} catch (Exception e) {
				
			}
		}

	}

/*               - 첫번째로드 할떄 한번도 staticEx가 로드 되지 않아서 먼저 로드가 되었다. 
=> Static Block  -  아직 설계도가 로드 되지 않았다.  생성하기 위해서 설계도가 로드되야한다
=> Instance 생성  -   인스턴스생성을 위해 생성자가 호출되었다. 
=> 참조 Count:1   -  생성자 내부에서 참조 카운트를 하나 늘렸다ㅣ
참조카운트:1
참조카운트:1



두번째로드 할떄 이미 생성자 설께도가 메모리상에 로드가 되어있기 떄문에 staticEx가 로드 되지 않았다.  
=> Instance 생성  - 생성자가 호출되었다. 
=> 참조 Count:2
참조카운트:2
*/