package section230910;

public class Thread05 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작");
		
		
		// 스레드 객체를 생성
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명클래스 스레드 시작");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("익명클래스 스레드 종료");
			}
		 });
		thread.start();
		
		
		new Thread(()->{
			System.out.println("익명클래스 스레드2시작");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("익명클래스 스레드2종료");
		}).start(); 
		
		// 스레드 실행
		System.out.println("메인스레드 종료");
	}
}
