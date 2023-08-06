package section230806;

/*
 * 1. 논리형(boolean)
 * true, false 두가지값을 가지는 기본 자료형
 * 1byte
 * 
 * 선언방법
 * boolean 변수명;
 * 
 * 
 * */

public class Variable01 {
	public static void main(String[] args) {
		boolean isTrue;
		isTrue = true;
		System.out.println("논리형변수에 저장된값" + isTrue);
		
		isTrue = false;
		System.out.println("논리형변수에 변경된값" + isTrue);
		
	}
}
