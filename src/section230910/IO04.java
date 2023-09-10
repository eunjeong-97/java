package section230910;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InputStream \ OutputStream
 * 바이트 기반의 입력과 출력을 다루는 추상클래스
 * 
 * 파일 I/O Stream
 * FileInputStream: 파일을 바이트단위로 순차적으로 읽는 객체
 * FileOutputStream: 파일을 바위트단위로 순차적으로 쓰는 객체
 * 
 * */

public class IO04 {
	public static void main(String[] args) {
		FileInputStream inputStream = null;
		FileOutputStream outputStram = null;
		
		try {
			// hello.txt 파일을 읽을 수 있는 객체 생성
			inputStream = new FileInputStream("./upload/2023/09/10/hello.txt");
			File file01 = new File("./upload02");
			if(file01.mkdir()) {
				System.out.println("upload02 폴더생성됨");
			}
			
			// hello.txt 파일을 수정할 수 있는 객체 생성
			// 파일이 존재하지 않으면 파일만 자동으로 생서해줌 (폴더는 생성하지 않음)
			// 그래서 upload02 디렉터리가 없으면 에러 발생함
			outputStram = new FileOutputStream("./upload02/hello.txt");
			
			int byteCount = 0;
			byte[] bytes = new byte[1024];
			
			while((byteCount = inputStream.read(bytes)) != -1) {
				System.out.println("byteCount: " + byteCount);
				outputStram.write(bytes, 0, byteCount);
			}
			System.out.println("파일 복사");
			
		} catch (IOException e) {
			// 파일을 읽고쓰는데 발생하는 에러
			e.printStackTrace();
		} finally {
			try {
				if(inputStream != null) inputStream.close();
				if(outputStram != null) outputStram.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
