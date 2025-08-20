package _03_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class T03_SnackRun {

	public static void main(String[] args) {
		/*키 = String
		값 = Snack객체*/
		HashMap<String, Snack> hm = new HashMap<>();
		
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("포테이토칩", new Snack("짠맛", 500));
		hm.put("칸초", new Snack("단맛", 800));
		hm.put("다이제스트", new Snack("초코맛", 1000));
		
		System.out.println(hm);
		
		// 1. put() : 키가 없으면 추가, 키가 있으면 값을 변경
		hm.put("새우깡", new Snack("매운맛",700));
		System.out.println(hm);
		
		// 2. get(Object key) : 키에 해당하는 값 반환
		Snack s = hm.get("다이제스트");
		System.out.println(s);
		
		// 3. size() : 객체의 갯수 반환
		System.out.println(hm.size());
		
		// 4. replace(K key, V value) : 해당 키를 찾아서 전달한 값으로 변경
		//								만약 키가 없으면 아무것도 안함
		hm.replace("포테이토칩", new Snack("짠맛", 300));
		System.out.println(hm);
		
		Set keySet = hm.keySet();
		Iterator itKey = keySet.iterator();
		while(itKey.hasNext()) {
			String key = (String)itKey.next();
			Snack value = hm.get(key);
			System.out.println(key + "=" + value);
		}
	}
}
