  
package com.javaex.practice02;

public class problem03 {
//[문제] 주어진 문자열의 공백을 ‘,’(콤마) 로 변경 후 출력하세요.
	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') c[i] = ',';
		}
		
		for (char chr: c) {
			System.out.print(chr);
		}
		System.out.println();

	}

}