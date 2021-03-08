package com.javaex.api.objectclass.v2.a11;
//ppt04- 06p/69

import com.javaex.api.a13.Member;
import com.javaex.oop.shape.v2.a8.Drawable;

//v2. equals
//사용자 정의 클래스는 내부 값을 비교하는 방법을 자바가 알지 못한다                //사용자 정의 클래스란?????  지금까지 썼던 것과 무슨 차이인가. 
//두 값을 비교할 수 있는 방법을 equals 메서드로 알려줘야 한다
		public class Point {
		//	필드
		private int x;
		private int y;
		
		//	생성자
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		//	 객체 출력 or 문자열과 연결될 때 반환되는 문자열 
		@Override
		public String toString() {
			return String.format("Point(x=%d, y=%d)", x, y);
		}
		
		//	두 객체의 값의 비교를 수행                                   //이해안감...........해결했음  0305-130116- 40min
		@Override
		public boolean equals(Object obj) { // obj은  LangClassTest에서 p2로 들어간다. .equals을 실행했으니까 
			if (obj instanceof Point) {
				//	obj -> 캐스팅
				Point other = (Point)obj;
				return this.x == other.x && this.y == other.y;
			}
			//	다른 타입은 비교방법 정의 안되므로 부모의 equals 값을 그냥 리턴
			return super.equals(obj);
		}	
		
//      package com.javaex.oop.casting.a7;
//      public class CastingEx {
//		//	중요: 다운캐스팅을 하기 전에 반드시 해당 인스턴스의 설계도 클래스를 인스턴스화 한 것인지 확인
//		if (pet instanceof Dog) {	//	개 클래스?  애완동물이 개로 들어가도된다면
//			((Dog)pet).bark();
//		} else if (pet instanceof Cat) {	//	고양이 클래스?
//			((Cat)pet).meow();
//		}
		
//      package com.javaex.oop.shape.v2.a8;
//		public class ShapeApp {
//		private static void drawTest(Object obj) {
//			//	obj -> Drawable 인터페이스 내부에 draw();    //obj를  Drawable로 Casting?????해준다음 불어줘야한다. ===================??Drawable이 더 큰개념??인가
//			//	참조 타입이 인터페이스여도 Casting 가능
//			if (obj instanceof Drawable) {	//	Drawable 인터페이스를 구현한 객체인가?
//				((Drawable)obj).draw();
//			} else {
//				System.out.println("그리기 객체가 아닙니다.");
//			}
//		}

//		package com.javaex.api.a13;
//		public class Member implements Comparable{
//		@Override
//		public int compareTo(Object o) {
//			// 두 대상이 같으면 
//			// 앞의 것이 작으면 
//			// 앞의 것이 큰경우 
//			//비교 대상 파라미터 o가 member인지 확인해야 한다. 비교가능한 대상인가를 확인
//			if (o instanceof Member) {
//				Member other = (Member)o;
//				//=====================================================================================================================핸드폰 사진과 비교해보기 
//			}
//			return 0;
//		}
//		}
		}