package com.javaex.api.stringclass.k;
//ppt04-21p/69

public class StringEx {

	public static void main(String[] args) {
//	stringBasic();
		usefulMethods();
	}
	private static void stringBasic() {
		String s1 = "Java";	//	리터럴
		String s2 = new String("Java");	//	새로운 객체
		String s3 = "Java";	//	리터럴
		
		System.out.println("s1, s2 같은 객체 ? " + (s1 == s2));     //->false
		System.out.println("s1, s3 같은 객체 ? " + (s1 == s3));     //-> true
		
		//	String은 char의 집합
		char letters[] = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);     //->Java
		
		System.out.println("s4 = " + s4);
		
		//	valueOf 메서드 -> 기본 타입을 문자열로 변환
		String s5 = String.valueOf(3.14159f);
		System.out.println("s5 = " + s5);     //-> 3.14159
	}

	
	
	
	
	private static void usefulMethods() {
		//	String 다양한 메서드들
		String source = "Java Programming, JavaScript Programming";
		System.out.println("원본:" + source);
		
		//	인덱스 접근
		System.out.println("length:" + source.length());     //->length:40
		System.out.println("5번 인덱스의 글자:" + source.charAt(5));     //->5번 인덱스의 글자:P
		
		//	변환 메서드
		System.out.println("모두 소문자:" + source.toLowerCase());     //->모두 소문자:java programming, javascript programming
		System.out.println("모두 대문자:" + source.toUpperCase());     //->모두 대문자:JAVA PROGRAMMING, JAVASCRIPT PROGRAMMING
		
		//	검색 메서드 (중요)==============================================헷갈리니까 다시보기 익숙해지기====================================================
		int index = 0;
		index = source.indexOf("Java");     
		System.out.println("1st Search:" + index);                                //->1st Search:0
		
		index += "Java".length();	                                              //	인덱스를 4글자 뒤로 이동  index +=4와 같은 뜻
		index = source.indexOf("Java",index);                                     //검색시작 인덱스를 추가 로 뒤에 넣기 
		System.out.println("2nd Search:" + index);                                //->2nd Search:18
		
		
		index = source.indexOf("Java", index + "Java".length() );
		System.out.println("3rd Search:" + index);	                             //	검색할 내용이 없을 때 -> -1로 나온다.      //->3rd Search:-1
		
		index = source.lastIndexOf("Java");
		System.out.println("역방향 검색:" + index);                                 //->역방향 검색:18     ->2nd Search:18과 동일한 값이다. 
		
		//	추출
		System.out.println("18번 인덱스 ~:" + source.substring(18));	//	18번부터 끝까지 추출     //->18번 인덱스 ~:JavaScript Programming
		System.out.println("18 ~ 21:" + source.substring(18, 22));	//	18 ~ (22 - 1)     //->18 ~ 21:Java==========================================다시보기===
		
		//	치환메서드
		System.out.println("Replace:" + source.replaceAll("Java", "Python"));     //->Replace:Python Programming, PythonScript Programming 
		
		//	변환, 치환, 추출 메서드를 수행해도 원본이 변경되지는 않는다
		System.out.println("원본:" + source);	 	//	String 불변 객체(immutable)     //->원본:Java Programming, JavaScript Programming
		
		
		//	Whitespace 제거- 공백을 없애고 쓴다. 
		String str = "              Hello      ";
		System.out.println("trim:[" + str.trim() + "]");     //->trim:[Hello]
		
		//	문자열 분절- 공백을 기준으로 짤라내야한다. 
		String words[] = source.split(" ");	//	공백을 기준으로 문자열 분리 -> 배열로 변경한다. 
		
		for (String data: words) {
			System.out.println("chunk:" + data);
		}                                                    //->chunk:Java
		                                                    //->chunk:Programming,
		                                                   //->chunk:JavaScript
		                                                   //->chunk:Programming
		
		
		//	문자열의 비교
		//	compareTo : 같으면 0, 작으면 -1, 크면 1
		System.out.println("ABC".compareTo("ABD"));     //->-1
		System.out.println("ABC".compareTo("ABC"));     //->0
	}
	

}