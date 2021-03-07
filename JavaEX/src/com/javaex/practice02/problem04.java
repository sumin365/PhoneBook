package com.javaex.practice02;

public class problem04 {  //?????????????????????????????????????이해못함?????

	public static void main(String[] args) {
//[문제] 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또 (중복체크 할 것)
		int[] nums = new int[6];  //빈
		int idx =0 ; //인덱스 변수로 사용할 것이다.
		
		while (idx < nums.length) {  //012345
			// 난수 발생
			int choice = (int) (Math.random() * 45) + 1; //22
			// 중복 데이터 체크
			boolean isDuplicated = false;   //중복은 거짓

			if (idx != 0) {//12345
				// 중복 체크
				for (int i = 0; i < idx; i++) { // 0     0 1   012   0123   01234
					// 내부 값 체크
					if (nums[i] == choice) {   //
						// 중복
						isDuplicated = true;
						break;
					}
				}
			}

			if (!isDuplicated) {
				// 중복되지 않을 때 코드 수행
				nums[idx] = choice;
				idx++;
			}
		} // 난수 추출

		for (int value : nums) {
			System.out.print(value + " ");
		}
		System.out.println();

	}

}

