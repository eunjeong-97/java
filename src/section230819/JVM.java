package section230819;

/*
 * ✅ JVM (Java Virtual Machine)
 * 자바 애플리케이션을 실행하기 위한 가상머신
 * JVM은 운영체제와 자바애플리케이션 사이의 브릿지역할을 한다
 * 
 * ✅ JVM 메모리구조
 * 1. 메서드영역(Method Area) OR 클래스영역(Class Area)
 * - JVM이 실행하는 애플리케이션이 사용하는 클래스 정보를 저장함
 * - JVM이 시작될 때 클래스로더에 의해 로드되며, 모든 스레드가 공유한다
 * 
 * 2. 힙영역(Heap Area)
 * - 객체 인스턴스가 저장되는 영역, 동적으로 생성된 객체들이 할당된다
 * 
 * 3. 스택영역 (Stack Area)
 * - 메서드 호출과 관련된 정보(로컬변수, 매개변수, 메서드호출 등) 저장됨
 * - 각 스레드마다 별도의 스택이 생성된다
 * 
 * 4. PC 레지스터 (Program Counter Register)
 * - 현재 실행중인 명령어의 주소를 가리키는 포인터
 * 
 * 5. 네이티브 메서드 스택 (Native Method Stack)
 * - 자바 코드 외부의 C, C++ 등과 같은 네이티브코드 실행할 때 사용됨
 * */

public class JVM {
	public static void main(String[] args) {
		Car car01 = new Car();
		Car car02 = new Car();
		System.out.println(System.identityHashCode(car01));
		System.out.println(System.identityHashCode(car02));
	}
}
