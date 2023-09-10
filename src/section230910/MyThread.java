package section230910;

public class MyThread extends Thread {
	@Override
	// 스레드의 메인메서드 역할
	public void run() {
		// super.run();
		System.out.println("MyThread 시작");
		try {
			Thread.sleep(2000); // 2초일시정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyThread 종료");
	}
}
