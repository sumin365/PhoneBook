package com.javaex.basic.types.a2;
//char(2바이트)
//유니코드는 캐릭터 1글자
public class CharEx5 {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = '한';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1+c2);  //54685로 출력됨 왜냐 int +int 가됨 연결은 문자열만 연결됨
		String str = "A한";  //String 은 char의 연결된 자료구조
		System.out.println(str);
	
	}

}
