package com.javaex.basic2;

import java.util.Scanner;

public class ConditionalEx3 {

	public static void main(String[] args) {
		//ifEx();
//		ifElseEx();
//		ifPractice();
//		switchEx();
//		switchEx2();
		switchEx3();
//		ifPractice02();
	}
	
	
//<if분기문-78p>
	private static void ifEx() {

//						//점수를 입력 받아 점수가 60점이상이면 합격입니다. 를 출력하세요
//						Scanner scanner = new Scanner(System.in);
//						System.out.print("점수를 입력하세요 : ");
//						int score = scanner.nextInt();
//						if (score >= 60) {
//							System.out.println("합격입니다. ");
//							
//						}
//					scanner.close();//잊지말자 close
//					}
	
		
		
		
//79p	
				//점수를 입력 받아 점수가 60점이상이면 합격입니다. 그렇지 않으면 불합격입니다. 출력하세요
						Scanner scanner = new Scanner(System.in);
						System.out.print("점수를 입력하세요 : ");
						int score = scanner.nextInt();
						if (score >= 60) {
							System.out.println("합격입니다. ");
							}else {
								System.out.println("불격입니다. ");
							
							}
					scanner.close();//잊지말자 close
						}

				
//if~else if ~ else문 - 80p
private static void ifElseEx() {
						Scanner scanner = new Scanner(System.in);
						System.out.print("정수를 입력하세요 : ");
						int num = scanner.nextInt();
//						if (num >0){
//							System.out.println("양수입니다.");
//							}else if(num <0) {
//								System.out.println("음수입니다.");
//							}else {
//									System.out.println("0입니다. ");
//							}
//					scanner.close();//잊지말자 close
//						}
					
						
//중첩 if : if문을 중첩될 수 있다. --if문이 중첩이 3단계 이상이면 다시 보자 2단계로 줄일수 있을 것이다. 의심해보자   ============================================연습
					if (num==0) {
						System.out.println("0입니다. ");
					} else {
								if (num >0) {
									System.out.println("양수입니다.");
								}else {
									System.out.println("음수입니다. ");
								}
						scanner.close();//잊지말자 close
							}//else의 닫기 -- 다른것들과 다르니까 헷갈리지말기 
					
					}//private의 닫기 
/*
 */




//82p
private static void ifPractice(){
						Scanner scanner = new Scanner(System.in);
						System.out.println("과목코드 (1.C , 2. C++ , 3. Java , 4. Python)");
						System.out.print("과목을 선택하세요.:");
						int code = scanner.nextInt();
						if (code==1) {
							System.out.println("R101호입니다.");
							}else if(code==2){
								System.out.println("R202호입니다.");
							}else if(code==3){
									System.out.println("R303호입니다.");
							}else if(code==4){
								System.out.println("R404호입니다.");
							}else {
								System.out.println("상담원에게 문의하세요.");
							}
					scanner.close();//잊지말자 close
						}
	
//switch ~case- 84p
private static void switchEx(){
					Scanner scanner = new Scanner(System.in);
					System.out.println("과목코드 (1.C , 2. C++ , 3. Java , 4. Python)");
					System.out.print("과목을 선택하세요.:");
					int code = scanner.nextInt();
					
					switch (code) {
					case 1 : 
						System.out.println("R101호입니다.");
						break; //잊지말자 
					case 2 : 
						System.out.println("R202호입니다.");
						break; //잊지말자 
					case 3 : 
						System.out.println("R303호입니다.");
						break; //잊지말자 
					case 4 : 
						System.out.println("R404호입니다.");
						break; //잊지말자 
					default :
						System.out.println("상담원에게 문의하세요.");
					}
					scanner.close();//잊지말자 close
					// 이 뒤에서는  scanner의 메서드를 사용할 수 없다. ===================================?ㅡ
				}

//85p- 월을 입력받아 해당월의 일수를 출력하는 프로그램을 작성하세요
private static void switchEx2(){
					Scanner scanner = new Scanner(System.in);
					System.out.print("월을 입력하세요 :");
					int month = scanner.nextInt();
					switch (month) {
					case 1 : 
					case 3 :
					case 5 :
					case 7 :
					case 8 :
					case 10 :
					case 12 : //month가 1또는 3또는 .....이라는 말
						System.out.println(month + "월은 31일입니다. ");
				      break; //잊지말자
					case 4 :
					case 6 :
					case 9 :
					case 11 :
						System.out.println(month + "월은 30일입니다. ");
						break; //잊지말자
					case 2 : 	
						System.out.println(month + "월은 28일입니다. ");
						break; //잊지말자
					default :
						System.out.println( "? ");
					}
					scanner.close();//잊지말자 close
				}

//JAVA의 case문에서 char, String 도 점검할 수 있다. -83p아랫설명 
//요일정보 변수로 만들어보기 /문자열로 구분하기 
//SUN 일요일 
//요일변수는 딲 지정된 범위의 값만 들어와야 한다.   만약 소문자로 쓰면 못알아듣는다. 그래서 문자욜 사용을 자제하도록 -> enum데이터 타입으로 변경하는게 좋다. 
private static void switchEx3(){
 String day = "TUE";
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



private static void ifPractice02(){
	Scanner scanner = new Scanner(System.in);
	System.out.print("점수를 입력하세요 :");
	int score = scanner.nextInt();
//	if (score % 3 == 0) {
//	3의 배수 
//	System.out.println(score + "는 3의 배수입니다. ");
//} else {
//	System.out.println(score + "는 3의 배수가 아닙니다. ");
//}
	
		
		
		System.out.println(score +  "는 "+( score % 3 == 0 ? "3의 배수입니다. " : "3의 배수가 아닙니다. "));
		scanner.close();//잊지말자 close
		
		
		
		
		
	}
}
	

