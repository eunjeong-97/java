package section230910;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNum implements Predicate<Integer> {
	// 인터페이스 상속한것이기 때문에 오버라이딩 해야함
	@Override
	public boolean test(Integer e) {
		return e%2==0;
	}
}

class NumberMap implements Function<Integer, Integer> {
	@Override
	public Integer apply(Integer num) {
		return num * num;
	}
}

class SystemOut implements Consumer<Integer> {
	@Override
	public void accept(Integer num) {
		System.out.println(num);
	}
}


public class Lambda06 {
	public static void main(String[] args) {
		List<Integer> list = List.of(24,46,7,3,19);
		// 함수대신 인터페이스 생성자 넣어도 됨
		list.stream().filter(new EvenNum()).map(new NumberMap()).forEach(new SystemOut()); 
	}
}
