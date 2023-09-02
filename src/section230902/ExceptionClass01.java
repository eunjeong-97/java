package section230902;

/*
 * 예외(Exception)
 * 자바프로그램 구동 중에 나타나는 오류
 * 문법적으로 문제가 없어보이지만 실제 운영 중에 발생하는 문제다
 * 
 * try catch 예외처리방법
 * try {
 * 	정상코드실행
 * } catch(익셉션클래스 매개변수명){
 * 	예외처리: 해당 예외가 발생했을경우 실행할 코드
 * }
 * 
 * */


public class ExceptionClass01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		result = num1 / num2;
		System.out.println("result : " + result);
		
		if(num2 == 0) {
			System.out.println("0으로 나누면 안됨");
		} else {
			result = num1 / num2;
			System.out.println("result : " + result);
		}
		
		
		// ===== 예외처리 ===== 
		
		try {
			result = num1 / num2;
			System.out.println("result : " + result);
			// (에러정보를 가지고 있는 객체)
		} catch (Exception e) {
//		 } catch (ArithmeticException e) {
			e.printStackTrace(); // 예외에러문구 콘솔출력 
			System.out.println(e.getMessage());
			System.out.println("0으로 나누면 안됨");
		}
	}
}
