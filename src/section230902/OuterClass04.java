package section230902;

/*
 * 지역 내부클래스
 * 지역내부클래스는 메서드 내부에서 선언되어 사용되는 클래스
 * 메서드 내부에서만 사용가능
 * 메서드가 종료될때 클래스도 사용종료됨
 * 일회용성으로 만들어서 사용함
 * */

public class OuterClass04 {
	private int speed = 10;
	public void getUnit(String name) {
		
		// 메서드내부에서 클래스선언
		class Unit {
			public void move() {
				System.out.println("name : " + name + "speed : " + speed);
			}
		}
		
		Unit unit = new Unit();
		unit.move();
	}
	
	public static void main(String[] args) {
		OuterClass04 outer = new OuterClass04();
		outer.getUnit("유닛이름");
	}
}
