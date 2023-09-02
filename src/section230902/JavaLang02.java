package section230902;

/*
 * 1. 얕은복사 Shallow Copy
 * - 참조형변수에 주소값만 복사
 * - 동일한 객체를 참조하게 된다
 * 
 * 2. 깊은복사 Deep Copy
 * - 객체의 멤버변수값과 객체가 참조하는 객체까지 모두 복사하는 방식
 * - 값은 그대로 복사하지만, 새롭게 다른 객체를 참조하게 된다
 * 
 * */

import section230902.access03.SoccerTeam;

public class JavaLang02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		SoccerTeam team01 = new SoccerTeam("이름", "지역", "리그", 10);
		SoccerTeam team02 = team01;
		
//		if(team01.equals(team02)) {
//			System.out.println("동일한객체");
//		} else {
//			System.out.println("다른각체");
//		}
		
		// 해시코드 확인할때
		// System.out.println(System.identityHashCode(team01));
		// System.out.println(System.identityHashCode(team02));
		
		// team01의 객체정보를 team03로 복사함
		SoccerTeam team03 = (SoccerTeam) team01.callClone();
		
		
		System.out.println(team01);
		System.out.println(team02);
		System.out.println(team03);
		
		if(team01.equals(team03)) {
			System.out.println("동일한객체");
		} else {
			System.out.println("다른각체");
		}
		
		// 해시코드 확인할때
		 System.out.println(System.identityHashCode(team01));
		 System.out.println(System.identityHashCode(team03));
		 
		 /*
		  * 즉, team03은 team01의 객체내용을 그대로 복사되긴했지만
		  * team01와 동일한 객체가 아닌 새로운 객체로 만들어진 것이다.
		  * */
	}
}
