package section230903;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
 * java.time 패키지
 * - 날짜 시간관련 패키지
 * - JDK8버전이상 사용가능
 * 
 * */

public class JavaTime {
	public static void main(String[] args) {
		// 현재 날짜와 시간 가져오기
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now: "+ now);
		
		// 날짜와 시간분리
		LocalDate nowDate = now.toLocalDate();
		LocalTime nowTime = now.toLocalTime();
		System.out.println("nowDate : " + nowDate);
		System.out.println("nowTime : " + nowTime);
		
		// 특정날짜와 시간생성
		LocalDateTime newDate = LocalDateTime.of(2023, Month.JANUARY, 1,12,0);
		System.out.println("newDate : " + newDate);

		// 1주일후 날짜연산
		LocalDateTime after1w = now.plusWeeks(1);
		System.out.println("after1w : " + after1w);
		
		// 포맷팅
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = now.format(formatter);
		System.out.println("formattedDate: " + formattedDate);
		
		// 문자열 -> 날짜
		String dateString = "2023.09.01";
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		LocalDate parsedDate = LocalDate.parse(dateString, dateFormatter);
		System.out.println("parsedDate : " + parsedDate);

		// 기본시스템 타임존 가져오기
//		ZoneId 
		
		// 특정 타임존으로 날짜와 시간설정
		ZoneId newYorkZone = ZoneId.of("America/New_york");
		ZonedDateTime newYorkDateTime = ZonedDateTime.now(newYorkZone);
		
		
	}
}
