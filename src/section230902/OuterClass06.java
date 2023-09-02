package section230902;

public class OuterClass06 {
	public static void main(String[] args) {
		
		// 내부클래스
		// new 키워드를 통해 객체생성하고 getName메서드호출함
		String name = new Bird() {
			
			// 만약 이게 클래스라면 내부에 코드구현이 가능할것
			private String name = "앵무새";
			
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
			
			public String getName() {
				return name;
			};
		}.getName();
		
		System.out.println("name : " + name);
		
		
		// =========== 일반클래스 =========== 
		// BirdImpl: Bird를 상속받아 구현한 클래스를 통해 객체생성
		BirdImpl bird = new BirdImpl();
		String name02 = bird.getName();
		String name03 = new BirdImpl().getName();
		System.out.println("name02 : " + name02);
	}
}
