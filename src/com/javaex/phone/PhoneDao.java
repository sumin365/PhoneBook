package com.java.phone;

import java.util.List;//
import java.util.Scanner;

public interface PhoneDao {
	//리스트
	public List<PhoneVO> getList();
	
	//출력
	public List<PhoneVO> search(String toSearch);
	
	//등록
	public boolean insert(PhoneVO vo);
	
	//삭제
	public boolean delete(Long id);
	
	

	
}