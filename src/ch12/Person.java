package ch12;

public class Person {
	
	String name;
	int age;
	
	public Person(String n, int a) {
		this.name = n;
		this.age = a;
	}
	public Person() {
		this("no name", 1);
	}
	public void showPerson() {
		System.out.println(name + ", " + age);
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.showPerson();
	}
}
