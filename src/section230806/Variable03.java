package section230806;

/*
 * 3. 정수형
 * byte (1바이트):  -128 ~ +127 (0포함) 2^7
 * short(2바이트): -32768 ~ +32767 2^15
 * int(4바이트) -2,147,483,648 ~ 2,147,483,647 
 * long
 * 
 * 해당 값이 넘어가는경우 오버플로우현상이 발생하는데
 * 오버한만큼 범위시작에서 다시 숫자 더한다
 * 예) byte타입으로 130을 사용한다면, 오버플로우한 3만큼 -128, -127, -126 으로 카운트되서
 * -126이 될듯 (???)
 * */
public class Variable03 {
	// 기본메서드
	public static void main(String[] args) {
		// Type mismatch: cannot convert from int to byte
		// byte overflow = 130;
		// System.out.println(overflow);
		
		// 정수형 변수
		byte iByte = 10;
		short iShort = 100;
		int iInt = 10000;
		long iLong = 100000;
		
		iByte += 120;
		System.out.println("바이트 오버플로우" + iByte);
		
	}
}
