package section230812;

/*
 * 2. 증감연산자
 * ++ : 피연산자 1씩 증가시킴
 * -- : 피연산자 1씩 감소시킴
 * 
 * 전위증감연산자: 명령어가 실행전 연산수행(1증가, 감소)
 * 후위증감연산자: 명령어가 실행한 뒤 연산수행(1증가, 감소)
 * 
 * */
public class Operator02 {
	public static void main(String[] args) {
		int num = 0;
		num=num+1;
		System.out.println("num : "+num);
		
		num++; // num+1와 같은의미
		System.out.println("num++ : "+num);
		
		// 전위 증감연산자
		System.out.println(++num); // 2+1
		System.out.println(--num); // 3-1
		
		// 후위 증감연산자
		System.out.println(num++); // 2 콘솔찍고 (2+1)
		System.out.println(num--); // 3 콘솔찍고 (3-1)
		System.out.println("후위증감연산자 결과 : "+num); // num--의 결과
	}
}
