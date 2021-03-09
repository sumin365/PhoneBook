package com.javaex.api.a13;
//ppt04-27-31p/69
public class WrapperEx {

	public static void main(String[] args) {
		//기본 만들기 
		Integer i = new Integer(10); //쭉 그어져 있지만 컴파일되어서 사용 노노 이 방식은 사용하지 말자 . deprecated되었다. 향후 삭제될 예정이다. -> 빠른시간 내에 다른 방식으로 코당을 해야한다. 
		Float f = new Float(3.14159f);
		
//		valueOf() static 메서드를 이용하자!
			Character c = Character.valueOf('c'); //포장해서 객체화 시키는 것이다.==
			
			
//			문자열로 초기화할 수 있다 -> 이 방법 추천함
			Integer i2 = Integer.valueOf("10");
			Float f2 = Float.valueOf("3.14159f");
			Boolean b2 = Boolean.valueOf("false");
			//	파라미터로 전달된 문자열은("") 해당 타입으로 변환될 수 있는 형태의 문자열이어야 한다
			
	
//			자동박싱이 지원
			Integer i3 = 10;	//	== Integer i3 = Integer.valueOf(10);
			
				
//			유틸리티 메서드들
			//	parse 계열 메서드: 문자열을 이용, 해당 타입으로 변환, 다른 형태로 출력 메서드
			System.out.println(Integer.parseInt("-123"));	//	문자열 -> 정수
			System.out.println(Integer.parseInt("FF", 16));	//	16진수 FF -> 정수로 변환
			System.out.println(Integer.toBinaryString(28));	//	28을 2진수 형태의 문자열로 출력
			System.out.println(Integer.toHexString(28));	//	28을 16진수 형태의 문자열로 출력
			
//			형변환 메서드들          
			double d4 = i3.doubleValue();
			System.out.println("형변환:" + d4); //->형변환:10.0
			
		
		
		
		
		
			//자동으로 박싱 언박싱이 작동한다. 그렇지만 막 쓰면 안된다. 
//			포장 클래스 역시 객체다 
			Integer i4 = Integer.valueOf(2021);
			Integer i5 = Integer.valueOf(2021);
			System.out.println("i4 == i5 ? " + (i4 == i5));	//	false임을 주의
			//	포장 클래스 == 포장 클래스 -> 두 객체의 주소를 비교한 것
			
			//	값의 비교를 위해서는 unboxing비교,또는  equals 비교를 해야 한다
			System.out.println("값의 비교(언박싱): " + (i4.intValue() == i5.intValue()));
			System.out.println("값의 비교(equals): " + i4.equals(i5));
			
		}

	}
