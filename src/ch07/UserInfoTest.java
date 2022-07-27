package ch07;

class UserInfo {
	public String userId;
	public String password;
	public String userName;
	public String phoneNumber;
	public String userAddress;
	
	UserInfo() {};
	
	public String showUserInfo() {
		return "고객님의 아이디는 " + userId + "이고, 이름은 " + userName + "이다.";
	}
	
	public UserInfo(String id, String pw, String name) {
		this.userId = id;
		this.password = pw;
		this.userName = name;
	}
}

public class UserInfoTest {
	public static void main(String[] args) {
		
		UserInfo userLee = new UserInfo();
	
		userLee.userId = "a123";
		userLee.password = "zxcasdqwe";
		userLee.userName = "Lee";
		userLee.phoneNumber = "01012345678";
		userLee.userAddress = "Seoul";
		
		System.out.println(userLee.showUserInfo());
	
		UserInfo userKim = new UserInfo("b123", "zxcads", "Kim");
		System.out.println(userKim.showUserInfo());
	}
}
