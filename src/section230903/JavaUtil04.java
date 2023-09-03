package section230903;

import java.util.Calendar;

/*
 * Calendar 클래스
 * 시간과 날짜정보를 다루는 클래스
 * Date 객체보다 정교한 연산가능
 * 
 * */

public class JavaUtil04 {
	public static void main(String[] args) {
		
		// 생성자를 건들지못하게 인스턴스를 통해서만 접근할 수 있도록
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);		
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		
		int[] dateInfo = {year,month,date,hour,min,sec};
		consoleDate(dateInfo);
	}
	
	public static void consoleDate(int[] dateInfo) {
		for (int i = 0; i < dateInfo.length; i++) {
			int num = dateInfo[i];
			String dateStr = String.format("%02d", num);
			String space = "";
			if(i<2) space = "-";
			if(i==2) space = " ";
			if(i>2 & i<dateInfo.length-1) space = ":";
			System.out.print(dateStr + space);
		}
	}
}
