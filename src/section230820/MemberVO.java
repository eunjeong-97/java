package section230820;

/*
 * this: 자기자신을 가리키는 참조키워드
 * 
 * VO (Value Object), DTO (Data Transfer Object)
 * VO와 DTO를 혼용하며 사용한다.
 * 값 오브젝트로써 목적에 맞는 변수의 집합
 * 데이터베이스 또는 네트워크통신 간 값 운반용으로 사용됨
 * 
 * private 접근제한자를 통해 캡슐화(정보은닉)
 * 객체의 속성과 행위를 하나로 묶고 외부로부터 내부를 감싸 숨겨 은닉한다
 * 
 * */

public class MemberVO {
	// private 접근제한자: 외부에서 사용하지 못하게 막음
	private String id;
	private String password;
	private String name;
	private String mobile;
	private String email;
	private int age;
	private String address;
	
	// Source > Generate Getter, Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<=0) {
			System.out.println("올바른 형식의 나이를 입력해주세요,");
			return;
		}
		if(age<20) {
			System.out.println("미성년자는 가입할 수 없습니다.");
			return;
		}
		this.age = age;
	}


	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}