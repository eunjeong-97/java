package section230909;

import java.util.ArrayList;
import java.util.List;

public class Collection06 {
	public static void main(String[] args) {
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO member01 = new MemberVO();
		MemberVO member02 = new MemberVO();
		String tab = "\t";
		
		member01.setNo(1);
		member01.setName("이름01");
		member01.setMobile("전화번호01");
		member01.setAddr("주소01");
		
		member02.setNo(2);
		member02.setName("이름02");
		member02.setMobile("전화번호02");
		member02.setAddr("주소02");
		
		list.add(member01);
		list.add(member02);
		
		System.out.println("no\tname\tmobile\t\taddr");
		for (MemberVO member : list) {
			int id = member.getNo();
			String name = member.getName();
			String mobile = member.getMobile();
			String addr = member.getAddr();
			System.out.println(id + tab + name + tab + mobile + tab + tab + addr );
		}
	}
}
