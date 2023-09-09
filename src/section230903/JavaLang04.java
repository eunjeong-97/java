package section230903;

/*
 * StringBuffer
 * 문자열을 동적으로 다루기 위한 클래스
 * Thread Safe 보장됨
 * 
 * StringBuilder
 * 문자열을 동적으로 다루기위한 클래스
 * Thread Safe 보장안됨
 * 
 * [챗지피티] StringBuffer와 StringBuilder
 * 두 클래스 모두 문자열의 가변성을 제공하는 클래스
 * 문자열을 변경하거나 조작할때 사용됨
 * 주로 성능이나 스레드 안전성에 따라 선택함
 * 
 * [StringBuffer]
 * - 가변적인 문자열을 생성하고 조작하기 위한 클래스
 * - 스레드가 안전한 특성 → 멀티스레드 환경에서 안전하게 사용가능
 * - 문자열에 대한 추가, 수정, 삭제 등과같은 변경작업이 필요한 멀티스레드 애플리케이션에서만 사용됨
 * - 단일스레드 환경에서는 StringBuilder 보다 성능이 떨어질수 있음
 * 
 * [StringBuilder]
 * - 가변적인 문자열을 다루는 클래스
 * - 문자열을 변경하고 조작할때 사용됨
 * - StringBuffer보다 스레드 안전하지 않지만, 단일스레드 환경에서는 더 빠른 성능
 * 
 * 결론
 * 가변적인 문자열을 생성하고 조작할때 StringBuffer이나 StringBuilder 클래스를 사용하는데
 * 멀티스레드 환경에서는 StringBuffer 클래스를 사용하고
 * 싱글스레드 환경에서는 StringBuilder 클래스를 사용한다
 * 
 * */

public class JavaLang04 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		sb.append("def");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		StringBuilder builder = new StringBuilder();
		builder.append("ABC");
		System.out.println(System.identityHashCode(builder));
		builder.append("DEF");
		System.out.println(System.identityHashCode(builder));
		
		System.out.println(builder);
		
	}
}
