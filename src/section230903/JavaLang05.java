package section230903;

/*
 * 래퍼클래스 Wrapper Class
 * 기본 자료형을 객체로 감싸서 사용할 수 있게 해주는 클래스
 * 
 * 종류
 * - Integer: int의 래퍼 클래스.
 * - Double: double의 래퍼 클래스.
 * - Boolean: boolean의 래퍼 클래스.
 * - Character: char의 래퍼 클래스.
 * - Long: long의 래퍼 클래스.
 * - Float: float의 래퍼 클래스.
 * - Short: short의 래퍼 클래스.
 * - Byte: byte의 래퍼 클래스.
 * 
 * [챗지피티] Wrapper Class
 * 기본 데이터타입을 객체로 래핑해서 사용하는 클래스 (객체로 사용하게)
 * 자바의 객체지향 프로그래밍 환경에서는 기본 데이터타입을 객체로 다뤄야할때 유용함
 * 
 * 래퍼클래스를 사용하는 목적
 * 1. 기본데이터타입을 객체로 사용
 * - 기본데이터 타입은 객체가 아니기 때문에 컬렉션저장이나 메서드호출같은 객체와 관련된 기능 수행못함
 * - Wrapper Class를 사용하면 기본데이터타입을 객체로 래핑해서 객체와 관련된 작업 수행가능
 * 
 * 2. null값 표현
 * - 기본데이터 타입은 null값을 가질 수 없지만
 * - Wrapper Class는 null을 가질 수 있고, null을 값으로 사용하면 유용하다
 * 
 * 3. 메서드를 호출하기 위한 매개변수
 * - 일부 메서드는 기본데이터타입 대신 Wrapper Class 객체를 매개변수로 받는 경우가 있음
 * */

public class JavaLang05 {
	public static void main(String[] args) {
		
		
		// [1] 문자열 "12345" → 정수형 int 변환
		String str = "12345";
		int num = Integer.parseInt(str);
		System.out.println(num);
		
		// [2] 기본형처럼 대입가능
		Integer num02 = 10;
		
		// 생성자를 통한 선언은 JDK 1.9버전부터 사용하지 않는 것이 권장됨		@SuppressWarnings("removal");
		@SuppressWarnings("removal")
		Integer num03 = new Integer(10);
		Integer num04 = Integer.valueOf(10);
		Integer num05 = Integer.valueOf(10);
		
		System.out.println("Integer 타입으로 변수선언" + num02 + " 해시코드 : " + System.identityHashCode(num02));
		System.out.println("생성자로 Integer타입 변수선언" + num03 + " 해시코드 : " + System.identityHashCode(num03));
		System.out.println("Integer.valueOf (1)" + num04 + " 해시코드 : " + System.identityHashCode(num04));
		System.out.println("Integer.valueOf (2)" + num05 + " 해시코드 : " + System.identityHashCode(num05) );
		
		// [3] 실수형 타입선언
		Double double01 = Double.valueOf(3.12345);
		
		// [4] 문자열 타입선언
		Character ch = Character.valueOf('a');
	}
}
