package com.javaex.io.bytestream.a18;
//ppt05-20 p/44   

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx2 {//files 디렉토리를 얻어와야한다.  상수로 작성하자  
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";  //System.getProperty("user.dir"):프로젝트의 루트 디렉토리를 얻어올수 있다.
	static final String source = rootPath + "img.jpg"; //원본파일명도 상수로 지정하겠다. 
	static final String target = rootPath + "img_copy.jpg"; //타켓파일명을 상수로 
	
	public static void main(String[] args) {
		InputStream is = null; //파일로부터 입력을 받을 것이니까 일단 null로 비워두자  -=>import 하자
		OutputStream os = null;                                          //-=>import 하자
		
		try {
			is = new FileInputStream(source);	//-=>import 하자
			os = new FileOutputStream(target);  //-=>import 하자
			
			int data = 0;	//	1byte를 읽고 int으로 변환 (중요!!)
			
			System.out.println("복사를 시작합니다...");
			while((data = is.read()) != -1) {
				os.write(data);
			}
			System.out.println("복사를 종료합니다...");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다");
		} catch (IOException e) {
			System.err.println("복사 실패!");
		} finally {
			try {
				os.close();
				is.close();
			} catch (Exception e) {
				
			}
		}

	}

}