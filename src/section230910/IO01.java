package section230910;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * I/O Input/Output
 * 데이터를 읽고 쓰는 작업
 * 자바에서 java.io 패키지를 통해 프로그래밍 할 수 잇음
 * 
 * File Class
 * 경로정보를 받아 -> 파일 또는 디렉터리 정보를 객체화
 * 
 * */


public class IO01 {
	public static void main(String[] args) {
		print(true);
		System.out.println("===================");
		print(false);
	}
	
	private static void print(Boolean isDirectory){
		// File 객체생성 (C드라이브 하위에 있는 디렉터리 리스트)
		File cFiles = new File("C:\\"); // C:\ 표현
		
		// C드라이브 하위에 있는 모든 디렉터리 및 파일리스트 반환
		String[] list = cFiles.list();
		
		// Calendar 날짜관련 객체 생성
		Calendar calendar = Calendar.getInstance();
		
		String ctgr = isDirectory ? "디렉터리" : "파일";
		String string = "(" + ctgr + "): ";
		
		for (String temp : list) {
			// temp 이름의 디렉터리 또는 파일을 객체화
			// System.out.println("temp: " + temp);
			File file = new File(cFiles, temp);
			
			// file.isDirectory(): 디렉터리면 true,  파일이면 false
			Boolean condition = isDirectory ? file.isDirectory() : file.isFile();
			
			// 해당파일이나 디렉터리의 최송수정날짜
			// 1970.01.01일부터 현재 수정한 날짜를 밀리세컨즈로 반환함 (TimeStamp)
			long lastMod = file.lastModified();
			
			// 파일 또는 디렉터리 마지막 수정날짜 -> Calendar 객체로 변환
			calendar.setTimeInMillis(lastMod);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String listModString = dateFormat.format(calendar.getTime());
			
			
			String fileSize = "";
			if(!isDirectory) fileSize = getFileInfo(file);
			
			if(condition) {
				System.out.println(file.getName() + string + listModString + " "+ fileSize);
			}
		}
	}
	
	private static String getFileInfo(File file) {
		long fileSizeByte = file.length();
		double fileSizeMB = (double)fileSizeByte / (1024*1024);
		// String string = String.format("%s(%.2fMB) = %s", file.getName(), fileSizeMB);
		String string = String.format("%s(%.2fMB)", file.getName(), fileSizeMB);
		return string;
	}
}
