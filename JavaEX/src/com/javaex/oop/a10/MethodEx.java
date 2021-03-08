package com.javaex.oop.a10;
//03ppt- 17p/62

public class MethodEx {

	public static void main(String[] args) {
//1.
	printDivide(5,3);
	printDivide(5,0); // <-----------------------------------------------------------------------이 다음으로 간다. 
    
	
//2.	
	double result = getSum(4,5);
    System.out.println("4+5=" + result);
//3.    
    System.out.println("getSum: "+ getSum(new double[] {
    		1,2,3,4,5,6,7,8,9,10
    }));
//4.    
    System.out.println("getSumMany: "+ getSumMany(1,2,3,4,5,6,7,8,9,10));
    
	}

//1.	반환 값이 없을 경우 void 타입 지정
 private static void printDivide(int num1, int num2) { //밖에선 호출 불가능  //반환값이 없을 경우 void로 지정한다. 
	if (num2==0 ) {
		System.out.println("0으로 나눌 수 없어요 ");
		return;  //return문을 만나면 남은 코드는 수행하지 않고 호출된 곳으로 돌아간다. 
	}
	 System.out.println(num1/num2);
	 
 
}
 
//2.반환값을 받고자 한다면 리턴 타입을 지정해야함
	private static double getSum(double num1, double num2) {
		return num1+ num2 ;  //반드시 지정한 리턴타입과 일치해야함
	}

 
 //3.매개변수의 개수를 모를 떄-> 배열을 이용함
 private static double getSum(double[] values) {
	 double total =0;
	 for (double value : values) {
		 total += value;
		 
	 }
	 return total;
 }
 //4.가변인수:  ...
 private static double getSumMany(double... values) {
//	 double total =0;
//	 for (double value : values) {
//		 total += value;
//		 
//	 }
//	 return total;      이렇게 길게 쓸 필요없이 위에꺼 리턴하자 
	 return getSum(values);
	 
 }
}
