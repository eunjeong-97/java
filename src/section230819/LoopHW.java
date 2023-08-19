package section230819;

import java.util.Iterator;

/*
 
1번
*
**
***
****
*****
******
*******

2번
   *
  **
 ***
****


3번
   *
  ***
 *****
******* 

4번
   *   		
  ***		
 *****		
*******		
 *****		
  ***		
   *
*/


public class LoopHW {
	/* 1번
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if(i>=j) System.out.print("*");
				else System.out.print("");
			}
			System.out.println("");
		}
	}
	*/
	
	/* 2번
	 * i=0~3
	 * i=0 j=3
	 * i=1 j=2,3
	 * i=2 j=1,2,3
	 * i=3 j=0,1,2,3
	 * 
	public static void main(String[] args) {
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				int sum = row + column;
				if(sum<3) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println("");
		}
	}
	*/
	
	/*
	 * 3번
	 * row=0~3
	 * row=0, column=3 (1) 3+1-1
	 * row=1, column=2~4 (3) 2+3-1
	 * row=2, column=1~5 (5) 1+5-1
	 * row=3, column=0~6 (7) 0+7-1
	 * 
	 * 
	public static void main(String[] args) {
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 7; column++) {
				int count = row*2+1;
				int startColumn = 3-row;
				int lastColumn = startColumn + count - 1;
				if(column >= startColumn && column <= lastColumn) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println("");
		}
	}*/
	
	/*
	 * 4번
	 * row: 0~6 column: 0~6
	 * 
	 * end: start+count-1
	 * row: 0,6 start: 3, count:1 
	 * row: 1,5 start: 2, count:3
	 * row: 2,4 start: 1, count:5
	 * row: 3, start: 0, count:7
	 * 
	public static void main(String[] args) {
		for (int row = 0; row < 7; row++) {
			int opRow = 6-row;
			int pattern = row > 3 ? opRow : row;
			for (int column = 0; column < 7; column++) {
				int start =  3-pattern;
				int count = 2*pattern+1;
				int end = start+count-1;
				if(column>=start && column <=end) System.out.print("*"); 
				else System.out.print(" ");
			}
			System.out.println("");
		}
	} */
	
	// 5번: 2,3,4단 구구단
	public static void main(String[] args) {
		for (int start = 2; start < 5; start++) {
			System.out.println(start+"단");
			for (int end = 1; end < 11; end++) {
				int result = start*end;
				System.out.println(start+" X "+end+" = "+result);
			}
			System.out.println("================");
		}
	}
	
}
