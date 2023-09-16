package section230916;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import section230909.MemberVO;

/*
 * ObjectInputStream / ObjectOutputStream
 * 객체를 바이트 스크림으로 읽기/쓰기 클래스
 * 
 * Serializable
 * 질렬화, 객체를 일련의 byte로 변환해준다.
 * 
 * */

public class IO08 {
	public static void main(String[] args) {
		MemberVO member = new MemberVO();
		member.setName("피카츄");
		member.setMobile("01000000000");
		String filePath = "./upload/member.obj";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			// 파일이 없으면 생성해준다 (디렉터리는 생성안됨)
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(member);
			oos.flush();
			System.out.println("MemberVO 객체 파일화완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null) oos.close();
				if(fos!=null) fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
