package com.javaex.basic2;

public class OperEx1 {

	public static void main(String[] args) {
	//	arithOperEx();
    // 	logicalOperEx( );
    	bitOperEX();	
//   bitShiftEx();
  //  	conditionalOperEx();
	}                      

//<1> 산술연산자
	private static void arithOperEx() {
	int a = 7;
	int b = 3;
	//부호연산자 + -
	System.out.println(-a);
	System.out.println(-1*a);
	//산술연산자 + - * / %
	System.out.println(a/b);
	System.out.println(a%b);
	
	//int7/int3 은 ??  실제세상에서의 7나누기 3 계산하기 
	System.out.println((float)a/(float)b);  
	//2개의 피연산자를 산술연산 할떄 타입을 큰쪽에 맞춘다.   7.0/3.0(자동으로 변환됨)
	System.out.println((float)a/b);
	
	//증감연산 (++  --)   복잡하게 사용하지말고 단순연산으로만 사용해 
	int c=10;
	System.out.println("후위증감");
	System.out.println(c);   //10
	System.out.println(c++); //10   뒤에 ++는 데이터를 사용한 후에 증가가 일어난다. 
	System.out.println(c);   //11
	 c=10;
	System.out.println("전위증감");
	System.out.println(c);   //10
	System.out.println(++c); //11   앞에 ++는 데이터를 사용한 전에 증가가 일어난다. 
	System.out.println(c);   //11
	
	//나눗셈 보충
	int d=10;
	int e=0;
	//System.out.println(d/0);        //Arthimatic Exception
	System.out.println((float)d/0);   // 10.0/0 무한대가 나온다. 
	//연산 결과가 유한수인지 확인 
	System.out.println("10.0 / 0 은 유한수 인가?" + Double.isFinite((float)d/0));
	
	System.out.println(0.0/0.0);      //결과 NaN (NOT A NUMBER)
	System.out.println("0.0/0.0 is Nan?"+ Double.isNaN(0.0/0.0));
	
	//Infinity가 포함된 산술 계산식은Infinity
	System.out.println(10.0/0 +10);
	//NaN가 포함된 산술 계산식은 계산이 안됨
	System.out.println(0.0/0.0 +10);
	
	//할당연산자
	a=a+b;             
	System.out.println(a);
	a=7;
	a+=b; // 두개가 같은 말이다. 
	System.out.println(a);
	}
	
	
	
	
	
	
	

//<2>비교, 논리 연산자  ---결과로 boolean을 뽑아 낸다. 
	    private static void logicalOperEx( ) {
		//비교연산자( ==,   !=,  >,    >=,   < , <=  )
		int a=7;
		int b=3;
		System.out.println("a > b ? " + (a>b));
		System.out.println("a equals b ? " + ( a == b));
		System.out.println("a not  equals b ? " + (a!=b));
		
		//논리 연산자  -( &&   ||     ! )
        // val이 0초과 10미만의 영역에 있는가?
        // 조건1 val > 0     조건2   val <10    조건3  조건1 2 동시에 
		int val = 5; 
	   boolean r1= val >0;          //T
	   boolean r2 = val <10;        //T
	   boolean r1andr2 = r1 && r2;  // val >0 && val <10   따라서 T
	   System.out.println(" r1 && r2 " + r1andr2);
	   System.out.println(r1 && r2); 
	   
       //val이 0이하10이상 영역에 있는가?
       //조건1 val <=0    조건2   val >=10   조건3  조건1  또는2
		r1= val <=0;                 //F
		r2 =val >=10;                //F
		boolean r1orr2 = r1 || r2;   // val <=0  || val >=10   따라서F
		System.out.println(" r1 || r2 " + r1orr2);  
		System.out.println(r1 || r2);  //boolean으로 한번 해줘야함 변수선언 해줘야함
		//보통 앤드조건에서 쓰는 형식보다 오알조건에서 쓰는 것처럼 맨 마지막에만 boolean 씀
		
		 
		 
		 //val이 0이하10이상 영역에 있는가? 의 논리값을 뒤집는다. 
		 boolean rNot = !r1orr2;      //!(val <= 0|| val >= 10)  따라서 T
		 System.out.println("r1orr2의 논리부정:" + rNot);
	}		 
				
	    
//<3>비트 연산자 (&,  |,  ~)
		 //int에만 적용. 비트단위 미세한 조정에 사용힌다 
		 private static void bitOperEX() {
		 int b1 = 0b1101;
		 int b2 = 0b0111;
		 System.out.println(Integer.toBinaryString(b1));  //1101
		 System.out.println(Integer.toBinaryString(b2));  //111
		 int result = b1 & b2 ; // 비트 논리곱   
		 System.out.println(Integer.toBinaryString(result));   //결과 101
		 result = b1 | b2 ; // 비트 논리합
	     System.out.println(Integer.toBinaryString(result));   //결과 1111
		 result = ~b1;    //비트 논리부정 
		 System.out.println(Integer.toBinaryString(result));   //결과 111111111111110010   
		                                                       //첫번쨰가 1이니까 음수로 나올것 따라서 비트 연산자는 수치로서 숫자로서 생각하지마       
		
		 }			 
		
		 
		 
//<4>비트 시프트 연산자 
		//비트 단위로 이동   ( <<   , >>)
		 private static void bitShiftEx() {
			 int val = 1;
			 //좌측 shift
			 System.out.println(val); //1
			 System.out.println(val<<1); //2
			 System.out.println(val<<2); //4
			 System.out.println(Integer.toBinaryString(val<<1)); //왼쪽으로 1비트 이동  10
			 System.out.println(Integer.toBinaryString(val<<2)); //왼쪽으로 2비트 이동  100
			//우측 shift	 
			 val = 0b1000;
			 System.out.println(Integer.toBinaryString(val)); //1000
			 System.out.println(val>>1); //4
			 System.out.println(val>>2); //2
			 System.out.println(Integer.toBinaryString(val>>1)); //왼쪽으로 1비트 이동 100
			 System.out.println(Integer.toBinaryString(val>>2)); //왼쪽으로 2비트 이동 10
		   
		 }
		
		 
		 
//<5>3항 연산자
		 //코드가 깔끔해보이긴 하나 복잡한 흐름에서는 가독성이 오히려 떨어집-이럴땐 if가 낫다.                         
		 private static void conditionalOperEx() {
			 int a = 10;
			 // 만약, a가 짝수면 "짝수" 홀수면 "홀수"        //a가 짝수면 2로 나눈나머지가 0이 되고 홀수면 0이 아닐것을 이용하자 
			 String result = a % 2 ==0?"짝수": "홀수";  //결과가 문자열이니까 String result 라고 쓴거다 
			 System.out.println(a + "는 짝수? " + result);
			 
			 int score = 5;
			 //만약 score >= 80 good
			 //80> score > 50 :pass
			 //나머지  : fail 
			 
			 String message = score >= 80 ? "Good" : score > 50 ?  "Pass" : "Fail";
			 System.out.println("Score: "  + score + ", Result: " + message);
			 
		 }
		 
	
	}

