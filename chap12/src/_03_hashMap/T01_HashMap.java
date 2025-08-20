package _03_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
  	- 키와 값의 쌍으로 이루어져 있다.
  	- 값을 얻어올때 키값으로 얻어온다. 그러므로 키는 중복 불가. 값은 중복 허용
  	- Map계열은 Collection을 구현한 클래스가 아님
  	  : 넣을 때는 put() 사용
 	1. HashMap
 	2. TreeMap
 */
public class T01_HashMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 넣기
		map.put("아무개", 97);
		map.put("더조은", 100);
		map.put("홍길동", 86);
		map.put("아더워", 98);
		
		// Entry 개수
		System.out.println("총 Entry 수 : " + map.size());
		
		// 객체 찾기
		System.out.println("홍길동 : " + map.get("더조은"));
		System.out.println(map);
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		// 키만 얻어오기
		Set<String> keySet = map.keySet();  
		System.out.println(keySet);
		
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ":" + value);
		}
		System.out.println("--------------------------------------");
		
		// 키와 값이 들어있는 entrySet
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key =entry.getKey();		// 키 가져오기
			Integer value = entry.getValue();  // 값 가져오기
			System.out.println(key + ":" + value);
		}
	}
}
