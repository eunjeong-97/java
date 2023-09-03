package section230903;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date 클래스
 * 시간과 날짜정보를 다루는 클래스
 * 
 * */

public class JavaUtil03 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("origin Date: " + date);
		
		// Date 객체 -> 문자열 날짜시간
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd HH:mm:ss");
		String formattedDate = sdf.format(date);
		System.out.println("formattedDate : " + formattedDate);
		
		// 문자열 날짜시간 -> Date 객체
		String hypenDate = formattedDate.replace(".", "-");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		try {
			Date newDate = sdf2.parse(hypenDate);
			System.out.println("newDate: " + newDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
