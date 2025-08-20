package _02_hashSet;

import java.util.HashSet;
import java.util.Set;

class Member {
	String name;
	int age;
	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			// Member member = (Member)obj;
			// return name.equals(member.name) && age == member.age;	
			return name.equals(((Member)obj).name) && age == ((Member)obj).age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	@Override
	public String toString() {
		return name + "/" + age;
	}
}
public class T03_HashSet {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("더조은", 20));
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 30));
		set.add(new Member("더조은", 25));
		set.add(new Member("한빛나", 25));
		
		System.out.println("총 객체 수 : " + set.size());
		System.out.println(set);
	}
}
