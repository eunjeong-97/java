package section230812;

import java.util.Scanner;

/*
 * 3. 비교연산자
 * 연산결과를 비교해서 boolean으로 변환한다
 * >, >=, <, <=, == (같다), !=
 * */
public class Operator03 {
	public static void main(String[] args) {
		boolean result = 10 < 20;
		System.out.println("result : "+result);
		
		if(result) {
			System.out.println("10은 20보다 작다");
		} else {
			System.out.println("10은 20보다 크다");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt(); // 콘솔에 입력한 값
		if(age>=19) {
			System.out.println("만19세이상 성인입니다.");
		} else {
			System.out.println("미성년자 애송이입니다.");
		}
		
		
 	}
}
