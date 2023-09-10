package section230910;

public class Thread04 {
	public static void main(String[] args) {
		System.out.println("메인메서드 시작");
		
		InterThread interThread = new InterThread();
		Thread thread = new Thread(interThread); // interThread의 구현체
		thread.start(); // InterThread의 run메서드가 같이 실행됨
		
		
		System.out.println("메인메서드 종료");
	}
}
