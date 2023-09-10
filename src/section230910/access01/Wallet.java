package section230910.access01;

public class Wallet {
	public int total;
	public Wallet() {
		this.total = 10000;
	}
	
	// synchronized 키워드를 추가하게 되면 동기화메서드가 된다
	// 동기화메서드 : Thread safe
	/*
	public synchronized int getMoney() {
		if(total==0) return 0;
		total -= 1;
		return 1;
	} 
	*/
	
	public int getMoney() {
		if(total==0) return 0;
		
		// 동기화대상: 해당 인스턴스
		synchronized (this) {
		// synchronized (Wallet.class) { 모든 인스턴스
			total -= 1;
		}
		return 1;
	}
}
