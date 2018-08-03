package com.comparator;

public class Author implements Comparable<Author>{
	String lname;
	String fname;
	int age;
	float salary;
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Author(String lname, String fname, int age, float salary) {
		this.lname = lname;
		this.fname = fname;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public int compareTo(Author o) {
		// TODO Auto-generated method stub
		
		return this.age>o.age?1:this.age<o.age?-1:0;
	}


}
