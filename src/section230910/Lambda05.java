package section230910;

import java.util.List;
import java.util.stream.Collectors;

public class Lambda05 {
	public static void main(String[] args) {
		List<Integer> list = List.of(4,6,15,21,23,3);
		list.stream().filter(e->e%2==0).map(e->e*e).forEach(System.out::println);
		
		List<Integer> list02 = list.stream().filter(e->e%2==0).map(e->e*e)
				.collect(Collectors.toList()); // 변환된 요소를 list로 반환
		list02.stream().forEach(System.out::println);
		long count = list.stream().count();
		System.out.println("count: " + count); // 개수
	}
}
