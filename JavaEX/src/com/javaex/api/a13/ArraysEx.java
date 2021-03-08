package com.javaex.api.a13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
//CTRL + SHIFT + O 눌러서 IMPORT하기 


//ppt 04 - 25p/69
//배열을 조작하는데 도움을 주는 클래스- Arrays클래스
public class ArraysEx {

	public static void main(String[] args) {
	// arrayCopyEx();	
	// basicSortAsc();
		//basicSortDesc();
//	 customClassSort();
//	basicSearch();
	customClassSearch();
	
	}
	
//	배열 복사
	private static void arrayCopyEx() {
		//	회고
		char[] src = "Java Programming".toCharArray();
		System.out.println("원본: " + Arrays.toString(src));
	
		//	System을 이용한 복사=============================================================원래 했던거 암기========================
		char target[] = new char[src.length];
		System.arraycopy(src, //	원본배열의
				0, //	시작 인덱스
				target, //	타겟 배열
				0, //	복사 시작 위치
				src.length);	//	복사할 길이
		System.out.println("System을 이용한 배열 복사:" + Arrays.toString(target));
		
		//	Arrays 클래스를 이용한 배열의 복제 
		target = Arrays.copyOf(src, src.length);	//	src 배열을 길이만큼 복제
		System.out.println("copyOf: " + Arrays.toString(target));
		
		//	배열의 일부 복제 
		target = Arrays.copyOfRange(src, 
				5,	//	복사 시작 인덱스 
				12);	//	복사 끝 인덱스 ===========================================================11번째 인가 12번쨰인가 확인 
		System.out.println("copyOfRange:" + Arrays.toString(target));
	}
	
	// 기본 자료형의 오름차순 정렬
	private static void basicSortAsc() {    //(Asc = ascending = 오름차순) =================================
		int[] scores = {  80,50,30,90,75,88,77};  //기본타입배열 ========================
		System.out.println("원본:" + Arrays.toString(scores));
		Arrays.sort(scores); // 정렬
		System.out.println("오름차순 정렬:" + Arrays.toString(scores));
	}
	
	// 기본 자료형의 내림차순 정렬
		private static void basicSortDesc() { // descending (내림차순)                       
			Integer[] scores = { 80, 50, 30, 90, 75, 88, 77 };                                  //객체화 작업이 필요하다.?? ===integer 기본타입을 지원하지 않은 경우가 있다. 객체를 넘겨줘야한다. 기본타입을 객체화 시켜주는 포장 클래스 . ?=================================
			System.out.println("원본:" + Arrays.toString(scores));
			// 역순 정렬 - 역순정렬을 할때는 한번더 작업을 해줘야 한다. ==============================================================================????2번쨰 동영상 ==
			Arrays.sort(scores, Collections.reverseOrder());
			System.out.println("내림차순 정렬:" + Arrays.toString(scores));
		}

		
	
	
	//사용자 정의 클래스 정렬       
	private static void customClassSort() {
		Member[] members = {
				new Member("홍길동"),
				new Member("장길산"),
				new Member("전우치 ")
				
		};
		System.out.println("원본 배열:" + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬:" + Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println("역순정렬:" + Arrays.toString(members));
	}
	//검색기능에서는 sort가 먼저 되어 잇어야 한다. =====================================================
	//안그럼 이상한 결과 가 나온다. = =======================================================================
	
	
	private static void basicSearch() {
		// Java의 기본 검색 방식은 binarySearch
		// 검색 이전에 반드시 정렬이 되어 있어야 한다
		int[] nums = { 5, 8, 1, 3, 6, 9, 10, 5, 8, 2 };

		System.out.println("원본:" + Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println("정렬:" + Arrays.toString(nums));

		int index = Arrays.binarySearch(nums, 9);
		System.out.println("9의 인덱스: " + index);

		String[] words = { "Java", "C", "C++", "Python", "Linux" };
		System.out.println("원본:" + Arrays.toString(words));
		Arrays.sort(words);
		System.out.println("정렬:" + Arrays.toString(words));

		index = Arrays.binarySearch(words, "Java");
		System.out.println("Java의 인덱스: " + index);
	}
	
	//사용자정의 클래스 검색 -//주의 " 홍길동 홍길동이 다른 객체이다. ======================================================================
	
	private static void customClassSearch() {
		Member[] members = { new Member("홍길동"),
							new Member("장길산"),
							new Member("전우치") };

		Arrays.sort(members); // Comparable 인터페이스 구현
		System.out.println("원본:" + Arrays.toString(members));
		int index = Arrays.binarySearch(members, 
				new Member("홍길동"), 
				new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				return o1.name.compareTo(o2.name);
			}

		});
		System.out.println("홍길동 검색:" + index);

	}
	
}



































