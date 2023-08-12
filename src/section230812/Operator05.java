package section230812;

/*
 * 5. 대입연산자
 * 변수에 값을 할당하는데 사용되는 연산자
 * =(등호)
 *
 * 복합대입연산자
 * +=, -=, *=, /=, %= 
 * */
public class Operator05 {
	public static void main(String[] args) {
		// = 대입연산자로 변수 num에 10할당
		int num = 10;
		num += 10; // num = num+10
		System.out.println(num); // 20
		
		num -= 10; // num = num-10
		System.out.println(num); // 10
		
		num*=5;
		System.out.println(num); // 50
		
		num/=5;
		System.out.println(num); // 20
		
	}
}
