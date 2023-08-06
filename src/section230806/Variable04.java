package section230806;

/**
 * 4.  실수형
 * float (4바이트) : 소수점 7자리 표혐
 * double (8바이트) : 소수점 15자리 표현
 * 
 * 
 */

public class Variable04 {
	public static void main(String[]args) {
		float isFloat = 10.1f;
		double iDouble = 10.1d;
		double iDouble2 = 10.1; // double형에서 d생략가능
		
		System.out.println("float형 : "+isFloat);
		System.out.println("double형 : "+iDouble);
		System.out.println("double형 : "+iDouble2);
	}
}
