package section230910;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * if문에서 중괄호없이 한줄로만 작성하면 
 * 중괄호없이 단일문장만 조건에따라 실행된다
 * 
 * directory.mkdirs() 메서드가 true를 반환해도 
 * System.out.println(directory.getParent() + " 디렉터리 생성됨"); 는 if문과 상관없이 항상 실행하게 된다
 * */

public class IO03 {
	public static void main(String[] args) throws IOException {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
		
		String yearMonthDay = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		String time = now.format(formatter);
		
		String path = "./upload/" + yearMonthDay;
		String fileName = "upload_" + time;
		
		File directory = new File(path);
		File file = new File(directory, fileName);
		// mrdirs(): 하위 디렉터리까지 생성함
		
		// if문에서 중괄호없이 한줄로만 작성하면
		if(directory.mkdirs()) {
			System.out.println(directory.getParent() + " 디렉터리 생성됨");
		}
		if(file.createNewFile()) System.out.println(fileName + " 파일 생성됨");
		if(file.delete()) System.out.println(fileName + " 파일 삭제됨");
//		if(directory.delete()) System.out.println(directory.getParent() + " 디렉터리 삭제됨");
	}
}
