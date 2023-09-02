package section230902;

public class BirdImpl implements Bird {
	private String name = "앵무새";
	
	@Override
	public void sing() {
		System.out.println("sing");
		
	}
	
	@Override
	public void fly() {
		System.out.println("fly");
	}
	
	public String getName() {
		return name;
	};
}
