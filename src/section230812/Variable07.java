package section230812;

/*
 * 형변환(cast)
 * 	1. 업캐스팅(프로모션)
 * 		- 표현 범위가 더 큰 데이터형으로 변환하기
 * 		- 자동으로 가능
 * 		- 데이터 손실이 없다.
 * 	2. 다운캐스팅(디모션)
 * 		- 표현 범위가 더 작은 데이터형으로 변환하기
 * 		- 명시적으로 해야한다.
 * 		- 데이터 손실이 있을 수 있다.
 * 
 * 숫자타입
 * byte → short → int → longs
 */

public class Variable07 {
	public static void main(String[] args)  {
		
		byte iByte = 10;
		int iInt = iByte; // 자동으로 형변환
		System.out.println("iInt : " + iInt); // 10

		float iFloat = 10.1f;
		double iDouble = iFloat; // 자동으로 형변환
		System.out.println("iDouble : " + iDouble); // 10.100000381469727
	
		
		int iInt2 = 130;
		// 타입캐스팅연산: int→byte로 형변환시도
		byte iByte2 = (byte)iInt2; // 다운캐스팅: 오버플로우 주의
		System.out.println("iByte2: " + iByte2); // -126
		
		// 실수→정수 형변환수
		float iFloat2 = 3.14f;
		int iInt3 = (int)iFloat2; //소수점아래는 그냥 날림(절삭)
		System.out.println("iInt3 : " + iInt3); // 3 
		
	}
}
