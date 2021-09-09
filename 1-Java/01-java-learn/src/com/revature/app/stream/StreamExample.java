package com.revature.app.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		Person person1 = new Person(1, "Nik", 20);
		Person person2 = new Person(2, "Sai", 21);
		Person person3 = new Person(3, "VB", 22);
		Person person4 = new Person(4, "Prashanth", 23);
		Person person5 = new Person(5, "Harsha", 24);

		List<Person> personList = new ArrayList<>();

		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);

		// personList.forEach(e -> System.out.println(e));

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Id for which you want to retrive data : ");
		long id = scanner.nextLong();

		Person person = personList.stream().filter(l -> l.getId() == id).findAny().get();
		System.out.println(person);
		double averageAge = personList.stream().map(l -> l.getAge()).reduce(0,
				(sum, i) -> (sum + i) / personList.size());
		System.out.println(averageAge);
	}
}
