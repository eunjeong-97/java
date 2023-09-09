package section230909;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * Set
 * 순서가 없는 컬렉션 프레임웍
 * (프레임웍: 구조를 가지고 있는 자료구조)
 * 순서가 없기 때문에 값의 중복 허용안함
 * 
 * - LinkedHashSet: HashSet을 확장한 클래스로, 삽입순서유지
 * - TreeSet: 오름차순으로 정렬됨
 * 
 * Iterator 반복자
 * 자바 컬렉션 프레임웍에서 컬렉션에 저장된 요소를 읽어오는데 사용하는 인터페이스
 * */


public class Collection03 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		// 데이터추가
		set.add("피카츄");
		set.add("라이츄");
		set.add("파이리");
		
		// 중복값 허용하지 않음
		boolean isAdd = set.add("피카츄");
		System.out.println("isAdd" + isAdd);
		
		// 데이터사이즈
		System.out.println("데이터길이" + set.size());
		
		// 전체데이터 출력
		for (String name : set) {
			System.out.println("name : " + name);
		}
		
		System.out.println("=======");
		
		Iterator<String> it = set.iterator();
		// hasNext() - 커서역할, 다음요소가 있는지 확인하여 논리값 반환
		while (it.hasNext()) {
			String name = (String) it.next(); // next() - 해당요소 반환
			System.out.println("name : " + name);
		}
		
		
		// TreeSet : 오름차순으로 정렬됨
		TreeSet<String> treeset = new TreeSet<String>();

		// 데이터추가하기
		treeset.add("4");
		treeset.add("1");
		treeset.add("3");
		treeset.add("2");
		
		for (String name : treeset) {
			System.out.println("name: " + name);
		}
		

		
	}
}
