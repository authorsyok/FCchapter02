package ch04;

class Student {
	String studentName;
	String address;
	
	Student() {};
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
}

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "����";		
		studentLee.showStudentInfo();
	
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
