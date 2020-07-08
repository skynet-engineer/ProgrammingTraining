package day10;

public class Person {
	
	int age;
	String name;
	
	public void show() {
		System.out.println("hello");
	}
	
	public void showName(String name) {
		System.out.println("i am " + name);
	}
	
	public Person() {}
	
	public Person(String name,int age) {
		this.age = age;
		this.name = name;
	}
}
