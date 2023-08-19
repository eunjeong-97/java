package section230819;

public class Card {
	public static int number = 62; // 접근제어자 static 붙음 → 정적변수
	public String text = "A";
	
	public void getInfo(String title) {
		System.out.println(title+" => "+"number: "+number+ " // text: "+text);
	}
}
