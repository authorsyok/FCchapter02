package ch17;

class Employee {
	private static int serialNum = 1000;
	
	private int employeeID;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeID = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		int i = 0;
		Employee.serialNum = serialNum;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}


public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		System.out.println(employeeLee.getEmployeeName() + "," + employeeLee.getEmployeeID());
		System.out.println(employeeKim.getEmployeeName() + "," + employeeKim.getEmployeeID());
		
		System.out.println(Employee.getSerialNum());

	}
}

