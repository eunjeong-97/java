package section230902;

public class ExceptionClass02 {
	public static void main(String[] args) {
		String string = null;
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		try {
			System.out.println("문자열 첫번째글자 : " + string.charAt(0));
			result = num1 / num2;
			System.out.println("result: " + result);
		} catch(NullPointerException e) {
			System.out.println("null 익셉션");
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수없음");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("예외발생");
		}
	}
}
