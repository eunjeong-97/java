package section230812;

/*
 * ✅ 제어문
 * 프로그램 실행흐름을 제어하기 위해 사용되는구문
 * 
 * => 조건문
 * 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문
 * 
 * 조건문1. if문
 * if(조건식) {
 * 	조건식이 true일때 실행
 * }
 *
 * if(조건식)
 * 	조건식이 true일때 명령어 한줄일땐 중괄고 생략가능
 *
 * */
public class Conditional01 {
	public static void main(String[] args) {
		int num = 11;
		if(num%2 == 0) {
			System.out.println("num은 짝수");
		} else {
			System.out.println("num은 홀수");
		}
		
		// 실행명령어가 한줄인 경우 중괄호 생략가능
		if(num%2 == 0)
			System.out.println("num은 짝수");
		if(num%2!=0)
			System.out.println("num은 홀수");
	}
}
