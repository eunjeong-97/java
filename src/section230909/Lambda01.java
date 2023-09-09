package section230909;

/*
 * 람다표현식 (Lambda)
 * 익명함수를 정의할 수 있는 간결한 방법을 제공하며
 * 주로 함수형 인터페이스와 함께 사용된다
 * 
 * JAVA8이상에서 지원하는 함수령 프로그래밍 스타일
 * 간결하게 코드 작성가능
 * 
 * (매개변수) -> 코드영역
 * (매개변수) -> { return 코드영역; }
 * */

public class Lambda01 {
	public static void main(String[] args) {
		// 1. 기존 익명클래스
		MyLambdaFunc func = new MyLambdaFunc() {
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
			
		};
		System.out.println(func.max(3,5));
		
		// 2.람다식을 이용한 익명함수
		MyLambdaFunc func2 = (int a, int b) -> a>b?a:b;
		System.out.println(func2.max(3,5));
	}
}

interface MyLambdaFunc {
	int max(int a, int b);
}