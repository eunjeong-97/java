package section230819;

/*
 *	3. 접근제한자 static 여부
 * ✅ static 예약어가 붙은(정적변수) 멤버변수
 * - 같은 타입의 모든 객체가 공유하는 변수
 * - 클래스명으로 접근가능
 * 
 * ✅ static 접근제한자가 없는 동적변수(일반변수)
 *
 * */

public class Variable09 {
	
	public static void main(String[] args) {
		Card card01 = new Card();
		Card card02 = new Card();
		
		System.out.println("초기값");
		card01.getInfo("card01");
		card02.getInfo("card02");
		
		System.out.println("");
		card01.text = "Q";
		
		// The static field Card.width should be accessed in a static way
		// static 정적변수는 인스턴스에 점연산자로 접근하는 것이 아닌, 클래스에 점연산자를 사용하라는뜻
		card01.number=60;
		
		
		System.out.println("card01 인스턴스에서만 동적변수 text, 정적변수 number 변경");
		card01.getInfo("card01");
		card02.getInfo("card02");
		
		System.out.println("");
		Card.number = 100; // 이렇게!
		System.out.println("클래스에 점연산자 사용해서 정적변수 변경");
		card01.getInfo("card01");
		card02.getInfo("card02");
	}
}
