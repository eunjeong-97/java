package section230903;

import java.util.Random;

// 배열숫자 섞기
public class JavaUtil02 {
	public static void main(String[] args) {
		int length = 45;
		int[] numList = new int[length]; // 0-44 [45]

		// 1-45 [45]
		for (int i = 0; i < numList.length; i++) {
			numList[i] = i + 1;
		}
		
		// getResult("변경전", numList);
		shake(numList);
		// getResult("변경후", numList);
	}
	
	public static void shake(int[] numList) {
		System.out.println("숫자 섞기");
		Random ran = new Random(numList.length); // 1-45
		for (int i = 0; i < numList.length; i++) {
			int changeIdx = ran.nextInt(numList.length); // 1~45
			int tmp = numList[i]; // 원래값
		
			// numList[changeIdx] <-> numList[i] 값 서로변경
			numList[i] = numList[changeIdx]; // numList[changeIdx]
			numList[changeIdx] = tmp; // numList[i]
			
			System.out.println("i: " + i + "  changeIdx : " + changeIdx);
		}	
	}
	
	
	public static void getResult(String title, int[] numList) {
		System.out.println(title);
		for (int i = 0; i < numList.length; i++) {
			int index = i+1;
			boolean isNext = index%10 == 0;
			String space = "";
			if(!isNext) space = "  ";
			int num = numList[i];
			String formattedNum = String.format("%02d", num);
			System.out.print(formattedNum + space);
			if(index%10 == 0 ) System.out.println("");
		}
		System.out.println("");
	}
}
