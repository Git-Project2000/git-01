package com.imti.pojo;

public class Student {
	private Integer id;
	private String name;
	public Student() {
		super();
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
