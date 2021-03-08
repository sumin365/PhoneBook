package com.javaex.basic.reftypes.a4;
//01ppt- 113p/126
public class EnumEx2 {
	public static void main(String[] args) {
		enumTest();
	//	switchEx3();
	//	enumTest2();
		 
	}
	private static void enumTest() {
		Week today = Week.WEDNESDAY;
		System.out.printf("Today is %s(%d)%n",today.name(),//열거상수의 이름을 문자열로 바꿔서 사용가능   
		today.ordinal());//열거상수의 순번
		
		//String -> 열거 상수로 변환
		Week other = Week.valueOf("FRIDAY");          //-> Week.FRIDAY
				System.out.printf("other is %s(%d)%n,%s%n",other.name(),
				other.ordinal(), other.valueOf("FRIDAY"));
				
		//열거 상수의 순번비교 
		System.out.println(other.compareTo(today));  //두 열거 상수의 순번차
	
		Week[] days = Week.values(); //Week enum 타입의 모든 열거 상수를 반환
		
		//순회
		for (int i =0; i< days.length; i++) {
		    System.out.printf("%s(%d)%n",days[i].name(),
										days[i].ordinal());
			String s = String.format("%s(%d)%n",days[i].name(),
					days[i].ordinal());
		    System.out.println(s);
//		========================================================================================
		}
	}
		
	
	
		private static void switchEx3(){//예전꺼
			 String day = "FRI";
			 String message ;
			 switch(day) {
			 case"SUN":
				 message = "일요일";
				 break;
			 case "MON" :
			 case "TUE" :
			 case "WED" :
			 case "THU" :
				 message = "열공";
				 break;
			 case "FRI" :
				 message = "불금";
				 break;
			 case "SAT" :
				 message = "주말";
				 break;
				 default:
					 message = "?";
					 
			 }
			 System.out.println(day +  "는 "+ message +"입니다.");
			}
		
private static void enumTest2() {
			Week today = Week.WEDNESDAY;
			String message;
			
			switch(today) {
			case SUNDAY:
				message = "일요일";
				break; //잊지말자
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
				message = "열공";
				break; //잊지말자
			case FRIDAY:
				message = "불금";
				break; //잊지말자
			case SATURDAY:
				message = "주말";
				break; //잊지말자
				default:
					message = "?";
			}
			 System.out.printf("%s에는 %s%n", today.name(), message);
		}


	
}
