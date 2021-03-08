package com.javaex.api.generics.v1.a14;

public class BoxApp {

	public static void main(String[] args) {
		IntBox intBox = new IntBox();
		intBox.setContent(2021);
		
//		값을 가져와 봅니다.
			int retVal = intBox.getContent();
			System.out.println("내용물:" + retVal);
			
			StringBox strBox = new StringBox();
			strBox.setContent("Java");
			
			String strVal = strBox.getContent();
			System.out.println("strBox 내용물:" + strVal);
			
			ObjectBox objBox = new ObjectBox();
			objBox.setContent(2021);
			
			ObjectBox objBox2 = new ObjectBox();
			objBox2.setContent("Java");
			
			//	내용물 확인
			//	내부 데이터가 Object여서 Java 컴파일러가 체크가 힘들어진다
			//	데이터를 불러올 때, 캐스팅 필요 -> 불편, 위험
			Integer retVal2 = (Integer)objBox.getContent();

		}

	}
	
		
		
//		오브젝트를 인티져에 못담는다. 
//		그래서 다운캐스팅이 필요하다. 
//		그래서ㅐ (Integer)붙이기 
//		
//		안쪽에 있는데이터가 오브젝트이기 떄문에 자바 컴파일러가정상으로 작동하는지 체크가 힘들어진다. 
//		데이터를 불러올 떄 캐스팅 필요 -> 불편 하기도 하고 위험하기도 함
//		그래서 살짝 바꿔보자 

	