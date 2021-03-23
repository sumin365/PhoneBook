package com.javaex.io.bytestream.a18;
//ppt05-30p/44 
//<<<<<<<보조스트림>>>>>>>>>>>>>바이트기반 

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx3 {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";  //System.getProperty("user.dir"):프로젝트의 루트 디렉토리를 얻어올수 있다.
	static final String source = rootPath + "img.jpg"; //원본 소스
	static final String target = rootPath + "img_buffered_copy.jpg"; 
	
	//파일복제 프로그램과   보조스트림은 어떤차이가 날까??? 
	public static void main(String[] args) {
		// main stream
		InputStream is = null;
		OutputStream os = null;
		
		//	보조스트림 열어주기
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try { //InputStream에서 데이터를 하나씩 불러와서 복사해야한다. 
			//메인 스트림 열기
			is = new FileInputStream(source);
			os = new FileOutputStream(target);
			
			bis = new BufferedInputStream(is);  //보조스트림은 입출력을 직접 수행하지 않고 , is os로 부터 소스를 전달받아서 쓴다. 부가기능만 나타낸다. 
			bos = new BufferedOutputStream(os);
			
			//	버퍼를 생생 (데이터를 불러오자 버퍼기관을 불러올꺼니까 )
			byte[] data = new byte[1024];	//	1KB  //버퍼를 사용하고자 할떄 데이터가 직접 넘어오는게 아니라 버퍼에 담기게 될것이고 
			                                         //실제 넘어오는 리턴 타입은 받아온 데이터의 길이가 된다. 
			int size = 0;	//	받아온 데이터의 길이
			
			
			System.out.println("복사 시작");
			while((size = bis.read(data)) != -1) { //다른 파일에서는 직접 데이터를 받아왔찌만
				                                   //여기선 데이터를 적재시킨다음 적재된 데이터 사이즈가 할당된다. 
				System.out.println(size + "바이트 복사했습니다.");
				bos.write(data); //보조스트림
			}
			System.out.println("복사 완료");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//	보조스트림은 주스트림으로부터 입출력 기능을 수행하므로
				//	보조스트림을 닫으면 주스트림도 닫힌다
				bis.close();
				bos.close();
			} catch (Exception e) {
				//성능이 향상되었다. 파일복제가 더 빨라졌다. 
			}
		}

	}

}