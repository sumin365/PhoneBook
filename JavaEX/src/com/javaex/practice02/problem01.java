package com.javaex.practice02;

public class problem01 {
//아래 배열에서 	3의 배수의 갯수와, 3의 배수의 합구해라
	public static void main(String[] args) {
       int[] data = { 1,3,5,7,9,11,15,19,18,20,30,33,31};
	int total = 0 , count = 0 ;
	//배열안의 순서번호(인텍스가 안중요)안중요하니까 하나씩 뽑기    ppt첫번쨰 126p-> Enhanced for loop 
	
	for (int num: data) {
		if (num % 3 == 0) {
			total += num;
			count++;
		}
	}
	
	System.out.println("3의 배수의 합:" + total);
	System.out.println("3의 배수의 갯수:" + count);

}

}