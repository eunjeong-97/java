package section230910;

import section230910.access01.Brother;
import section230910.access01.Sister;
import section230910.access01.Wallet;

public class Thread03 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작");
		Wallet wallet = new Wallet();
		
		// 동일한 Wallet클래스의 인스턴스 wallet를 동일하게 참조함
		Sister sister = new Sister(wallet);
		Brother brother = new Brother(wallet);
		
		// 동시에 각자의 스레드에서 실행함
		sister.start();
		brother.start();
		
		// Brother와 Sister가 각자 가져간 재산을 합하면 10001이 되는데
		// 만약 Brother나 Sister 먼저 접근해서 getMoney메서드 실행을모두 할때까진
		// 다른 형제는 대기할수 있도록 해야한다
		
		System.out.println("메인스레드 종료");
	}
}
