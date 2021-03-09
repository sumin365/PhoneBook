package com.javaex.api.generics.v1.a14;
//ppt04-43p/69
public class StringBox {

	private String content ;

	
	//문자열을 담을 수 있는 박스를 생성한다. 
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
//	두개의 박스파일을 봤을 떄 데이터/리턴 타입/  파라미터 타입/ 모두 integer
//	이걸 가지고 확장을 해보자 
//	
//	중복 코드가 발생한다. 
//	integer 클래스나 String클래스 모두 위로 올라가다보면 object클래스를 만난다. 
//	예전에는 이렇게 했었다. 
}
