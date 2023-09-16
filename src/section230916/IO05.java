package section230916;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * BufferedInputStream / BufferedOutputStream
 * 자바에서 성능을 향상시켜주기 위한 I/O 보조스트림
 * 
 * BufferedInputStream
 * 
 * 
 * BufferedOutputStream
 * */

public class IO05 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("./upload/hello.txt");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("./upload/hello3.txt");
			bos = new BufferedOutputStream(fos);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b,0,readByteCnt);
			}
			bos.flush(); // 버퍼에 남은 데이터를 파일에 쓰고, 버퍼에 지움
			System.out.println("파일복사완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos!=null) bos.close();
				if(fos!=null) fos.close();
				if(bis!=null) bis.close();
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
