package section230812;

/*
 * 4. 논리연산자
 * 	&& : And 조건, 교집합 개념, 두 항 모두 true → true
 * 	|| : Or 조건, 합집합 개념, 두 항중 하나라도 true → true
 * 	!  : Not 조건, 여집합 개념, 논리(boolean)값 반전 시킨다. 
 * 
 * */

public class Operator04 {
	public static void main(String[] args) {
		boolean result = true && false;
		System.out.println("true && false → "+ result);
		
		boolean result2 = true || false;
		System.out.println("true || false → "+result2);
		
		boolean result3 = !true;
		System.out.println("!true → " + result3);
		
		// 쇼핑몰 예시
		String ctgr = "의류";
		if(ctgr=="의류" || ctgr == "전기전자" || ctgr == "의류") {
			System.out.println("20%할인행사중");
		} else {
			System.out.println("할인미적용상품");
		}
	}
}
