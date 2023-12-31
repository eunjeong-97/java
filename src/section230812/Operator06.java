package section230812;

/*
 * 6. 비트 연산자
 * 	2진수로 표현된 두 비트 연산자
 * 
 * 	& : 대응되는 비트가 모두 1이면 1을 반환(비트 And 연산자)
 *  | : 대응되는 비트 중에서 하나라도 1이면 1을 반환(비트 Or 연사자)
 *  ^ : 대응되는 비트가 서로 다르면 1을 반환(비트 XOR 연산자-EXCLUSIVE OR)
 *  ~ : 대응되는 비트가 1이면 0으로, 0이면 1로 반전시킴(비트 Not 연산자)
 *  
 *  0 0000
 *  1 0001 (비트1)
 *  2 0010
 *  3 0011 (비트1)
 *  4 0100
 *  5 0101 (비트1)
 *  6 0110
 *  7 0101 (비트1)
 *  8 1000
 *  9 1001 (비트1)
 *  
 *  줄복사: ATL + CTRL + 방향키
 *  줄삭제: CTRL + D
 *  
 *  3: 0011
 *  -3: 2의보수로 변환: 비트를 반전시킨 후 1을 더하면 됨
 *  
 *  3의 이진수 0011→각비트반전 1100 →1더함 1101
 *  그래서 -3의 이진수는 1101
 *  
 *  0101 + 1100 → 0010 
 * */

public class Operator06 {
	public static void main(String[] args) {
		int num1 = 3; // 비트단위로 변환: 0 0011
		int num2 = 5; // 비트단위로 변환: 0 0101
		// 2진수를 기준으로 연산한다
		System.out.println("num1&num2 : "+(num1&num2)); // 0001 → 1
		System.out.println("num1|num2 : "+(num1|num2)); // 0111 → 7
		System.out.println("num1^num2 : "+(num1^num2)); // 0110 → 6
		
		// 3 : 0 0011
		// -3: 2의 보수로 계산: 
		
		// 0 0101 + 1 1100 → 1 10001 → 0 0010
		//-3 : 1 1100 → 컴퓨터는 음수를 2의보수로 생각함  
		System.out.println("~num1 : "+(~num1)); // 1100 -4
		
	}
}
