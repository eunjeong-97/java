package section230902;

/*
 * 익명클래스 (Anonymous Class)
 * 다른 내부클래스 이름이 없는 클래스
 * 선언과, 객체에 생성을 동시에 하기 때문에 → 단 한번만 사용가능 (일회용클래스)  
 * 
 * 
 * */


public class OuterClass05 {
	public static void main(String[] args) {
		
		// new 메서드를 통해 인터페이스는 객체생성이 안되기 때문에 아래처럼 만들어진다
		// Bird 인터페이스를 상속받은 익명클래스
		Bird bird = new Bird() {
			
			// 오버라이드: 재정의
			@Override
			public void sing() {
				// TODO Auto-generated method stub
				System.out.println("sing");
			}
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("fly");
			}
		};
		
		/* 원래는 정말 인터페이스를 상속받으려면 아래처럼 작성해야겠지만\
		 * 이름없는 클래스명은 implements를 사용할 수 없기 때문에 new Bird()로만 표현함
		Bird bird new 이름없는클래스명 implements Bird {
			@Override
			public void sing() {
				// TODO Auto-generated method stub
				System.out.println("sing");
			}
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("fly");
			}
		}
		*/
		
		bird.fly();
		bird.sing();
		
	}
}
