package com.javaex.basic.reftypes.d;

public class StringEx1 {

	public static void main(String[] args) {
	//	stringTest();
	stringFormatEx();

	}

	private static void stringTest() {
//문자열 선언	
// 참조 타입의 ==, != , 은 두객체의 주소 비교를 한다는 뜻
// 값의 비교는 .equals() 를 사용해야한다.
		String str;
		str = "Java";  //리터럴
		System.out.println("str:" + str);
		String str2 = "Java"; //리터럴
		System.out.println("str2:" + str2);
		String str3 = new String("Java"); //새로운 객체 생성
		System.out.println("str3:" + str3);
		// 세 변수 모두 Java라는 문자열을 담고 있다.
		System.out.println("str==str2?" + (str == str2)); // 같은 주소이다.
		System.out.println("str==str3?" + (str == str3)); // 다른 주소이다.

		System.out.println("str==str2 내용이 같은가?" + str.equals(str2));
		System.out.println("str==str3 내용이 같은가?" + str.equals(str3));// 2와 3은 다른 객체이지만 같은 값을 가진다.
	}//자세한 내용의  String은 API 항목에서 정리할 것이다. 
	

private static void stringFormatEx() {
// %s(문자열), %d(10진 정수 ), %n (개행) , %f (실수형), %2f (2째자리까지 실수형표현)
		// _개의 _중에 _개를 먹었다.
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		System.out.println(total + "개의 " + fruit + "중에서 " + eat + "개를 먹었다. ");
		
		
		// -> formatting
		//방법1 : System.out.printf("%d개의 %s중에서 %d개를 먹었다.", total, fruit, eat  ); //순서와 타입이 일치해야 한다.
		//방법2 :미리 포맷문을 만들어서 간단하게 적기
		String fmt = "%d개의 %s중에서 %d개를 먹었다%n"; // 탬플릿을 미리 만들어두고
		System.out.printf(fmt, total, fruit, eat);
		System.out.printf(fmt, 5, "오렌지", 2);
//		String fot = String.format("%d개의 %s중애소 %d개를 먹었다. %n", "사과 ", 5,3);
//		System.out.printf(fot);
//		private static void enumTest() {
//			Week today = Week.WEDNESDAY;
//			System.out.printf("Today is %s(%d)%n",today.name(),//열거상수의 이름을 문자열로 바꿔서 사용가능   
//			today.ordinal());//열거상수의 순번
//			
//			//String -> 열거 상수로 변환
//			Week other = Week.valueOf("FRIDAY");//-> Week.FRIDAY
//					System.out.printf("other is %s(%d)%n",other.name(),
//					other.ordinal());
//					
//			//열거 상수의 순번비교 
//			System.out.println(other.compareTo(today));  //두 열거 상수의 순번차
//		
//			Week[] days = Week.values(); //Week enum 타입의 모든 열거 상수를 반환
//			
//			//순회
//			for (int i =0; i< days.length; i++) {
//			    System.out.printf("%s(%d)%n",days[i].name(),
//											days[i].ordinal());
//				String s = String.format("%s(%d)%n",days[i].name(),
//						days[i].ordinal());
//			    System.out.println(s);
////			========================================================================================
//			}
//		}
//			
//		
         	

		// %f(실수) , %%(%)
		// 현재 이자율은 1.25%입니다.
		System.out.printf("현재 이자율은 %f입니다.%n", 1.25f);
		fmt = "현재 이자율은 %.2f%%입니다. %n"; // %.2f -> 소숫점 2째 자리까지 표기해라는 뜻 (부가정보)
		System.out.printf(fmt, 1.25f);

	
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}