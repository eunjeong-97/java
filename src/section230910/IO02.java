package section230910;

import java.io.File;
import java.io.IOException;

/*
 * 경로 path
 * 파일이나 디렉터리 위치를 나타내는 문자열
 * 
 * 1. 절대경로
 * 파일시스템의 루트 디렉터리부터 출발해서 -> 파일이나 디렉터리를 찾는 경로
 * 
 * 예) C:\Users\ITSC\eunjeong\worksapce\java
 * 
 * 2. 상대경로
 * 현재 작업 디렉터리를 기준으로 파일이나 디렉터리를 찾는 경로
 * 
 * 예) 
 * 현재위치 .
 * 상위폴더위치 ..
 * 현재 디렉터리 ./
 * 상위 디렉터리 ../
 * 
 * 경로구분값 윈도우 \, 유닉스계열 /
 * 
 * */

public class IO02 {
	public static void main(String[] args) throws IOException {
		File file = new File("./", "java.txt"); // 원래는 .\\이라고 해야겠지만 자바에서는 ./에서도 인식해줌
		File file02 = new File("src/section230910/", "java.txt"); // 원래는 .\\이라고 해야겠지만 자바에서는 ./에서도 인식해줌
		
		// createNewFile() 파일생성되면 true반환됨
		// 현재경로가 java 프로젝트로 지정되어있기 때문에 eunjeong/workspace/java/java.txt 경로로 파일이 생성됨
		if(file.createNewFile()) System.out.println("eunjeong/workspace/java경로에 java.txt 파일생성됨");
		if(file.delete()) System.out.println("eunjeong/workspace/java경로에 java.txt 파일삭제됨");
		
		if(file02.createNewFile()) System.out.println("section230910 폴더내부에 java.txt 파일생성됨");
		if(file02.delete()) System.out.println("section230910 폴더내부에 java.txt 파일삭제됨");
		
	}
}
