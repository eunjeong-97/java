package section230812;

/*
 * 연산자 (Operator)
 * 프로그램에서 데이터를 처리해서 산출하는 것을 연산이라고 한다
 * 연산에서 사용되는 표시나 기호를 연산자(Operator)라고 한다
 * 
 * 1. 산술연산자
 * 숫자 값을 가지고 수학적인 연산을 수행하는 연산자
 * +,-,*, /, %(나머지연산자)
 * 
 * */

public class Operator01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int sum = num1+num2; // 정수+정수 → 정수
		System.out.println("sum : " + sum); // 15: 문자열+숫자→값이 연결된 문자열
		
		String result;
		result = num1+"+"+num2+"="+sum;
		System.out.println("result : "+result);
		
		int multiply = num1*num2;
		System.out.println("multiply : "+multiply);
		
		int divide = num1/num2;
		System.out.println("divide : "+divide);
		
		int remain = 9%5;
		System.out.println("remain : "+remain);
	}
}
