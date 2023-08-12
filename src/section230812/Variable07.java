package section230812;

public class Variable07 {
	public static void main(String[] args)  {
		
		byte iByte = 10;
		int iInt = iByte; // 자동으로 형변환
		System.out.println("iInt : " + iInt); // 10

		float iFloat = 10.1f;
		double iDouble = iFloat; // 자동으로 형변환
		System.out.println("iDouble : " + iDouble); // 10.100000381469727
	
		
		int iInt2 = 130;
		byte iByte2 = (byte)iInt2; // 다운캐스팅: 오버플로우 주의
		System.out.println("iByte2: " + iByte2); // -126
		
		// 실수→정수 형변환수
		float iFloat2 = 3.14f;
		int iInt3 = (int)iFloat2; //소수점아래는 그냥 날림(절삭)
		System.out.println("iInt3 : " + iInt3); // 3 
		
	}
}
