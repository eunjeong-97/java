package section230820;

import section230820.access01.Parent;
import section230820.access01.Child;

/*
 * ✅ 상속 inheritance
 * 부모클래스(상위클래스, 슈퍼클래스)와 자식클래스(하위클래스)가 있으며
 * 자식클래스는 부모클래스를 상속받아 그 부모의 멤버(변수, 메서드) 사용가능
 * 
 * ✅ 상속방법
 * class 자식클래스명 extends 부모클래스명
 * 
 * ✅ 패키지Package
 * 관련된 클래스, 인터페이스 등 그룹화 하는데 사용되는 디렉터리
 * 
 * 이름충돌방지: 동일한 이름의 클래스, 인터페이스 패키지를 달리하여 충돌방지
 * 코드 구조화: 관련된 클래스를 패키지 단위로 그룹화
 * 접근제어: 클래스나 맴버에 접근제한자를 적용해서 해당패키지 외부에서 접근을 제한할 수 있음
 * 
 * ✅ super 키워드
 * 부모객체를 참조하는 키워드
 * 
 * ✅******** 오버라이딩 Overriding
 * 상속받은 메서드를 하위클래스에서 재정의함
 * 
 * ✅ 어노테이션
 * 자바 프로그래밍에서 메타데이터를 나타내며 클래스, 메서드, 변수 등의 선언부에서 적용가능
 * 
 * @Override
 * 메서드가 상위클래스에서 오버라이딩되었다는 뜻
 * */


/*
 * 맴버
 * 클래스나 인터페이스 안에 포함되는 요소
 * 클래스나 인터페이스는 데이터와 메서드의 집합이고, 이러한 요소들을 멤버라 부른다.
 * 
 * 멤버의 종류
 * 1. 필드(Fields)
 * 클래스나 인터페이스 안에 선언되는 변수
 * 데이터를 저장하기 위한 용도로 사용됨
 * - 인스턴스 변수: 객체의 각 인스턴스마다 별도의 값 저장됨
 * - 정적 변수: 클래스 수준에서 공유되는 값 저장됨
 * 
 * 2. 메서드
 * 클래스나 인터페이스 안에 선언되는 함수
 * 작업을 수행하기 위한 코드블럭 가짐
 * 메서드는 호출되어서 특정한 동작을 수행함
 * - 인스턴스 메서드 : 객체의 인스턴스에 의해 호출됨
 * - 정적 메서드: 클래스 수준에서 호출됨
 * 
 * 3. 생성자
 * 클래스의 인스턴스를 생성할 때 호출되는 특수한 종류의 메서드
 * 객체의 초기화 작업을 수행하는 역할
 * 생성자는 클래스 이름과 동일하고, 오버로딩을 통해 여러 형태의 생성자를 정의가능
 * */

public class Inheritance01 {
	public static void main(String[] args) {
		// 만약 import없이 사용한다면
		// section230820.access01.Bicycle
		Parent parent = new Parent();
		parent.handleType = "handleType";
		parent.gear = 7;
		parent.wheel = 2;
		parent.getInfo();
		
		System.out.println("==================");
		Child child = new Child();
		child.gear = 30;
		child.handleType = "핸들바";
		child.wheel	= 2;
		child.isSuspenstion = true;
		child.getInfo();
		
	}
}
