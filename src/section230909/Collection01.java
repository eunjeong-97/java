package section230909;

import java.util.Stack;

/*
 * 컬렉션 Collection
 * 자바에서 컬렉션은 여러 객체를 모아서 저장하고 관리하는 자료구조이다
 * 
 * Stack 클래스
 * 선입후출 FILO : 먼저 들어온 값이 마지막에 나간다
 * 
 * */


public class Collection01 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		
		System.out.println("stack 데이터개수" + stack.size());
		
		// 데이터 하나씩 가져오기
		System.out.println("1번: " + stack.pop());
		System.out.println("2번: " + stack.pop());
		System.out.println("3번: " + stack.pop());
		
		// 가장 위에 있는 데이터확인
		System.out.println("가장 위에 있는 데이터확인: " + stack.peek());
		
		// stack 전체출력
		while (stack.empty() == false) {
			String name = stack.pop();
			System.out.println("pop 데이터" + name);
		}
		
		
	}
}