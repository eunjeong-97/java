package section230902;

/*
 * 내부클래스 컴파일
 * Outer$Inner.class
 * 
 * 별도의 클래스이기 때문에 컴파일할때 내부클래스도 외부클래스 안에 샐성되는것 이외에도 별도로 생성된다
 * */

public class OuterClass02 {
	public static void main(String[] args) {
		new OuterClass02.InnerClass().info();
		OuterClass02.InnerClass inner = new OuterClass02.InnerClass();
		inner.info();
		
	}
	
	static class InnerClass{
		public void info() {
			System.out.println("staic 내부클래스의 일반메서드");
		}
	}
}
