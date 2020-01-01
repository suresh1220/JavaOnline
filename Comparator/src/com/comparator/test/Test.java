package com.comparator.test;

public class Test {
	private int id;
	private String name;
	private String address;

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", address=" + address + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args)
	{
		Test t= new Test();
		
		System.out.println("This for test push from sts");
	}

}
