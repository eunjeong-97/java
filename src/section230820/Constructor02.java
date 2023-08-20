package section230820;

/*
 * 초기화블럭
 * 클래스나 인스턴스가 생성될때 실행되는 코드블럭
 * 클래스의 필드를 초기화하거나 다양한 작업을 수행하는데 사용됨
 * 
 * 1. 인스턴스 초기화블럭
 * 클래스의 인스턴스가 생성될때마다 실행되는블럭
 * 주로 인스턴스 변수를 초기화하는 용도로 사용됨
 * 
 * 
 * 2. 정적 static 초기화블럭
 * 클래스가 로드될때 한 번 실행되는 블럭
 * 클래스변수(static변수)의 초기화나 클래스와 관련된 초기화 작업
 * 
 * */

public class Constructor02 {
	// 필드선언
	private int value;
	private static int staticValue;
	{
		// 인스턴스 초기홥르럭
		value = 10;
		staticValue = 10;
		System.out.println("Constructor02 초기화블럭");
	}
	
	// 생성자
	public Constructor02() {
		System.out.println("Constructor02 생성자");
	}

	public static void main(String[] args) {
		Constructor02 con02 = new Constructor02();
	}
}
