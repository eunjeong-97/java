package section230909;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
 * Map 인터페이스는 키-값(value) 쌍으로 데이터를 저장하는 자료구조
 * 키는 중복허용안함, 순서보장안함
 * 
 * 
 * */

public class Collection04 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 데이터저장
		map.put("string01", 1);
		map.put("string02", 2);
		map.put("string03", 3);
		
		// map에서 값 가져오기
		int score = map.get("string01");
		System.out.println("string01 : " + score);

		// 특정 키의 존재여부 확인
		if(map.containsKey("string02")) {
			System.out.println("string02: " + map.get("string02"));
		}
		
		// key값들로만 set객체로 만듦
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println("key: " + key);
			System.out.println("value: " + map.get(key));
		}
		
		System.out.println("===========");
		Set<String> keys02 = map.keySet();
		Iterator<String> it = keys02.iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			System.out.print("key: " + key + " ");
			System.out.println("value: " + map.get(key));
			
		}
		
		// map 데이터길이
		System.out.println("map길이" + map.size());
		
		// 키값을 통해 특정 데이터 삭제
		map.remove("string02");
		
		// 데이터 전체삭제
		map.clear();
	}
}
