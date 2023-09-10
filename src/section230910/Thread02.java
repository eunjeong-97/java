package section230910;

/*
 * 여러 스레드를 동시에 실행해도 되지만 유지보수가 어렵다
 * 만약 멀티스레드가 필요하다면 여러개의 프로젝트를 만들어서 각자 관리를 해주면 좋다
 * 스케쥴(주기적으로 특정 프로그래밍이 실행되도록 함), 대치()로 분리함
 * 
 * */

public class Thread02 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작");
		
		CountThread ct = new CountThread();
		ct.setName("CountThread");
		ct.start();
		
		for (int i = 1; i < 11; i++) {
			System.out.print(Thread.currentThread().getName() + ": ");
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("메인스레드 종료");
	}
}
