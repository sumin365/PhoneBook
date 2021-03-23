package com.javaex.collection.hash.a16;
//ppt04-61p/69
import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		basicHashSetEx();
		customHashSetEx();
	}
	
	private static void basicHashSetEx() {
		HashSet<String> hs = new HashSet<>();//->import
		
		//	요소 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		
		System.out.println("HashSet:" + hs);	//	순서는 유지하지 않음  그냥 집합이니까 순서 안중요 
		System.out.println("요소의 수:" + hs.size());
		
		hs.add("Java");
		System.out.println("HashSet:" + hs);	//	중복을 허용하지 않음
		
		//	요소의 포함 여부 확인
		System.out.println("contains Java ? " + hs.contains("Java"));
		System.out.println("contains Linux ? " + hs.contains("Linux"));
		
		System.out.println("HashSet:" + hs);
		
		//	요소의 삭제
		hs.remove("C++");
		System.out.println("HashSet:" + hs);
		
		//	비우기
		hs.clear();
		System.out.println("HashSet:" + hs);
		
	}
	
	//사용자정의 객체를 다뤄야한다. !!!이용해보자 
	//hash계열의 처리방식

	private static void customHashSetEx() {
		HashSet<Student> hs = new HashSet<>();  //->import
		
		Student s1 = new Student("홍길동", 10);
		Student s2 = new Student("장길산", 20);
		Student s3 = new Student("전우치", 30);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println("학생부:" + hs);
		
		Student s4 = new Student("홍길동", 10);//  이름과 학번이 같지만 new로 새로운 객체를 생성했기 때문에, object.hashcode()를 상속받아 메모리 주소를 썼기 떄문에 메모리주소가 다르다.  
		hs.add(s4);                          //그렇지만 우리는 이름 아이디가 같으면 같은 객체로 나오게 만들어 보자 Student 파일을 하나 만들어 override만들자 
		System.out.println("hashcode of s1:" + s1.hashCode());//1차 검증 -@Override  hashCode  만들기 
		System.out.println("hashcode of s4:" + s4.hashCode());
		System.out.println("s1 equals s4 ? " + s1.equals(s4));//2차 검증 -@Override equals 만들기 
		//override안했다면 flase나온다.
		
		System.out.println("학생부:" + hs);
		
		//	포함 여부 확인
		boolean exists = hs.contains(new Student("홍길동", 10)); //문자열을 비교하면 안되겠죠
		System.out.println("홍길동(10) exists:" + exists);
	}
	


}