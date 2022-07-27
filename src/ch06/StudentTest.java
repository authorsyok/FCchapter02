package ch06;

class Student {
	public int studentID;
	public String studentName;
	public int grade;
		
	public Student(int id, String name, int g) {
		this.studentID = id;
		this.studentName = name;
		this.grade = g;
	}
	
	public String showStudentInfo() {
		return studentID + "의 이름은 " + studentName + "이고, " + grade + "학년이다.";
	}
}

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student(12345, "Lee", 3);
		
		String data = studentLee.showStudentInfo();
		System.out.println(data);
	}
}
