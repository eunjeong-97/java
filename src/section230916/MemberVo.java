package section230916;

import java.io.Serializable;

public class MemberVo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
