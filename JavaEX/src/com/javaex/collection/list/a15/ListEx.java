package com.javaex.collection.list.a15;
//ppt04-52-55p/69
////ListEx + VectorEx +HashtableEx같이 보기 
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListEx {

	public static void main(String[] args) {
		listClassEx();
	}
	
	private static void listClassEx() {
		//	List 관련 클래스는 List 인터페이스를 구현하고있다 -> import!!!!!!!!!
		//List 인터페이스라서 List<String> lst = new List<>(); 는 불가능
		
		
		
		List<String> lst = new LinkedList<>();	//	참조하는 실체 클래스는  내가 구현하고 있는 다양한 인터페이스 클래스 LinkedList  -> import!!!!!!!!!
		                                       //실체 클래스는:LinkedList, 인터페이스:List
       //List<String> lst = new ArrayList<>(); //참조타입이 list라서 실체클래스를 변경함으로서 성능의 향상을 도모할 수 있다.  (다형성의 큰 특징)====================================????????????????????
		                                       //->콘솔 결과는  LinkedList<>();와 같지만 성능차이는 다를것이다. 
		
		System.out.println("lst:" + lst);
		System.out.println("size of lst:" + lst.size());
		
		//	객체 추가 
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		System.out.println("lst:" + lst);
		
		//	객체 삽입
		lst.add(2, "C#");
		System.out.println("lst:" + lst);
		
		//	List는 중복 삽입을 허용
		lst.add("Java");
		System.out.println("lst:" + lst);
		
		//	조회
		System.out.println("2번 인덱스:" + lst.get(2));
		
		
		
//	루프 
		//1번째 -for문
				for (String item: lst) {
			System.out.print(item + " ");
		}
		System.out.println(); //->Java C C# C++ Python Java 
		
		
		
		
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
		System.out.println(); //개행 //->Java C C# C++ Python Java 
//		//3번쨰 방법- 	Vector -> Enumeration을 받아와서 순회: 권장 -> 메모리 접근 효율이 좋다
//				//배열은 바로 다음에 자료가 있기 때문에 위의 2가지 방법을 이용해도 무방
//				//하지만 collection framework의 대표적 벡터는 다르게하는게 낫다. 
//				//첫번쨰 요소를 뽑아낸뒤 Enumeration한테 물어본다.  뒤에 데이터가 있냐? 있으면 하나 뽑아내고 그다음으로 이동하는 형식이
//				
//				Enumeration<Integer> e = v.elements();      //-> import!!!!!!!!!
//				
//				while (e.hasMoreElements()) {	//	뒤에 담긴 객체가 더 있는가라고 물어보는 것이다. 
//					Integer item = e.nextElement();	//그 다음에서야 데이터를 꺼내고,  Enumeration을 뒤로 이동시킨다. 
//					System.out.print(item + " ");
//				}
//				System.out.println(); //개행해보자 ->1 2 3 4 5 6 7 8 9 10 11
		
		
		
		
		
		
		
		
		
		//	객체의 삭제
		lst.remove(2);	//	인덱스 이용 삭제
		lst.remove("Python");	//	객체 삭제
		System.out.println("lst:" + lst);
		
		//유무검색
		boolean a = lst.contains("Java");
		System.out.println("Java의 유무" + a);
		
		//위치	검색
		int position = lst.indexOf("Java");
		System.out.println("1st Search:" + position);
		position = lst.indexOf("Linux");	//	없는 객체의 검색 :   -1
		System.out.println("없는 객체 검색:" + position);
		
		//	비우기
		lst.clear();
		System.out.println("lst:" + lst);
		
		
	}

}