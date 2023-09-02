package section230902;

/*
 * Exception 종류
 * 1. Checked Exception
 * 예외처리를 안했을때 발생하는 컴파일에러
 * 
 * 2. Unchekced Exception
 * 예외처리를 아해도 컴파일에러 발생안함
 * */


public class ExceptionClass04 {
	
	// i가0부터 9까지 실행될때 콘솔로찍고 1초에 한번씩 쉰다
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			// 1초 일시정지 (밀리세컨즈)
			// try catch를 하지 않으면 에러발생: Checked Exception
			// Thread.sleep(1000);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getStackTrace();
			}
		}
	}
}
