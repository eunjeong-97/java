package section230806;

/*
 * 2. 문자형(char)
 * 문자 한 글자 (unicode) 저장가능
 * */
public class Variable02 {
	public static void main(String[] args) {
		// char형 변수 선언및 대입
		char ch1 = '박';
		System.out.println(ch1);
		
		char ch2, ch3;
		// 쌍따옴표랑 홑따옴표랑 다르게 나옴
		ch2 = '은';
		ch3 = '정';
		System.out.println(ch2);
		System.out.println(ch3);
		
		int num = ch1;
		System.out.println("박에 해당하는 문자코드" + num);
		
		char ch4 = 66;
		System.out.println("66에 해당하는 문자코드" + ch4);
		/*
		 * 1비트 = 0/1
		 * 8비트 = 1바이트
		 * 1024바이트 = 1킬로바이트
		 * 1024킬로바이트 = 1메가바이트
		 * 1024기가바이트 = 1테라바이트 
		 * */
	}
}
