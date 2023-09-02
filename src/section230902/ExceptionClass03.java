package section230902;

/*
 * finally 키워드
 * 예외발생여부와 관계없이 항상 실행되는 코드영역
 * 
 * 
 * */

public class ExceptionClass03 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		try {
			System.out.println("DB연결");
			result = num1 / num2;
			System.out.println("result : " + result);
			// System.out.println("DB연결해제");
		} catch (Exception e) {
			
			// DB연결해제하지 않고 바로 에러처리로 오기 때문에 위험!
			// 세션을 클로즈하지 않으면 계속 세션이 살아있을수 있음
			// 클로즈해야함
			
			System.out.println("예외발생");
			// System.out.println("DB연결해제");
			
			// 예외발생여부에 상관없이 모두 실행하고 싶은경우
		} finally {
			System.out.println("DB연결해제");
		}
	}
}
