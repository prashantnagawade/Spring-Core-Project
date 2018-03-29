package com.pga.Spring_Core;

public class Student {
	private int id;
	private String name;
	private float marks;
	Address addr;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public Address getAdd() {
		return addr;
	}
	public void setAdd(Address addr) {
		this.addr = addr;
	}
	public Student() {}
	public Student(int id, String name, float marks, Address address) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.addr = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]" + this.addr;
	}
	
	public void myinit() {
		System.out.println("***Bean Initiated***");
	}
	public void mydestroy() {
		System.out.println("***Bean destroyed***");
	}
}
