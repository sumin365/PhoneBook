package com.javaex.api.generics.v2.a14;
//ppt04-43p/69
public class IntBox {
//	필드
	Integer content;

	//	getter/setter
	public Integer getContent() {
		return content;
	}

	public void setContent(Integer content) {
		this.content = content;
	}
}

//	두개의 박스파일을 봤을 떄 데이터의 차이가 있다 리턴 타입  파라미터 타입 모두 integer
//	이걸 가지고 확장을 해보자 
//	
//	중복 코드가 발생한다. 
//	integer 클래스나 String클래스 모두 위로 올라가다보면 object클래스를 만난다. 
//	예전에는 이렇게 했었다. 
	

