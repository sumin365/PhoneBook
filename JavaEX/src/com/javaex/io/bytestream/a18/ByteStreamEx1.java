package com.javaex.io.bytestream.a18;
//ppt05-15p/44 

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteStreamEx1 {

	public static void main(String[] args) {
		//	입력 소스
		byte input[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//	목적지
		byte output[] = null;
		
		System.out.println("원본:" + Arrays.toString(input));
		
		//	스트림 열기-  InputStream, OutputStream :추상클라스라서 직접 객체화 할 수 없다.  -> 2개 import하기 
		InputStream bis = null;
		OutputStream bos = null;  //bos의 참조타입은 OutputStream 
		
		try {
			//실체 객체 만들기
			bis = new ByteArrayInputStream(input); //입력소스
			bos = new ByteArrayOutputStream(); //출력소스  //bos의 실체클라스는 ByteArrayOutputStream// bos가 OutputStream 이기 떄문에 ByteArrayOutputStream의 메소드를 사용하기 위해서는 
			                                              //ByteArrayOutputStream 이쪽으로 캐스팅해야한다.  ----------------------------->|
			
			//	입력을 위한 변수
			int data = 0;
			
			while((data = bis.read()) != -1) {	//-1이 아니면 데이터를 읽어올수 있다. -(	읽을 데이터가 없으면 -1)
//				data = bis.read();                                        	//	1바이트를 읽어옴
				System.out.println("읽은 데이터:" + data);
			
				
				//	OutputStream으로 출력
				bos.write(data);   //출력하는법1번
			}
			
			//	타겟 배열로 출력
			output = ((ByteArrayOutputStream)bos).toByteArray();//출력하는법2번<-------------------------------------------------------|
			System.out.println("출력:" + Arrays.toString(output)); //출력하는법3번
			
			
		} catch (IOException e) {
			//	IO 예외 처리
			e.printStackTrace();
		} finally {	//	자원의 정리                           //여기서도 예외가 발생할수도있다. close때문에
//			if (bos != null)
//				bos.close();
//			if (bis != null) 
//				bis.close();
			try {
				bos.close();
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	//입출력관련된  IO 예외 처리 / read/ close 와  같은 (checked 예외)는 무조건 예외처리 필수로 해야한다.  

	}

}