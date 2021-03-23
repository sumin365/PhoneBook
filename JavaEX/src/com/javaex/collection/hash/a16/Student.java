package com.javaex.collection.hash.a16;
//ppt04-63p/69
public class Student {

//	필드
	int id;
	String name;
	
	//	생성자
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	@Override
	public int hashCode() {
		//	객체의 유일 식별자 -> int  - 아이디를 식별자로 써도 될것같다 .
		//return super.hashCode(); 에서 아이디로 바꾸자   그럼홍길동이 .hashCode()가 같게 될 것이다. 
		return id;
	}
	
	

	@Override //->equals체크 - 두 값이 같은지를 비교하는 객체를 만들자 
	/*s1.equals(s4)에서 s4가 student객체인지 확인을 해야 - 캐스팅 가능 . 필드 비교 가능해짐
	 * 
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			//	캐스팅 가능
			Student other = (Student)obj; //이제 필드 비교 가능해짐 
			return name.equals(other.name)   &&     id == other.id;	 //이러면 같은 객체다 라는 말 
		}
		return super.equals(obj);
	}
}