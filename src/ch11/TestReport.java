package ch11;

class MakeReport {
	StringBuilder sb = new StringBuilder();
	
	private String line = "========================\n";
	private String title = "이름\t 주소\t 전화번호 \n";
	
	private void makeHeader() {
		sb.append(line);
		sb.append(title);
		sb.append(line);
	}
	private void generateBody() {
		sb.append("James \t");
		sb.append("Seoul \t");
		sb.append("010-1234 \n");
		
		sb.append("Tomas \t");
		sb.append("Busan \t");
		sb.append("010-5678 \n");
	}
	private void makeFooter() {
		sb.append(line);
	}
	public String getReport() {
		makeHeader();
		generateBody();
		makeFooter();
		
		return sb.toString();
	}
}

public class TestReport {
	public static void main(String[] args) {
		
		MakeReport report = new MakeReport();
		String str = report.getReport();	
		System.out.println(str);
	}
}
