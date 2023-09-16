package section230916;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 * JSoup
 * 자바 오픈소스 라이브러리, HTML문서를 파싱하고 다루는데 사용됩니다. (크롤링)
 * 
 * 라이브러리 다운 및 적용
 * maven repository 사이트 > jsoup 검색 > 1.16.1 (원하는버전으로) > jar 파일 다운
 * java [java main] 우클릭 > Build Path > Configure Build Path > Libraries 탭 선택
 * Modulepath 선택 + Add Externals Library > jar 파일선택 > Apply and Close 
 * 
 * module-info.java 파일을 열어서
 * 외부라이브러리를 사용할때 
 * 
 * */

public class Network04 {
	public static void main(String[] args) throws IOException {
		String url = "https://music.bugs.co.kr/chart";
		Document doc = Jsoup.connect(url).get();
		Elements musicList = doc.select("p.title");
		Elements artistList = doc.select("p.artist");
		
		for (int i = 0; i < musicList.size(); i++) {
			int idx = i+1;
			String music = musicList.get(i).text().trim();
			String artist = artistList.get(i).select("a").get(0).text().trim();
			System.out.printf("%03d %s - %s", idx, music, artist);
			System.out.println();
		}
	}
}
