package _07_comparable;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {  // 나이의 오름차순 정렬
		if(age < o.age)
			return -1;
		else if(age == o.age)
			return 0;
		else
			return 1;
	}
}

public class T01_CompareTo {
	public static void main(String[] args) {
		TreeSet<Person> p1 = new TreeSet<>();
		
		p1.add(new Person("홍길동", 45));
		p1.add(new Person("나자바", 24));
		p1.add(new Person("더조은", 32));
		
		System.out.println(p1);
	}
}
