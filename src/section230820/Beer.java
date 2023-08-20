package section230820;

public class Beer {
	// 속성
	int volumn;
	String brand;
	String type;
	int price;
	
	public Beer() {
		this.volumn = 0;
		this.brand = "default brand";
		this.type = "default type";
		this.price = 0;
	}
	
	// 생성자 오버로딩
	public Beer(int volumn, String brand, String type, int price) {
		this.volumn = volumn;
		this.brand = brand;
		this.type = type;
		this.price = price;
	}
	
	public Beer(String[] options) {
		this(); // 자기자신호출
		getInfo();
		System.out.println("추가옵션목록");
		for (String op : options) {
			System.out.println("option: " + op);
		}
	}
	
	public Beer(int volumn, String brand, String type, int price,String[] options) {
		this(volumn, brand, type, price);
		getInfo();
		for (int i = 0; i < options.length; i++) {
			System.out.println(i + "번째 옵션 : " + options[i]);
		}
		
	}
	
	
	public void getInfo() {
		System.out.println("volumn : " + volumn);
		System.out.println("brand : " + brand);
		System.out.println("type : " + type);
		System.out.println("price : " + price);
	}
	
}
