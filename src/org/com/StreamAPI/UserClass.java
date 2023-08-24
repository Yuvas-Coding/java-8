package org.com.StreamAPI;

public class UserClass {
	String name;
	int age;
	public UserClass(String name, int id) {
		super();
		this.name = name;
		this.age = id;
	}
	@Override
	public String toString() {
		return "UserClass [name=" + name + ", id=" + age + "]";
	}
	
}
