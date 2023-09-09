package section230909;

/*
 * 제네릭 Generic
 * 코드의 재사용성이나 타입 안정성을 높이기 위해 도입된 기능
 * 클래스나 메서드를 일반적인 타입 대신에 실제타입으로 지정할 수 있게 한다.
 * 
 * 1. 잘못된 타입의 값이 들어오는 것을 방지할 수 있다
 * 2. 강제 형변환(cast) 필요없이 사용가능함
 * */

public class Generic {
	public static void main(String[] args) {
		MyClass<String> class01 = new MyClass<String>();
		class01.setData("Hello Generic");
		
		String data = class01.getData();
		System.out.println(data);
		
		// 다만 타입없이 사용하면 주의문구 나옴
		// 제네릭타입으로 정의되었기 때문에 제네릭타입으로 사용해야 
		// 코드의 타입안성성을 향상시키고 형변환 오류를 방지하는데 도움이 된다
		MyClass class02 = new MyClass<>();
		// MyClass<String> class02 = new MyClass<>(); // 제네릭타입 사용
		class02.setData("Nice to meet you");
		
		String data02 = (String) class02.getData();
		System.out.println(data02);
	}
}
