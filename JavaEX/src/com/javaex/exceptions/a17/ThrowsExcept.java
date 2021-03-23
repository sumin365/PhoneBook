package com.javaex.exceptions.a17;
//ppt03-56-62p/62

import java.io.IOException;

public class ThrowsExcept {
	public void executeChecked() 
			    throws IOException {	//	내부 발생 예외를 호출한 메서드에서 처리할 수 있도록 위임  내부에서 처리 안하도록        그리고 ->import해주기
		System.err.println("강제 체크드 예외 발생");
		//	강제로 예외 발생 키워드:throw
		throw new IOException("강제 예외");   
		//	IOException은 checked exception -> 반드시 예외 처리 필요 (try든 throw를 이용하든 무조건 처리필수 )->throw안하면 컴파일 에러발생
	}
	
	public void executeRuntime() {
		System.err.println("런타임 예외");
		throw new RuntimeException("런타임 익셉션");	//	unchecked 예외 -> 예외 처리를 강요하지 않음 - ->throw안해도됨
	}
	
	
	
	
//<<<<<<<<<<"사용자 정의 Exception>>>>>>>>>>>>>>>	
	public double divide(int num1, int num2) {
		double result;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			//	예외 전환: 보다 구체적인 예외로 전환하는 것
			throw new CustomArithmeticException("사용자 정의 Exception", num1, num2);
		}
		
		return result;
	}
}