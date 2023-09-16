package section230916;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * URL Uniform Resource Locator
 * 인터넷에서 웹페이지, 이미지, 동영상 등과 같은 리소스를 찾을 수 있는 주소
 * https://n.naver.com/article/215/0001125423?ntype=RANKING
 * 
 * 프로토콜 Protocol
 * 컴퓨터 네트워크를 통해 통신을 수행하기 위한 표준규칙, 절차, 혹은 통신 프로세스
 * http, https - 웹서버 프로토콜
 * ftp - 파일서버 프로토콜
 * mailto - 전자메일 서버 프로토콜
 * telnet - 원격접속 프로토콜
 * 
 * 호스트 host
 * 리소스가 위치한 서버의 이름
 * n.new.naver.com
 * 
 * 포트 port
 * 서버에서 사용하는 서비스나 응용프로그램에 활당된 번호
 * 80 http default
 * 443 https default
 * 
 * 경로 path
 * 웹서버에서 자원에 대한 경로(물리/추상경로)
 * /article/215/0001125423
 * 
 * 쿼리 query
 * ntype=RANKING
 * 
 * */ 

public class Network02 {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://n.naver.com/article/215/0001125423?ntype=RANKING");
		System.out.println("protocol: " + url.getProtocol());
		System.out.println("host: " + url.getHost());
		System.out.println("port: " + url.getPort());
		System.out.println("path: " + url.getPath());
		System.out.println("query: " + url.getQuery());
	}
}
