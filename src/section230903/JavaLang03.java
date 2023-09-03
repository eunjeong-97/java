package section230903;

/*
 * String 클래스
 * 자바에서 문자열을 다루기 위해 사용되는 클래스
 * java.lang 패키지에 포함됨
 * 
 * 불변 immutable 의 객체
 * 생성된 후 메모리에서 문자열 값이 변경되지 않는다 
 * 장점: 메모리절약, 보안성up, Thread safe
 * 
 * [챗지피티] immutable객체의 Thread safe
 * Immutable 객체: 생성된 후에 내부상태를 변경할 수 없는 객체
 * 다른 스레드로부터 안전하게 사용될 수있는 중요한 특성임
 * 자바에서 Immutable객체를 사용하면 -> Thread Safe하다
 * 
 * [자바에서 Immutable객체를 사용하면 -> Thread Safe한 이유]
 * 1. 변경 불가능한 상태 Immutable State
 * 	- Immutable 객체는 생성된 후에 내부상태를 변경못함
 * 	- 즉, 객체의 상태가 생성 시점에서 고정되고 이후에 변경안됨
 * 
 * 2. 스레드간 공유가능
 * 	- Immutable 객체는 그 상태가 변경되지 않기 때문에 -> 다중스레드 환경에서 안전하게 공유가능함
 * 	- 여러 스레드가 동시에 해당 객체를 읽고 사용해도 문제없음
 * 
 * 3. 복사필요없음
 * 	- Mutable 객체를 여러 스레드가 공유할때, 스레드 간 동기화를 위해 복사본을 생성하고 관리해야 함
 * 	- Immutable 객체는 이런 복사작업이 필요없어서 -> 성능이 좋음
 * 
 * 4. 예측가능한 동작
 * 	- Immutable 객체는 상태가 변하지 않기 때문에 -> 예측가능한 동작보장
 * 	- 다중 스레드 환경에서도 객체의 내부상태가 바뀌지 않기 때문에 -> 상태변화로 인한 오류 방지함
 * 
 * 예) java.util패키지의 String 클래스
 * 문자열을 한번 생성하면 그 내용은 변경할 수 없음
 * 여러스레드에서 안전하게 공유가능
 * 
 * */

public class JavaLang03 {
	public static void main(String[] args) {
		
	}
}
