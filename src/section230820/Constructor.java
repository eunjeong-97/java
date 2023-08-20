package section230820;

/*
 * 생성자 (Constructor)
 * 객체를 생성할 때 실행되는 반환값이 없는 메서드
 * 객체 초기화륾 목적으로 사용됨
 * 클래스명과 동일하다
 * */
public class Constructor {
	public static void main(String[] args) {
		Book book01 = new Book();
		book01.getInfo();
		book01.title = "";
		book01.price = 9000;
		book01.totalPage = 280;
		book01.author = "";
		book01.getInfo();
		
		System.out.println("===================");
		Beer beer = new Beer(500, "BRAND", "TYPE", 3000);
		beer.getInfo();
		
		System.out.println("===================");
		Beer beer01 = new Beer();
		beer01.getInfo();
	
		System.out.println("===================");
		String[] options = {"옵션1", "옵션2", "옵션3", "옵션4"};
		new Beer(options);
		
		System.out.println("===================");
		new Beer(500, "BRAND", "TYPE", 3000, options);
	}
}
