package section230902.access03;

public class SoccerTeam implements Cloneable {
	public String name;
	public String location;
	public String league;
	public int since;
	
	// 생성자
	public SoccerTeam(String name, String location, String league, int since) {
		this.name = name;
		this.location = location;
		this.league = league;
		this.since = since;
	}
	
	@Override
	public String toString() {
		return name + '@' + league;
	}
	
	// Cloneable 클래스 상속받으면 사용가능한 메서드
	// protected : 같은패키지이거나 상속된 곳에서만 사용가능
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Object callClone() throws CloneNotSupportedException {
		return clone();
	}
}
