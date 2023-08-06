package section230806;

/*
 * 5. String형(문자형)
 * 문자열을 저장할 수 있다
 * 참조형 변수
 * 
 * 선언방법
 * String 변수명;
 * 
 * 기본형
 * boolean, char, byte, short, int, long, float, double
 * 실제값을 저장하고 잇는 변수
 * 
 * 참조형
 * 기본형을 제외한 모든 객체(class 코드로 되어있다)
 * 주소값을 저장하고 잇다
 * 객체에는 속성(값-변수), 기능(메서드)로 구성되어있다
 * */
public class Variable06 {
	public static void main(String[] args) {
		String str = "안녕하세요";
		System.out.println("str : " + str);
		
		String hello = "hello";
		System.out.println("1번인덱스 : " + hello.charAt(1));
		System.out.println("2번인덱스~3번인덱스 : " + hello.substring(2,4));
		
		String addr = "서울특별시 서대문구 신촌";
		boolean isContain = addr.contains("특별시");
		
		if(isContain) {
			System.out.println("특별시민입니다.");
		} else {
			System.out.println("특별시민이 아닙니다.");
		}
		
	}
}
