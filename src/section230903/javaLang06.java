package section230903;

/*
 * compareTo()
 * num1.compareTo(num2);
 * 
 * 리턴값
 * num1 - num2 > 0 : 1
 * num1 - num2 < 0 : -1
 * num1 - num2 == 0 : 0
 * */

public class javaLang06 {
	public static void main(String[] args) {
		Integer num01 = 10;
		Integer num02 = 10000;
		
		// compareTo()
		int result = num01.compareTo(num02);
		String compare;
		if(result > 0) compare = ">";
		else if (result == 0) compare = "==";
		else compare = "<";
		System.out.println(num01 + " " + compare + " " + num02);
		
		// 문자열 숫자값과 Integer
		String str = "999";
		Integer num03 = Integer.parseInt(str);
		
		num03 +=1; // num03 = num03 + 1;
		String str02 = num03.toString();
		
		System.out.println("str02" + str02);
		System.out.println("INT MAX" + Integer.MAX_VALUE);
		System.out.println("INT MIN" + Integer.MIN_VALUE);
		
		// 최대최소 비교
		int min = Integer.min(num01, num02);
		int max = Integer.max(num01, num02);
		
		System.out.println("min : " + min + "max : " + max);
		
		// Character 문자열 기본메서드
		System.out.println("문자입니까? " + Character.isLetter('A'));
		System.out.println("숫자입니까? " + Character.isDigit('5'));
		System.out.println("공백입니까? " + Character.isWhitespace(' '));
		
	
	}
}
