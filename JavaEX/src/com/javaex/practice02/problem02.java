package com.javaex.practice02;

import java.util.Scanner;

public class problem02 {
//[문제] 5개의 숫자를 키보드로 입력받아 배열에 저장한 후, 평균을 구하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		 Scanner scanner = new Scanner (System.in);
		 int values[]= new int [5];
//			입력 + 저장
			for (int i = 0; i < values.length; i++) {
				values[i] = scanner.nextInt();
			}
			
			//	합산
			int total = 0;
			for (int num:values) {
				total += num;
			}
			
			double average = (double)total / values.length;
			System.out.printf("합계는 %d, 평균은 %.2f%n", total, average);
			
			scanner.close();
			
		}

	}