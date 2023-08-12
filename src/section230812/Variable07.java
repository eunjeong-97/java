package section230812;

public class Variable07 {
	public static void main(String[] args)  {
		
		byte iByte = 10;
		int iInt = iByte; // 자동으로 형변환
		System.out.println("iInt : " + iInt);

		float iFloat = 10.1f;
		double iDouble = iFloat; // 자동으로 형변환
		System.out.println("iDouble : " + iDouble);
	
		
		int iInt2 = 130;
		byte iByte2 = (byte)iInt2; // 다운캐스팅: 오버플로우 주의
		System.out.println("iByte2: " + iByte2);
		
		float iFloat2 = 3.14f;
		int iInt3 = (int)iFloat2;
		System.out.println("iInt3 : " + iInt3);
		
	}
}
