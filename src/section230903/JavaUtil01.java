package section230903;

import java.util.Random;

/*
 * 자바유틸패키지(java.util)
 * 자바에서 유용한 유틸클래스와 인터페이스를 포함하는 패키지
 * java.lang 패키지는 import없이 사용가능하지만, java.util패키지는 import해줘야 사용가능함
 * 
 * Random 클래스
 * 난수를 생성해줌
 * 
 * 
 * */

public class JavaUtil01 {
	public static void main(String[] args) {
		Random random = new Random();
		int ranNum = random.nextInt();
		System.out.println("ranNum : " + ranNum);

		// 0~99 사이 정수중 난수반환
		int ranNum01 = random.nextInt(100);
		System.out.println("0~99 사이 정수중 난수반환 : " + ranNum01);
		
		// 0이상 1미만의 난수반환
		double ranNum02 = random.nextDouble();
		if(ranNum02 < 0.5) {
			System.out.println("50%확률 성공");
		} else {
			System.out.println("50%확률 실패");
		}
	}
}
