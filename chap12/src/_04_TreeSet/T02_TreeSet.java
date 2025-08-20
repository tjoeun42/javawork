package _04_TreeSet;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class T02_TreeSet {

	public static void main(String[] args) {
		Integer[] arr = {1,4,6,7,3,2,8,9,5,4,2,6,7,9};
		
		Set<Integer> set = new TreeSet<>();
		for(Integer i : arr)
			set.add(i);
		
		System.out.println(set);
		/*
		NavigableSet
			java의 set 인터페이스를 확장한 컬렉션 인터페이스
			정렬된 순서로 저장하고,
			그 요소에 다양한 탐색작업을 지원하는 메서드 제공
			SortedSet 인터페이스도 확장하고 있기 때문에, 정렬된 순서로 데이터를 다룰 수 있다.
			
			lower
			floor
			ceiling
			higher
			pollFirst() : 첫번째 요소를 제거하고 그 요소를 반환
			pollLast() : 마지막 요소를 제거하고 그 요소를 반환
			descendingSet() : 내림차순으로 정렬한 요소 반환
			headSet(기준, true) : true이면 기준값 포함, false이면 기준값 미포함
		*/
		NavigableSet<Integer> desending = ((TreeSet)set).descendingSet();
		System.out.println(desending);
		
		Integer[] score = {100, 12, 64, 97, 88 ,45};
		TreeSet<Integer> setScore = new TreeSet<>();
		for(Integer i : score) {
			setScore.add(i);
		}
		System.out.println(setScore);
		
		// true를 넣지 않으면 false가 기본값
		System.out.println("88점 미만인 점수 검색 : " + setScore.headSet(88, true));
		System.out.println("88점 이상인 점수 검색 : " + setScore.tailSet(88, false));
		System.out.println("45점 이상 100점 미만 사이의 점수 : " + setScore.subSet(45, true, 100, false));
	}
}







