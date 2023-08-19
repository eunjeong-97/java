package section230819;

/*
 1  2  3  4  5  6  7		
 8  9  10 11 12 13 14		
 15 16 17 18 19 20 21		
 22 23 24 25 26 27 28		
 29 30 31 32 33 34 35		
 36 37 38 39 40 41 42		
 43 44 45 46 47 48 49	
 */

public class ArrayHW {
	public static void main(String[] args) {
		int max = 50;
		int[] intArr = new int[max];
		
		for (int i = 1; i < intArr.length; i++) {
			int remain = i%7;
			String space = i<10 ? "  " : " ";
			
			if(remain == 0) System.out.println(i);
			else System.out.print(i+space);
		}
	}
}
