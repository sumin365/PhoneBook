package com.javaex.basic.types.a2;

public class CastingEx7 {

	public static void main(String[] args) {
		//implicitCastingEx();
		explicitCastingEx();
	}
	        //명시적 캐스팅
			//데이터 유실 가능성
			//개발자가 명시적으로 타입을 변환해줘야함
	        private static void explicitCastingEx() {
	        double d = 1234.567; //8바이트 실수형
	        System.out.println(d);

	        float f  = (float)d; //4바이트 실수형
			System.out.println(f);
			
			long l = (long)f ; //8바이트 정수 
			System.out.println(l);
			
			byte b=(byte)l; //1바이트 정수
			System.out.println(b);
	        }
			// 암묵적 캐스팅 ( implicit casting promotion)
			// 표현 범위가 좁은 자료형 -> 넓은 자료형 : 자바가 자동으로 변환함
	        
	        
	     
			private static void implicitCastingEx() {	
				byte b=25; //1바이트 정수
				System.out.println(b);
				
				short s = b; //2바이트 정수
				System.out.println(s);
				
				int i = s; //4바이트 정수 
				System.out.println(i);
				
				long l = i ; //8바이트 정수 
				System.out.println(l);
				
				float f  = l; //long이 float보다 바이트 수는 크지만 표현 범위가 좁다. 
				System.out.println(f);
				
				double d = f;
				System.out.println(d);

}
}
