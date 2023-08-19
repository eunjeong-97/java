package section230819;

/*
 * 변수 (Variable)
 * 값을 저장하기 위한 메모리 공간
 * 변수는 이름을 통해 해당 메모리 공간에 접근하고 값을 읽거나 수정이 가능함
 * 
 * 변수선언 및 초기화
 * 자료형 변수명 = 값 OR 객체주소값(참조값)
 * 
 * ==========================================================
 * 1. 타입에 따른 변수
 * 
 * ✅ 기본형 변수
 * - 예약어
 * - 소문자로 시작
 * - 직접 값을 가짐
 * 예) boolean, char, byte, short, int, long, float, double
 * 
 * ✅ 참조형 변수
 * - 기본형 이외의 나머지값
 * - 참조(주소)값을 가지고 있음
 * - 보통 대문자로 시작하지만 소문자도 가능(클래스명)
 * 예) String
 * 
 * ==========================================================
 * 2. 선언위치에 따른 변수
 * 
 * ✅ 전역변수
 * - 클래스에 선언된변수(멤버변수, 멤버필드)
 * - 초기화하지 않으면 default값 부여받음
 * boolean: false
 * 정수형(int): 0
 * 실수형(float): 0.0
 * 참조형: null
 * 
 * ✅ 지역변수
 * - 메서드 또는 생성자 안에 선언된 변수
 * - 매개변수또한 지역변수임
 * - 메서드 종료시 메서드와 같이 소멸됨
 * - 초기화안하면 컴파일에러발생
 * */
public class Variable08 {
	// 전역변수
	static int globalNum = 100;
	static int globalNum2; // 전역변수는 초기화하지 않으면 0으로 초기화됨
	public static void main(String[] args) {
		int areaNum2;
		
		System.out.println("globalNum2 : "+globalNum2); // 0
		
		// System.out.println("areaNum2 : "+areaNum2); // 지역변수는 초기화하지 않으면 컴파일에러남
	}
	
	public static void areaNum() {
		// 지역변수
		int areaNum = 10;
	}
	
	public static void printNum() {
		// 지역변수는 컴파일에러뜸
		// System.out.println("전역변수 : "+globalNum+ " 지역변수 : " +areaNum);
	}
}
