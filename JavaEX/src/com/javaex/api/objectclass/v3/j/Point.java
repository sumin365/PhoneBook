package com.javaex.api.objectclass.v3.j;
//ppt04- 11p/69

//<<<<<<<<v3. 얕은 복제>>>>>>>>>
//값이 같은 새로운 객체를 복제하는 것
//단순히 필드만 복제하는 것: 얕은 복제
		public class Point implements Cloneable {	//	clone() 메서드가 활성화
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
		
		//	두 객체의 값의 비교를 수행
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Point) {
				//	obj -> 캐스팅
				Point other = (Point)obj;
				return this.x == other.x && this.y == other.y;
			}
			//	다른 타입은 비교방법 정의 안되므로 부모의 equals 값을 그냥 리턴
			return super.equals(obj);
		}
		
		
//여기서부터  V2랑 다름=======================================================================================================
		//	밖에서 확인하기 위해서 getter/setter만들자  구현시키기 방법  -> 우클릭 -source 클릭  - Generate getter and setter 클릭
		public int getX() {
			return x;
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public int getY() {
			return y;
		}
		
		public void setY(int y) {
			this.y = y;
		}
		
		//	복제 메서드 - point 클래스에서 복제메서드를 수행하면 똑같은 객체를 만들어 반환하는 메서드를 만들어보자 
		public Point getClone() {
			//	1.객체 복제
			Point clone = null; //2.새 객체를 반환해줘야하기 때문에 비어있는 새로운 포인트를 만들어줘야한다. 
			                   // 7.만약 복제에 성공했다. 똑같이 생긴 새로운 객체가 여기에 할당이 될 것이고 그렇지 않으면 null상태로 비어있을 것이다.그래서 return clone;해줄것이다
			
			try {	//4.	시도해서 예외가 있으면 처리하겠다
				clone = (Point)clone();   // 3.클론메서드를 사용할 수 있게 되었다.  클론을 하면 객체가 튀어나오니까 point 로 casting해줘야한다. 그런데 clone같은 시스템관련 메소드들은 예외발생할 가능성이 높다. 그래서 예외를 처리해줘야한다
			                              //5.예외발생하면 프로그램이 종료된다. 그렇지만 종료안시키고 내가 처리해주겠다라는 의미가 다음줄 이다
			
			} catch (CloneNotSupportedException e) {  
				//	6.예외 발생을 처리하는 로직
				e.printStackTrace();
			}
			
			return clone;
		}
		}