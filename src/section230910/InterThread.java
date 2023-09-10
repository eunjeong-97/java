package section230910;

// Runnable 인터페이스 상속
// 추상메서드 구현해야함
public class InterThread implements Runnable {

	@Override
	public void run() {
		System.out.println("InterThread 시작");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("InterThread 종료");
	}

}
