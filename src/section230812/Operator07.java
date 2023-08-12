package section230812;

/*
 * 8. 시프트연산자
 * << : <부호를 유지하면서> 특정숫자의 비트를 왼쪽으로 지정한 횟수만큼 이동
 * >> : 특정숫자의 비트를 오른쪽으로 지정한 횟수만큼 이동
 * */
public class Operator07 {
	public static void main(String[] args) {
		int num = 10; // 10을 2진수 1010
		// num 숫자를 왼쪽으로 2비트 이동
		// 101000 2^4+2^6=8+32
		int left = num << 2; // 왼쪽으로 2비트 이동 
		
		// num 숫자를 오른쪽으로 2비트 이동
		// 0010 (뒤의 2비트 지우고, 앞에 00 추가)=2
		int right = num >> 2;  
		System.out.println("num << 2 : "+left); // 40
		System.out.println("num >> 2 : "+right); // 2
	}	
}
