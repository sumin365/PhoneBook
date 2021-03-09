package com.javaex.api.generics.v3.a14;
//ppt04-43p/69


public class BoxApp {

	public static void main(String[] args) {
            //		Generic으로 설계된 클래스는
			//	new (인스턴스화) 할 때 내부 데이터 타입을 지정할 수 있다
		    //같은 내용을 가진 객체인데 여러가지 다른 객체를 처리 할 수 있는 공통된 하나의 객체를 만들 수 있다.
			
		
		//	Key타입이 String, Value타입이 Integer
	       	GenericBox<String, Integer> intBox = new GenericBox<>();
			intBox.setKey("Integer"); //문자열만 들어갈 수 있다. 
			//intBox.setKey(123); //	들어갈 수 없다
	       	intBox.setContent(2021);    //정수형 가능 
//			intBox.setContent("Java");	//	들어갈 수 없다
	       	
			//	값을 가져와 봅니다.
			int retVal = intBox.getContent();	//	캐스팅 불필요
			System.out.println("키: " + intBox.getKey() + ", 값:" + retVal);
			
		}

	}
        
		 
		
	