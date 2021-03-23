package com.javaex.collection.list.a15;
//ppt04-49-50p/69
//ListEx + VectorEx +HashtableEx같이 보기 
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//	벡터의 선언
		Vector<Integer> v = new Vector<>();	//	Integer 객체를 담는 벡터
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		
		//	1부터 10까지의 값을 담아봅시다
		for (int i = 1; i <= 10; i++) {
			//	값을 뒤에 추가
			v.addElement(i);
		}
		System.out.println("v:" + v);
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		//	허용량 초과
		v.addElement(11);
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		
		//	중간에 삽입
		v.insertElementAt(7, 5);	//	7 객체를 5번 인덱스에 삽입
		System.out.println("v:" + v);
		
		//	객체 참조
		System.out.println("5번 인덱스의 객체:" + v.elementAt(5));
		
		//	객체 검색
		int index = v.indexOf(6);	//	6 객체의 인덱스는?
		System.out.println("index of 6:" + index);
		index = v.indexOf(0);		//	없는 객체의 인덱스? -> -1
		System.out.println("index of 0:" + index);
		
		//	포함 여부 확인
		//	내부에 10 객체 포함?
		System.out.println("v contains 10 ? " + v.contains(10));
		
		//	객체 삭제
		System.out.println("v:" + v);
		v.removeElement(7);	//	내부에서 7객체를 삭제
		System.out.println("v:" + v);             //인덱스 삭제는????????
		
		//	내부 객체를 출력 -1번쨰 방법 
		for (int i = 0; i < v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.print(item + " ");
		}
		System.out.println(); //개행해보자 ->1 2 3 4 5 6 7 8 9 10 11
		
		//	Enhanced for -2번쨰 방법
		for (Integer item: v) {
			System.out.print(item + " ");
		}
		System.out.println(); //개행해보자 ->1 2 3 4 5 6 7 8 9 10 11
		
		
		
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
	}

}