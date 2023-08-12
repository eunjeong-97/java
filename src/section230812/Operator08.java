package section230812;

/*
 * 8. 삼항 연산자
 * 	조건식 ? 조건식이 참일 경우 반환 : 조건식이 거짓일 경우 반환
 * */
public class Operator08 {
	public static void main(String[] args) {
		int num = 10;
		String result = num > 0 ? "num은 양수" : "num은 음수";
		System.out.println(result);
		
		String result2 = "";
		if(num>0) {
			result2 = "조건문으로 확인: num은 양수";
		} else {
			result2 = "조건문으로 확인: num은 음수";
		}
		System.out.println(result2);
		
		int x = 8;
		int y = 12;
		int max = (x>y) ? x : y; // x와 y 중 큰 값선택
		System.out.println("x와 y의 최대값 : "+max);
		
		// 삼항연산자 중첩사용
		int a = 5;
		int b = 3;
		int c = 7;
		int acMax = (a>c)?a:c;
		int bcMax = (b>c)?b:c;
		int max2 = (a>b)? acMax : bcMax;
		System.out.println("a,b,c의 최대값 : "+max2);
		
	}
}
