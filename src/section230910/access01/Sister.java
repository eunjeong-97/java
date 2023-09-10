package section230910.access01;

public class Sister extends Thread {
	public Wallet wallet;
	public int money;
	public Sister(Wallet wallet) {
		this.wallet = wallet;
	}
	
	// Thread 클래스를 상속받았기 때문에 run메서드 상속받아야함
	@Override
	public void run() {
		while (true) {
			int returnMoney = wallet.getMoney();
			if(returnMoney == 0) break;
			money += returnMoney;
			System.out.println("Sister 총재산" + money);
		}
	}
}
