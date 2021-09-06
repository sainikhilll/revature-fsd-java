package com.revature.app.collections;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person person) {
		// TODO Auto-generated method stub
		//Person otherPerson = (Person) o;
		System.out.println(this.name + " " + person.name);
		//return name.compareTo(otherPerson.name);
		return age - person.age;
	}

}
