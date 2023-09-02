package section230902;

import java.util.Scanner;

import section230902.access02.InputErrorException;

public class ExceptionClass06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("나이입력");
			int age = scan.nextInt();
			
			if(age < 0) {
				throw new InputErrorException("입력이 잘못됨");
			}
			if(age > 19) {
				System.out.println("성인");
			} else if(age > 13) {
				System.out.println("청소년");
			} else if(age > 6) {
				System.out.println("어린이");
			} else {
				System.out.println("아동");
			}
			
		// e = new InputErrorException(e)
		} catch (InputErrorException e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		} finally {
			if(scan != null) scan.close();
		}
	}
}
