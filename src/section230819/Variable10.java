package section230819;

/*
 * JVM Runtime Data Area
 * 
 * [Method Area]
 * 프로그램이 시작할때 생성되고 해당 프로그램이 끝날때 사라짐
 * 즉, 프로그램이 실행되는동안에 계속 존재함
 * 구성요소: 프로그램 실행코드, static area, constant pool
 * 
 * [Heap Area]
 * 실행하는 코드에 따라 객체가 추가되고 삭제됨
 * JVM이 가지고 있는 가비지 컬렉터가 일정시간동안 사용하지 않는 객체 삭제함
 * 가비지컬렉터가 있어서 메모리부담이 적어진다
 * 
 * [Stack Area]
 * 코드를 작성한대로 스택쌓임
 * 구성요소: 지역변수, 매개변수(파라미터)
 *
 **/


/*
 * 가비지컬렉터 (Garbage Collector)
 * 자바에서 동적으로 할당된 메모리(힙역역) 중에서 더이상 사용하지 않는 객체를 찾아 제거하는 프로세스
 * */

public class Variable10 {
	// 참조형변수, 전역변수, 동적변수
	 Car car01 = new Car();
	 
	 public static void main(String[] args) {
		// 참조형변수, 지역변수
		 Car car02 = new Car();
		 
		 // 기본형변수, 지역변수
		 int num = 10;
	}
}
