package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.List;

public class T02_ArrayList2 {

	public static void main(String[] args) {
		// 권장하지 않음
		// 모든 객체를 받을 수 있다
		List list = new ArrayList();
		
		list.add(1);
		list.add(3.14);
		list.add("5");
		
		Object num = list.get(0);
		int num1 = (int)list.get(0);
		System.out.println(num1 + 1);
		
		double dou2 = (double)list.get(1);
		System.out.println(dou2 + 1);
		
		int num3 = Integer.parseInt((String)list.get(2));
		System.out.println("합계 : " + (num1+dou2+num3));
	}
}