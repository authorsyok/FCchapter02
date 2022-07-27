package ch08;

class Person {
	
	public String name;
	public int age;
	public int height;
	public int weight;
	public String gender;
	
	Person(){};
	
	public void showPersonInfo() {
		System.out.println("키가 " + height + "이고, 몸무게가 " + weight + "kg인 " + gender + "이 있다.");
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "세입니다.");
	}
}

public class PersonTest {	
	public static void main(String[] args) {
		
		Person personT = new Person();
		personT.name = "Tomas";
		personT.age = 37;
		personT.height = 180;
		personT.weight = 78;
		personT.gender = "남성";
		
		personT.showPersonInfo();
	}
}
