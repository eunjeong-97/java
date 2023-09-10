package section230910;

import java.util.List;

public class Lambda03 {
	public static void main(String[] args) {
		// 불변리스트객체 JDK 9버전부터 지원
		List<String> names = List.of("Apple", "Banana", "Candy", "Diamond");
		// printFilterdList(names);
		printWithFiltedFunc(names);
		names.set(1, "JDK 9버전부터 불변객체여서 에러가 발생합니다."); 
	}
	private static void printFilterdList(List<String> list) {
		for (String string : list) {
			if(string.endsWith("nd")) {
				System.out.println(string);
			}
		}
	}
	private static void printWithFiltedFunc(List<String> list) {
		list.stream().filter(e -> e.endsWith("nd")).forEach(e -> System.out.println(e));
	}	
}
