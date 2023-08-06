package section230806;

/*
 * 변수(Variable)
 * 데이터를 저장하고 참조하기위한 메모리 공간을 나타내는 이름
 * 변수는 이름을 통해 해당 메모리 공간에 접근하고 값을 읽거나 수정할 수 있다
 * 
 * 변수선언 및 초기화방법
 * 자료형 변수명 = 값;
 * 
 * 기본자료형
 * 자바에서 기본적으로 제공해주는 자료형
 * 	정수형: byte, short, int, long
 * 	실수형: float, double
 * 	문자형: char
 * 	논리형: boolean
 * 
 * */

public class Variable {
	// 처음으로 실행되는 구간
	public static void main(String[] args) {
		// 정수형변수
		int numInt; // 변수선언
		numInt = 10; // 값 대입(초기화)
		// C언어는 값 대입(초기화)를 하지않고 해당 변수를 사용하면 가비지가 생기는데
		// 자바는 컴파일에러가 발생한다
		numInt = 3; // 변수값 수정
		// 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
		System.out.println(numInt);
		
		// 실수형 변수
		double numDouble = 10.2;
		
		// 문자열 변수: 자바에서 제공은 해주지만, 자바기본문법이 아님
		// 참조형임 char대신 String타입으로 사용하기
		String str = "Hello";
		
		// 
		System.out.println(numDouble);
		System.out.println(str);
		
	}

}
