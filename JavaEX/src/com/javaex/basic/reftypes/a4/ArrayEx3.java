package com.javaex.basic.reftypes.a4;

public class ArrayEx3 {

	public static void main(String[] args) {
		
    // arrayBasic();
    // twoDimens();
    // arrayCopyFor();
     arrayCopySystem();
	}
	private static void arrayBasic() {
	//배열의 선언
		String[] names; //타입[] 식별자변수 ->형태로 쓸수 있다. 
		int scores[];   //타입 식별자변수[] -> 이 형태도 쓸 수 있다. 
//1.미리 값이 없을 경우 		
		//초기화
		names = new String[] {
				"홍길동",
				"장길산",
				"임꺽정",
				"전우치"
		};  //;;;;;;쓰기
     //System.out.println(names);
       
//2.미리 값이 있을 경우 축약형         
       scores = new int[4]; //4개 공간의 빈 배열 할당
       //공간에 접근하려면 인덱스 이용
       System.out.println("Length of scores:" +scores.length);
       scores[0] = 80;
       scores[1] =90;
       scores[2]=75;
       scores[3]=95;
     //scores[4]=100;  배열 범위 index초과
     //System.out.println(scores);
       
       
 //3.미리 값이 있을 경우 축약형  
       float heights[] = {
    	179.5f,
    	180.0f,
    	170.5f,
    	188.0f
       };
      
       
       for (int i=0; i <names.length; i++) {
    	   System.out.printf("%s (%.2f) : score = %d%n",
    	   		 names[i], heights[i] , scores[i]);
       }
       
  //참조복사 : 내용은 동일하나 주소만 복사     
       int[] scores2= scores ;
       System.out.println("scores 와scores2눈 겉운 갹채?"+ (scores==scores2));
       
       scores2[3] = 100;
       for (int i =0 ; i <scores.length; i++)
    	   System.out.print(scores[i]+ "\t");
       
	}
//	 System.out.println();==============================================================????????????다시 쓰기 그래서 복사해서 어쩌라는거야

	 
	 
	 
	 
	 private static void twoDimens() {//2차원배열=-======================================================익숙해지기
		 int[] [] twoDimens = new int [5][10];

	 //기본 데이터가 있을 경우 초기화
		 int table[][] = { //[3][5]
				 {1,2,3,4,5} , //하나의 행의 배열
				 {2,3,4,5,6},
				 {3,4,5,6,7}
				 
				 
		
		 };
		 System.out.println("length of table :" +table.length);  //table 은 행의 길이
		                                                         //table[0] 은  행의 열의 길이
		 
		 System.out.println("length of table[0] :" +table[0].length);
	
		 int total =0 ;
		 for (int row= 0; row < table.length; row++) {
			 //행의 접근
			 for (int col = 0 ; col <table[row].length; col++) {
				 System.out.print(table[row][col] + "\t");
				 total += table[row][col];
				
			 }
			 System.out.println();
			 
		 }
		 System.out.println("배열요소의 총 합 :"+total);
		 
	 }
	 
	 
	 
	 
	 private static void arrayCopyFor() {
		 //배열의 크기는 변경이 불가 
		 //추가 공간을 확보하려면 새 배열을 만들고 원래 요소값을 복사해야한다.
		 int source[]= {1,2,3};
		 int target[]=new int [10];
		 //복사
		 for (int i =0 ; i <source.length; i++) {
			 target[i] = source[i];
		 }
		 //출력
		 for (int i =0 ; i <target.length; i++) {
		 System.out.print(target[i] +"");
		 
		  }
	 System.out.println();
	 
	 	}
	 private static void arrayCopySystem() {
			int[] source= {1,2,3};
			int target[] = new int [10];
			System.arraycopy(source,0,  //원본 배열 ,	복사 시작 위치
					target, 0,   //	타겟 배열, 타겟 배열의 시작 인덱스
					source.length);  //소스길이  3이라고 써도 되나 소스길이가 계속 변경되므로 이와 같이 작성하기 
			for (int i = 0 ; i < target.length; i++) {
				System.out.print(target[i]+"\t");
				
			}
			System.out.println();

		//Enhanced for문
		for (int value : target) {
			System.out.print(value+ "\t");
			
		}
		System.out.println();
			}
}
