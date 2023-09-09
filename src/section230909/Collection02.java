package section230909;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.Vector;

/*
 * List
 * 컬렉션 프레임윗 중 하나 인터페이스
 * 순서가 있는 데이터모음을 다루는 객체
 * 선형 배열 객체
 * 가변 배열 객체
 * 인덱스 값이 있음
 * 
 * Vector
 * 선형배열객체 
 * ArrayList와 동일함
 * Thread safe
 * */
public class Collection02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// 데이터저장
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add("네번째");
		list.add("다섯번째");
		list.add("여섯번째");
		list.add("일곱번째");
		
		// 특정 인덱스 값으로 저장된 데이터 가져오기
		String str = list.get(6);
		System.out.println("list 6 인덱스값" + str); 
		
		// 특정 인덱스 값으로 저장된 데이터 삭제
		list.remove(1);
		
		System.out.println("list 개수" + list.size());
		System.out.println("1번 인덱스값" + list.get(1));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list["+i+"]" + list.get(i));
		}
		
		System.out.println("============");
		
		// 특정 인덱스 값으로 데이터 삽입
		list.add(4, "새로운 4번째 데이터");
		for(String name: list) {
			System.out.println("name" + name);
		}
		
		// 얕은복사
		ArrayList list02 = (ArrayList) list;
		
		// 깊은복사
		List<String> list03 = (List<String>) list02.clone();
		
		System.out.println("============");
		
		for (String name : list03) {
			System.out.println("name : " + name);
		}
		
		System.out.println("============");
		
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("1");
		linkedList.add("2");
		
		
		System.out.println("=======");
		
		// Vector
		Vector<String> vec = new Vector<String>();
		vec.add("1");
		vec.add("2");
		vec.add("3");
		System.out.println("size: " + vec.size());
		System.out.println("1번 인덱스값 : " + vec.get(1));
		
	}
}
