package com.javaex.api.generics.v2.a14;

//Generic
//설계시에는 내부 타입을 지정하지 않고
//	-> 인스턴스화 할때 내부 타입을 지정해주는 방식
	public class GenericBox<T> {	//	<템플릿문자> - T는 템플릿의 약자
	private T content;
	
	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}
	} 
	
	