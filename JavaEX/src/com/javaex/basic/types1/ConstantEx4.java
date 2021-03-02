package com.javaex.basic.types1;
//상수 : 변하지 않는 수 
//선언, 초기화 , 조회는 가능// 변경은 불가능
//상수 사용시 : 코드의 가독성 높아짐 / 코드 변경 불가해서 안정성 높아짐 
public class ConstantEx4 {
    static final int SPEED_LIMIT =110;    //final 할당 이후 변경 불가 상수가 되어버림
	
     public static void main(String[] args) {

// 		boolean b1 = speed > 110;
//	   final int SPEED_LIMIT =120;  또는  static fianl int SPEED_LIMIT =120; 으로 위에 써도 됨 
		int speed = 120;
		boolean b1 = speed > SPEED_LIMIT;
		System.out.println("제한 속도를 초과하였습니까? " + b1);
		System.out.println("제한 속도는 " +110 + "입니다." );
		
		
	}

}
