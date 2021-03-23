package com.javaex.io.charstream.a19;
//ppt05-40p/44 
//"thieves.txt" 파일 속 내용을 분절시켜서 출력해보자 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx2 {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		//	Main Stream
		Reader reader = null;
		//	보조 스트림
		BufferedReader br = null;
		
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);//BufferedReader을 통해 한줄씩 읽어올것이다. 
			
			String line = null;  
			
			while((line = br.readLine()) != null) {//더이상 불러올것이 없을떄 까지 라는 뜻
				//	line을 분절
				StringTokenizer st = new StringTokenizer(line,	//	분절시킬 문자열 
									                     " ");	//	분절시킬 구분자 -만약 ""를 안쓴다면- 기본값: 공백, \t, \r, \n 으로 구분되어진다. 
				while(st.hasMoreTokens()) {	//	뒤에 토큰이 더 있는가?
					String token = st.nextToken(); //	토큰을 받아오고 다음으로 이동
					System.out.print(token + " ");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못했어요");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close(); //보조스트림만 닫으면 되겠다. 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}