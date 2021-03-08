package com.javaex.oop.staticmember.a6;
//03번ppt- 32p/62  
		//미션:
		//어떤 상황에서도 단 하나의 인스턴스만 유지
		//생성자 -> 접근 금지
		public class Singleton {
		//	static 영역에 단 하나의 인스턴스객체를 담아둔다
		private static Singleton instance = new Singleton();
		
		// 그래서 새로운 인스턴스 안만들려고 
		//	생성자 private로 만들기 
        //	new 호출 불가
		private Singleton() {
		
		}
		
		 
		//instance도 private다  어떻게 instance꺼낼까 그래서 getter등장 -  getInstance()
		public static Singleton getInstance() { //애도 static이지   라는 말  이해못함 =========================?????????????????
		return instance;
		}
		}