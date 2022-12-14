package ch10;

class Birthday {
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day < 1 || day > 31)
			isValid = false;
		else {
			isValid = true;
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) 
			isValid = false;
		else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
	}
}

public class BirthDayTest {
	public static void main(String[] args) {
		
		Birthday date = new Birthday();
		
		date.setYear(2019);
		date.setMonth(12);
		date.setDay(30);
		
		date.showDate();
	}
}
