package com.javaex.basic.a1;
//주석 : 컴파일 되지 않음
/*
 * 여러줄에서 컴파일
 */
public class HelloWorld{
//클래스 객체가 실행하고자 한다면 main메서드가 필요
 public static void main (String[] args) {
	System.out.println("Hello World");  //실행물이 끝나면 ;쓰기
 	}

}
//https://github.com/wlgud30/AddressBook/blob/master/AddressBook/src/com/java/addressbook/AddressBook.java


//ppt04-66p/69	=======================================================???????????	03090 130114-13분~  21분
		//	반복자 활용- collection framework에서의
		Iterator<String> it = map.keySet().iterator();  //key -> hashset -> Iterator
		while(it.hasNext()) {
			ClassRoom item = map.get(it.next());
			System.out.println(item);
		}
		


//3번쨰 방법- 	Vector -> Enumeration을 받아와서 순회: 권장 -> 메모리 접근 효율이 좋다
		//배열은 바로 다음에 자료가 있기 때문에 위의 2가지 방법을 이용해도 무방
		//하지만 collection framework의 대표적 벡터는 다르게하는게 낫다. 
		//첫번쨰 요소를 뽑아낸뒤 Enumeration한테 물어본다.  뒤에 데이터가 있냐? 있으면 하나 뽑아내고 그다음으로 이동하는 형식이
		
		Enumeration<Integer> e = v.elements();
		
		while (e.hasMoreElements()) {	//	뒤에 담긴 객체가 더 있는가라고 물어보는 것이다. 
			Integer item = e.nextElement();	//그 다음에서야 데이터를 꺼내고,  Enumeration을 뒤로 이동시킨다. 
			System.out.print(item + " ");
		}
		System.out.println(); //개행해보자 ->1 2 3 4 5 6 7 8 9 10 11
		
		//	백터 비우기
		v.clear();
		System.out.println("v:" + v);
		System.out.printf("Size: %d, Capacity: %d%n", v.size(), v.capacity());


	//2번쨰 - 반복자를 이용한 순회: 추천!!!
		//list나 vector같은 것은 순회자, 반복자를 사용하도록 하자 
				//vector : Enumeration을 꺼내 사용
				//list : Iterator 반복자를 사용================================????????????????????????????????????????????? 
		//	.iterator() -> 반복자를 획득
		Iterator<String> it = lst.iterator();                      //-> import!!!!!!!!!
		                                           //어떤 순회객체에서 iterator을 뽑아내면 다음 녀석을 가지고 있는 위치의 목록을 다 담고 있다. 다음에 요소가 있냐?라고 물어보고 있으면 /객체를 꺼내고 /다음으로 넘어간다. 
		while(it.hasNext()) {	//	뒤에 내용이 더 있는가?라고 물어보기 
			String item = it.next();  //있으면 객체를 꺼내라 
			System.out.print(item + " ");
		}
	}
