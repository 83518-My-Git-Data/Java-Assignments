package com.sunbeam.collections.list;

import java.util.Objects;

public class Student implements Comparable<Student>{
	
	Student()
	{
		
	}
	
	String name;
	int rollno;
	double marks;
	public Student(int rollno,String name, double marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	@Override
	public int compareTo(Student o) {
		return this.rollno - o.rollno;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
	}

	
	@Override
	public String toString() {
		return "Student [Roll no: " + rollno + ", Name = "+name+ ", Marks = "+marks + "]";
		
	}
	
	

}
