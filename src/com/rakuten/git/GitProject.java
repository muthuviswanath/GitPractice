package com.rakuten.git;

public class GitProject {

	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GitProject(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
}
