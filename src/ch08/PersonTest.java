package ch08;

class Person {
	
	public String name;
	public int age;
	public int height;
	public int weight;
	public String gender;
	
	Person(){};
	
	public void showPersonInfo() {
		System.out.println("Ű�� " + height + "�̰�, �����԰� " + weight + "kg�� " + gender + "�� �ִ�.");
		System.out.println("�̸��� " + name + "�̰�, ���̴� " + age + "���Դϴ�.");
	}
}

public class PersonTest {	
	public static void main(String[] args) {
		
		Person personT = new Person();
		personT.name = "Tomas";
		personT.age = 37;
		personT.height = 180;
		personT.weight = 78;
		personT.gender = "����";
		
		personT.showPersonInfo();
	}
}
