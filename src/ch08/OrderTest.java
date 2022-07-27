package ch08;

class Order {
	
	String orderNumber;
	String customerPhone;
	String customerAddress;
	String orderDate;
	String orderTime;
	String menuId;
	int price;
	
	Order(){};
	
	public void showOrderDetail() {
		System.out.println("주문 접수 번호 : " + orderNumber);
		System.out.println("주문 핸드폰 번호 : " + customerPhone);
		System.out.println("주문 집 주소 : " + customerAddress);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menuId);
	}
}

public class OrderTest {
	public static void main(String[] args) {
		
		Order myOrder = new Order();
		myOrder.orderNumber = "1231241241";
		myOrder.customerPhone = "01012312412";
		myOrder.customerAddress = "강남";
		myOrder.orderDate = "2020";
		myOrder.orderTime = "13";
		myOrder.menuId = "0003";
		myOrder.price = 30000;
		
		myOrder.showOrderDetail();
		
		
	}
}
