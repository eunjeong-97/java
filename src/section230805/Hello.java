package section230805;

/*
 * 이클립스 시작하기
 * 
 * 1. 이클립스 다운
 * https://www.eclipse.org/downloads/ 페이지
 * `Download Packages` 선택 > 압축파일풀어서 eclipse 폴더 > eclipse/eclipse.exe 파일실행
 * 
 * 2. 이클립스 실행
 * 내가 만든 workspace 폴더로 워크스페이스 지정
 * 지금의 경우, eunjeong\workspace
 * launch 버튼눌러서 이클립스 실행
 * 
 * 3. 폴더구조
 * eunjeong\workspace
 * 1. .metadata
 * 2. java (자바프로젝트)
 * 		2-1. .settings
 * 		2-2. bin
 * 		2-3. src
 * 			2-3-1. 패키지폴더
 * 		2-4. .classpath
 * 		2-5. .project
 * 
 * ==================================
 * 4. 자바패키지열기
 * 패키지: 자바 코드를 모은 폴더
 * https://emflant.tistory.com/88
 * 
 * [자바패키지 import]
 * File > Import > General > Existing Projects into Workspace
 * Browse
 * workspace 내부에 만든 자바패키지 선택
 * Projects 내부에 폴더를 잘 인식했으면 Finish 버튼
 * 
 * [Packge Explorer 열기]
 * [Window] - [Show View] - [Other...]에서 [Java] - [Package Explorer] 선택
 * 혹은 Alt + Shift + Q, P
 *
 * */

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

}
