package com.javaex.oop.summary.i;
//03ppt - 54p/62

public class SummaryApp {
//	쿵후 도장
	static KungfuSkill[] dojang;	//	인터페이스의 배열 - 쿵푸스킬만 가진 사람만 회원으로 바뀌겠찌???????????????????????
	
	public static void main(String[] args) {  
		Human h1 = new Human("홍길동", 30);
		Human h2 = new TheOne("네오", 50);
		Panda p1 = new Panda("핑", 30);
		Panda p2 = new KungfuPanda("퐁", 15);

		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		
		fly(h1);
		fly(h2);
		fly(p1);
		fly(p2);
		
		//	도장에 등록
		dojang = new KungfuSkill[] {  //그냥 h1,h2,h3,h4로 할수없다. human타입panda타입으로 있어서 그래서 강제로 KungfuSkill로 casting해줘야한다. 
//				(KungfuSkill)h1,	//	그렇지만 이건 캐스팅 될 수 없다
				(KungfuSkill)h2,
//				(KungfuSkill)p1,	//	그렇지만 이건 캐스팅 될 수 없다
				(KungfuSkill)p2
		};
		
		//	루프  01ppt - 126p/126 - 배열쓰고 for쓰고 
		for (KungfuSkill member: dojang) { //dojang을 하나씩 꺼내서 member에 넣어보자 
			member.kungfu();
		}
	}
	
	public static void fight(Animal actor) {
		//	actor가 kungfu를 할 수 있나?
		if (actor instanceof KungfuSkill) {
			//	다운캐스팅 가능
			((KungfuSkill)actor).kungfu();
		} else {
			System.out.println(actor.name + ": 쿵후 못해요~");       //??????????????????????????????
		}
	}
	
	private static void fly(Animal actor) {
		//	actor가 하늘을 날 수 있나?
		if (actor instanceof Flyable) {
			((Flyable)actor).fly();
		} else {
			System.out.println(actor.name + ": 날 수 없어요~");
		}
	}

}