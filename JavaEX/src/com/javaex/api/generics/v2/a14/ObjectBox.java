package com.javaex.api.generics.v2.a14;

public class ObjectBox {
	private Object content;
 
	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
}
//오브젝트라서 모든 타입이 다 들어간다. 
//필드타입/ 리턴타입/  파라미터 모두 object ->이것들만 바꿔주면 된다.  ->genericBox를 만들어서 다시 해보자 