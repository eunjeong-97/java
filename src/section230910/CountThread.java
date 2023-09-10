package section230910;

/*
 * [챗지피티] 상속키워드
 * 
 * 1. implements
 * 인터페이스를 구현할때 사용함
 * 클래스가 인터페이스를 구현할때 class MyClass implements MyInterface
 * 클래스는 여러 인터페이스를 구현할 수 있으며, 
 * 인터페이스를 구현하는 클래스는 해당 인터페이스의 모든 메서드를 반드시 구현해야 함
 * 
 * interface MyInterface {
 * 	void methodName();
 * }
 * 
 * class MyClass implements MyInterface {
 * 	// MyInterface 인터페이스의 메서드를 반드시 구현해야 함
 * 	public void methodName(){
 * 		// 구현내용
 * 	}
 * }
 * 
 * 2. extends
 * 클래스 간의 상속 구현
 * 클래스A가 클래스B를 확장(상속)할때 class A extends B 와 같은 형태로 사용함
 * 이를 통해 클래스A는 클래스B의 모든 멤버(필드 및 메서드)를 상속받고
 * 필요한 경우 메서드를 재정의(오버라이딩)하거나 추가할 수 있음
 * 단일 상속만 지원하기 때문에 하나의클래스는 하나의클래스만 상속(확장)가능
 * 
 * class Parent {
 * 	public void main(){}
 * }
 * 
 * class Child extends Parent {
 *  // 자식클래스에서 부모클래스 확장
 *  // 부모클래스의 멤버들을 상속받음
 * 	@Override
 * 	public void main(){}
 * }
 * 
 * */


public class CountThread extends Thread{

	@Override
	public void run() {
		System.out.println("CountThread 시작");
		
		for (int i = 1; i < 11; i++) {
			System.out.print(Thread.currentThread().getName() + ":");
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("CountThread 종료");
	}
}
