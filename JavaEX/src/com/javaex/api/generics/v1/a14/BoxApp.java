package com.javaex.api.generics.v1.a14;
//ppt04-43p/69
public class BoxApp {

	public static void main(String[] args) {
		
//정수형 상자
			IntBox intBox = new IntBox();
			intBox.setContent(2021);
            //값을 가져와 봅니다.
			int retVal = intBox.getContent();
			System.out.println("내용물:" + retVal);
			
//문자열 담는 상자
			StringBox strBox = new StringBox();
			strBox.setContent("Java");
           //값을 가져와 봅니다	
			String strVal = strBox.getContent();
			System.out.println("strBox 내용물:" + strVal);
			
			
//ObjectBox	상자
			ObjectBox objBox = new ObjectBox();
			objBox.setContent(2021);
			
			ObjectBox objBox2 = new ObjectBox();
			objBox2.setContent("Java");
			
			//	내용물 확인
//			오브젝트를 인티져에 못담는다. 
//			그래서 다운캐스팅이 필요하다. 
//			그래서 (Integer)붙이기 
			
			//	내부 데이터가 Object여서 Java 컴파일러가 체크가 힘들어진다
			//	데이터를 불러올 때, 캐스팅 필요 -> 불편, 위험
			Integer retVal2 = (Integer)objBox.getContent();
//			그래서 살짝 바꿔보자  -> v2로 다시 해보자
		}

	}
	
		
		

	