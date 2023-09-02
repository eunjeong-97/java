package section230902;

import section230902.access03.SoccerTeam;

/* java.lang 패키지
 * 자바에서 기본 제공하는 패키지
 * import 없이 사용가능한 패키지
 * 
 * Object 클래스
 * 자바에서 모든 클래스의 최상위 부모 클래스
 * 명시하지 않아도 모든 클래스는 Object 클래스를 상속받음
 * 
 * equals()
 * 두 객체가 동일한 객체면 true, 동일하지 않으면 false 반환
 * 
 * hashCode() -> 
 * 객체의 메모리 번지를 이용, 해시코드를 만들어 리턴
 * System.identityHashCode() 으로 해시코드 확인하자
 * 
 * toString()
 * 객체의 문자정보를 반환, 객체를 문자열로 표현한다
 * 
 * clone()
 * 새로운객체로 복사, Clonable 인터페이스 상속받은 객체만 사용가능
 * 
 * */
public class JavaLang01 {
	public static void main(String[] args) {
		SoccerTeam team01 = new SoccerTeam("이름","지역","리그",10);
		SoccerTeam team02 = new SoccerTeam("이름","지역","리그",10);
		
		// section230902.access03.SoccerTeam@7c30a502
		// @7c30a502 : 주소값을 해시코드로 바꿔서 16진수화시킨 값
		System.out.println(team01);
		
		// println 자체가 이미 toString() 메서드를 호출한다는 뜻
		System.out.println(team01.toString());
		
		
		if(team01.equals(team02)) {
			System.out.println("동일한객체");
		} else {
			System.out.println("다른각체");
		}
		
		// 해시코드 확인할때
		System.out.println(System.identityHashCode(team01));
		System.out.println(System.identityHashCode(team02));
		
		// 다른데서 오버라이딩될수도 있기 때문에 hashCode 는 비추
		System.out.println(team01.hashCode());
		System.out.println(team02.hashCode());
	}
}
