package _01_langPackage;

import java.util.Objects;

class Person {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object o) {
		Person p = (Person)o;
		return name.equals(p.name) && age == p.age; 
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}

public class T04_exRun {
	public static void main(String[] args) {
		Person person1 = new Person("더조은", 24);
		Person person2 = new Person("더조은", 24);
		
		System.out.println(person1);
		System.out.println(person1.equals(person2));
		System.out.println(person1.hashCode() == person2.hashCode());
	}
}