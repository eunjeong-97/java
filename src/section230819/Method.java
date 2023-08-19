package section230819;

/*
 * ✅ 메서드 Method
 * 프로그래밍에서 메서드는 하나의 특별한 목적의 작업을 수행하기 위해 설계된 프로그램 코드 집합이다
 * 객체의 기능역할을 한다
 * 
 * 메서드 구조
 * (접근제한자) (정적) 반환타입 메서드이름(매개변수타입 매개변수명) { // 선언부
 * 		실행코드
 * 
 * 		(return 반환값;)
 * }
 * */

/*
 * ✅ 인스턴스 메서드
 * static 정적메서드는 프로그램 시작과 동시에 메모리에 올라가서 객체생성없이 호출할 수 있는 반면에
 * static가 없는 인스턴스 메서드를 호출할땐 객체를 생성하고 메서드를 호출해야 한다
 * 
 * ✅ 오버로딩 메서드
 * 클래스 내부에서 같은 이름을 가진 메서드를 여러개 정의하는 것
 * 매개변수 개수가 다르거나 타입이 다르면 오버로딩이 가능하다
 * 
 * 
 * */

public class Method {
	public static void main(String[] args) {
		hello();
		
		Method instance = new Method(); // 인스턴스생성
		instance.dynamic();

		printName("안녕하세요");
		printMember("ID","NAME",10);
		printMember("ID","NAME",10, "매개변수 추가");
		printMember(100,"NAME",10, "매개변수 추가");

	}
	
	// 매개변수(인자)없음 → 메서드 호출했을때 리턴없이 실행만 하고 끝남
	public static void hello() {
		System.out.println("매개변수없이 실행되는 void 메서드");
	}
	
	// ============= 인스턴스 메서드 ============= 
	public void dynamic() {
		System.out.println("static없이 선언된 인스턴스 메서드");
	}
	
	// ============= 매개변수있는 메서드 ============= 
	public static void printName(String name) {
		System.out.println(name);
	}
	
	public static void printMember(String id, String name, int age) {
		System.out.println(id + " " + name + " " + age);
	}
	
	// ============= 오버로딩 메서드 ============= 
	public static void printMember(String id, String name, int age, String type) {
		System.out.println("매개변수 개수를 다르게 한 오버로딩");
	}
	public static void printMember(int id, String name, int age, String type) {
		System.out.println("매개변수 타입을 다르게 한 오버로딩");
	}
}
