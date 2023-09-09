package section230909;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * id	name	mobile			address
 * 1	홍길동	01011111111		서울특별시
 * 2	짱구		01022222222		떡잎마을
 * 3	둘리		01033333333		쌍문동
 * */

public class Collection05 {
	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		Map<String, Object> first = makeMap(1, "홍길동", "01011111111", "서울특별시");
		Map<String, Object> second = makeMap(2, "짱구", "01022222222", "떡잎마을");
		Map<String, Object> third = makeMap(3, "둘리", "01033333333", "쌍문동");
		
		list.add(first);
		list.add(second);
		list.add(third);
	
		/* for (int i = 0; i < list.size(); i++) {
			Map<String, Object> map = list.get(i);
			System.out.println("id: " + map.get("id") + " // name: " + map.get("name") + " // mobile: " + map.get("mobile") + " // address : " + map.get("address"));
		} */
		
		System.out.println("no\tname\tmobile\t\taddr");
		for (Map<String, Object> map : list) {
			
			// 오브젝트타입을 int/string 으로 명시적으로 변환함
			int id = (int) map.get("id");
			String name = (String) map.get("name");
			String mobile = (String) map.get("mobile");
			String address = (String) map.get("address");
			
			String tab = "\t";
			System.out.println(id + tab + name + tab + mobile + tab + address);
		}
	}
	
	public static Map<String, Object> makeMap(Integer id, String name, String mobile, String address) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		map.put("mobile", mobile);
		map.put("address", address);
		return map;
	}
}
