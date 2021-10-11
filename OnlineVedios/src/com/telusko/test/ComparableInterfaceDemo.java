package com.telusko.test;

import java.util.ArrayList;
import java.util.List;

public class ComparableInterfaceDemo {

	public static void main(String[] args) {

		List<Student> students=new ArrayList<>();
		students.add(new Student(23,"Haari",968.97));
		students.add(new Student(45,"Sahaja",767.98));
		students.add(new Student(33,"ganesh",668.93));
		for(Student s:students) {
			System.out.println(s);
		}
	}
}
