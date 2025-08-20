package _02_hashSet;

import java.util.*;

public class T04_HshSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		/*
		// 1~45 숫자중 6개(중복허용안됨) 추출하여 set에 넣기
		for(int i=1; set.size()<6; i++) {
			
			int num = (int)(Math.random()*45)+1;
			set.add(num);
			
			set.add((int)(Math.random()*45)+1);
		}
		*/
		while (set.size() < 6) {
			set.add((int) (Math.random() * 45) + 1);
		}
		System.out.println(set);
		
		List list = new ArrayList(set);
		Collections.sort(list);
		System.out.println(list);
	}
}
