package section230820.access01;

public class Child extends Parent {
	public boolean isSuspenstion;
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		super.getInfo(); // 부모의 getInfo 호출
		System.out.println("isSuspenstion : " + isSuspenstion);
	}
	
}
