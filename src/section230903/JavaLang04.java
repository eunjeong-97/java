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
