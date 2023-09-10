package section230909;

import java.util.List;

/*
 * 스트림(Stream)
 * 데이터 처리와 컬렉션을 다루는데에 사용됨
 * 선언적이고 함수형 스타일의 API
 * 컬렉션을 스트림으로 변환해서 -> 조작, 필터링, 매핑 등 효율적이고 간결하게 수행가능
 * 
 * */


public class Lambda02 {
	public static void main(String[] args) {
		
		// List.of()로 리스트를 만들게 되면 불변리스트 객체: JAVA9버전부터 지원
		List<String> names = List.of("Apple", "Banana", "Candy", "Diamond");
	
		// names.add("불변리스트 객체이기 때문에 에러가 발생한다");
	
		printList(names);
		System.out.println("============");
		printWithFP(names);
	}
	
	private static void printList(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream().forEach(e -> System.out.println(e));
	}
}
