package com.javaex.io.charstream.a19;
//ppt05-33p/44 
//마지막입새 파일을 한 줄 씩읽어온뒤 
//leaf 나 leaves단어가 있으면 그 줄만 다른 파일에 저장해보자 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx1 {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "last-leaf.txt";
	static final String target = rootPath + "last-leaf-filtered.txt";
	
	public static void main(String[] args) {
		// Main Stream
		Reader reader = null; //->import
		Writer writer = null; //->import
		
		//	보조 스트림
		BufferedReader br = null; //->import
		BufferedWriter bw = null; //->import
		
		try {
			reader = new FileReader(source);
			writer = new FileWriter(target);
			
			br = new BufferedReader(reader); //보조기관에 넣어주자 
			bw = new BufferedWriter(writer);
			
			//	편의 기능으로 한 줄 단위(개행된 문자열) 입출력할 수 있다  (앞에서는 캐릭터 단위로 불러왔었음)
			String line = null;
			
			while((line = br.readLine()) != null) { // .readLine() :한줄씩 읽어오자  //문자열이 끝나면 null이 나오니까 이렇게 코딩
//	읽어들인 라인 중, leaf or leaves 단어가 포함된 라인만 target으로 저장 ->.contain으로 확인하자
				if (line.toLowerCase().contains("leaf")||  //소문자 대문자가 모두 있으니 하나로 바꿔서 검색해보자 
						line.toLowerCase().contains("leaves")) {
					System.out.println(line);
					bw.write(line);
					bw.newLine(); //	개행 출력
				}
			}
			
			System.out.println("필터링 완료!");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();	//	보조스트림을 닫으면 주 스트림도 닫힌다
				bw.close();
			} catch (Exception e) {
				
			}
		}
	}

}