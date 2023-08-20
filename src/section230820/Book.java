package section230820;

public class Book {
	String title;
	int price;
	int totalPage;
	String author;
	
	// 생성자: Book클래스로 인스턴스 생성시 실행됨, 맴버변수 초기화
	// this: 자기자신 참조키워드
	public Book() {
		this.title = "TITLE";
		this.price = 30000;
		this.totalPage = 100;
		this.author = "AUTHOR";
		
		// 인스턴스 생성할때 실행할 메서드 정의해도 됨
		getInfo(); 
	}
	
	public void getInfo() {
		System.out.println("title" + title);
		System.out.println("price" + price);
		System.out.println("totalPage" + totalPage);
		System.out.println("author" + author);
	}
	

}
