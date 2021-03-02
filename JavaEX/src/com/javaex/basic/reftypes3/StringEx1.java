package com.javaex.basic.reftypes3;

public class StringEx1 {

	public static void main(String[] args) {
//		stringTest();
		stringFormatEx();

	}

	private static void stringTest() {
//문자열 선언	
		String str;
		str = "Java";
		System.out.println("str:" + str);
		String str2 = "Java";
		System.out.println("str2:" + str2);
		String str3 = new String("Java");
		System.out.println("str3:" + str3);
		// 세 변수 모두 Java라는 문자열을 담고 있다.
		System.out.println("str==str2?" + (str == str2)); // 같은 주소이다.
		System.out.println("str==str3?" + (str == str3)); // 다른 주소이다.

		// 참조 타입의 ==, != , 은 두객체의 주소 비교를 한다는 뜻
		// 값의 비교는 .equals() 를 사용해야한다.
		System.out.println("str==str2 내용이 같은가?" + str.equals(str2));
		System.out.println("str==str3 내용이 같은가?" + str.equals(str3));// 2와 3은 다른 객체이지만 같은 값을 가진다.
	}

	private static void stringFormatEx() {
// %s(문자열), %d(10진 정수 ), %n (개행)
		// _개의 _중에 _개를 먹었다.
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		System.out.println(total + "개의 " + fruit + "중에서 " + eat + "개를 먹었다. ");
		// -> formatting
		String fmt = "%d개의 %s중에서 %d개를 먹었다%n"; // 탬플릿을 미리 만들어두고
		System.out.printf(fmt, total, fruit, eat);
		System.out.printf(fmt, 5, "오렌지", 2);
//	System.out.printf("%d개의 %s중에서 %d개를 먹었다.", total, fruit, eat  ); //순서와 타입이 일치해야 한다. 	

		// %f(실수) , %%(%)
		// 현재 이자율은 1.25%입니다.
		System.out.printf("현재 이자율은 %f입니다.%n", 1.25f);
		fmt = "현재 이자율은 %.2f%%입니다. %n"; // %.2f -> 소숫점 2째 자리까지 표기해라는 뜻 (부가정보)
		System.out.printf(fmt, 1.25f);

	}

}