package com.javaex.api.a13;
//ppt04-25p/69

import java.util.Arrays;//--------------------------중요---------------------------------
import java.util.Collections;
import java.util.Comparator;
//CTRL + SHIFT + O 눌러서 IMPORT하기 


//ppt 04 - 25p/69
//배열을 조작하는데 도움을 주는 클래스- Arrays클래스
public class ArraysEx {

	public static void main(String[] args) {
	// arrayCopyEx();	
//	 basicSortAsc();
		//basicSortDesc();
//	 customClassSort();
//	basicSearch();
	customClassSearch();
	
	}
	
//	배열 복사
	private static void arrayCopyEx() {
		//	회고 (앞 내용 복습)
		char[] src = "Java Programming".toCharArray();
		System.out.println("원본: " + Arrays.toString(src));
	
		//	System을 이용한 복사===앞에서 원래 했던거 암기========================
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
				12);	//	복사 끝 인덱스. 11번째에서 +1하기  
		System.out.println("copyOfRange:" + Arrays.toString(target));
	}
	
	
	
	// 기본 자료형의 오름차순 정렬
	private static void basicSortAsc() {    //(Asc = ascending = 오름차순)
		int[] scores = {  80,50,30,90,75,88,77};  //기본타입배열 ========================중첩배열???참조배열을 갖는???
		System.out.println("원본:" + Arrays.toString(scores));
		Arrays.sort(scores); // 정렬
		System.out.println("오름차순 정렬:" + Arrays.toString(scores));
	}
	
	// 기본 자료형의 내림차순 정렬
		private static void basicSortDesc() { // descending (내림차순)                       
			Integer[] scores = { 80, 50, 30, 90, 75, 88, 77 };    //특정클래스인경우 기본타입을 지원하지 않은 경우가 있다. 그래서 객체를 넘겨줘야한다. 객체화 작업이 필요하다.기본타입을 객체화 시켜주는 포장 클래스가 있다. 
			                                                      //기본타입은 객체화가 아니니까 바꿔줘야한다.  
			System.out.println("원본:" + Arrays.toString(scores));
			// 역순 정렬 - 역순정렬을 할때는 한번더 작업을 해줘야 한다. 
			Arrays.sort(scores, Collections.reverseOrder());
			//자바 내부에서 객체만 다루는 경우가 많다. 그래서 Collections.reverseOrder()은 기본자료형을 다룰수 없는 컬렉션  클래스이다.
		    //객체화 시켜야한다. 객체로 만들어 줘야한다. 
			System.out.println("내림차순 정렬:" + Arrays.toString(scores));
		}

		
	
	
//사용자 정의 클래스<<<<<< 정렬>>>>>>>>      
		//사용자 정의 객체에서 배열을 만들어보자 ,sort도 해보자
		//먼저 옆에 Member파일 만들어서 Member의 배열을 만들어보자 
	private static void customClassSort() {
		Member[]  members = {
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
		// Java의 기본 검색 방식은 binarySearch 이진서치이다. 효율성을 높이기 위해 정확성을 높이기 위해 
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
	
	
	
//사용자정의 클래스 <<<<<< 검색>>>>>>>>
	private static void customClassSearch() {
		Member[] members = { new Member("홍길동"),
							new Member("장길산"),
							new Member("전우치") };

		Arrays.sort(members); // Comparable 인터페이스 구현
		System.out.println("원본:" + Arrays.toString(members));
		int index = Arrays.binarySearch(members, //앞에있는 members들이고 
				new Member("홍길동"),              //비교해야하는 새로운 객체들이고
				new Comparator<Member>() { //비교기를 넣어야 한다. 두 객체를 비교할 수 있는 

											@Override
											public int compare(Member o1, Member o2) { //01 :앞에있는 members들이고  02:비교해야하는 새로운 객체들이고
												return o1.name.compareTo(o2.name);
											}

		});
		System.out.println("홍길동 검색:" + index);

	}
//	////사용자 정의 클래스<<<<<< 정렬>>>>>>>>
//	//두 객체의 대소 비교 로직을 넣어야 한다. 
//	@Override
//	public int compareTo(Object o) {
//		// 두 대상이 같으면 0
//		// 앞의 것이 작으면 -1
//		// 앞의 것이 큰경우 +1
//		//비교 대상인 (매개변수)파라미터 o 가 member인지 확인해야 한다. 비교가능한 대상인가를 확인
//		if (o instanceof Member) {
//			Member other = (Member)o;
//			return name.compareTo(other.name); //other과 name을 순서대로 비교하면 된다. 라는의미 
//			                                   //두 객체의 필드 name의 선후관계를 비교하겠다라는 의미 
//			//============== =======================================================================================================핸드폰 사진과 비교해보기 
//		}
//		return 0;
//	}
	
}



































