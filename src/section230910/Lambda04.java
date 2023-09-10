package section230910;

import java.util.List;

public class Lambda04 {
	public static void main(String[] args) {
		List<Integer> list = List.of(4,6,15,21,23,3);
		
		int sum = normalSum(list);
		int sum02 = fpSum(list);
		System.out.println("합계: " + sum);
		System.out.println("합계: " + sum02);
	}
	
	private static int normalSum(List<Integer> list) {
		int sum = 0;
		for (Integer num : list) {
			sum += num;
		}
		return sum;
	}
	
	// reduce: 스트림요소들을 결합해서 단일결과를 생성함
	private static int fpSum(List<Integer> list) {
		return list.stream().reduce(0, (sum, num) -> sum += num);
	}
}
