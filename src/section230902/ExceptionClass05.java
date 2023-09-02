package section230902;

/*
 * 예외처리하는 방법
 * 
 * 1. try catch 
 * 2. throws 예외던치기
 * 3. throw 키워드로 강제 Exception 발생
 * 
 * */

import section230902.access01.NumberPrinter;

/*
 * throws 키워드
 * 자바에서 메서드나 생성자가 예외를 던질 수 있음을 선언하는 키워드
 * 메서드가 예외를 처리하지 않고 해당 예외를 호출하는 곳으로 넘기고자 할 때 사용함
 * */

public class ExceptionClass05 {
	public static void main(String[] args) throws InterruptedException {
		NumberPrinter printer = new NumberPrinter();
//		try {
//			printer.printNumber();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		// throws InterruptedException를 추가한다는것은 에러처리를 미룬다는것인데
		// main메서드에서 에러처리를 미룬다는것은 jvm보고 에러처리를 하라는 것이다
		printer.printNumber();
		
		
		// 강제로 예외발생
		throw new NullPointerException();
	}
}
