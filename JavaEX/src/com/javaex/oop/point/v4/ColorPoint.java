package com.javaex.oop.point.v4;
		
		//객체를 상속 받으려면 extends 키워드
		// extends안해도 최상위 부모는 java.lang.Object
		public class ColorPoint extends Point {
	        //오류가 발생했음 왜일까??	
            //생성자를 만들지 않으면 기본 생성자를 선택한다
		    /*자바가 기본적으로 아래있는 코드를 집어넣었다 
			public ColorPoint() {
				//	특별히 명시하지 않으면 부모의 기본 생성자를 선택한다
				super();	//	->그런데 이런 기본생성자는  없어요  다르게 써야한다. 
			}
			*/	
			
		//	필드- 자식에만 있는 변수들 초기화시키기
		private String color;
		
		
		//	생성자
		public ColorPoint(int x, int y, String color) {
			//오류 발생했었음 왜냐 특별히 명시하지 않으면 부모의 기본 생성자를 선택한다 ->그런데 이런 기본생성자는  없어요  다르게 써야한다. 그래서 아직까지 에러발생 
			super(x, y);	//	그래서 특별히 부모 생성자 호출
			this.color = color; //자신만의 인스턴스 변수를 담아줘야한다. 
		}
		
		//	getter/setter -color에 대한
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		//	부모로부터 draw 메서드를 물려받았지만, 다른 기능을 수행할 경우, Override (덮어쓰기)
		@Override	//	이 메서드는 오버라이드된 메서드임을 명시
		            //하는방법  - draw치고 ctrl + space바 후 override 체크하기
		public void draw() {
			//	오버라이드가 되어도 부모의 메서드는 남아있다
			//	부모의 메서드를 호출가능하다 ㅇ아래코딩으로 
			super.draw();
			//점[x=20, y=40]을 그렸습니다.로 결과가 나온다. 
			
			
	//방법 1 - x, y는 private이라서 getter/setter이용하기 
			System.out.printf("색깔점[x=%d, y=%d, 색상=%s]을 그렸습니다.%n",
					getX(), getY(), color);
		    }
    //방법2 - 부모로 부터 접근제한자를 바꿔주는것이다. 
	//point로 넘어가서 private를 protected로 바꾸기 (=상속받은 자식에서 접근을 허용한다. )		
		@Override
		public void draw(boolean show) {
			String message = String.format("색깔점[x=%d, y=%d, 색상=%s]를 ", x, y, color);
			if (show) {	//	true
				message += "그렸습니다.";
			} else {
				message += "지웠습니다.";
			}
			System.out.println(message);
		}
		}