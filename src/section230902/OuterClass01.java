package section230902;

/*
 * 내부클래스
 * 클래스 안에 만들어진 또다른 중첩클래스
 * 외부클래스와 밀접한 관계를 가진다
 * 
 * 정적내부클래스 선언
 * 외부클래스 생성없이 바로 접근가능
 * Outer.Inner inner = new Outer.Inner(); 
 * 
 * 
 * bin > OuterClass01$innerClass.class 이런식으로 내부클래스가 생성된걸 확인할 수 있다
 * */

public class OuterClass01 {
	public static void main(String[] args) {
		
		// 인스턴스 생성없이 외부클래스를 통해 접근가능
		OuterClass01.InnerClass.info();
		
		// 같은 클래스에서는 바로접근가능
		InnerClass.info();
	}
	
	// 정적클래스
	// 외부클래스의 클래스변수처럼 static 키워드부여
	
	static class InnerClass {
		public static void info() {
			System.out.println("static 내부클래스");
		}
	}
}
