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
		System.out.println("�ֹ� ���� ��ȣ : " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + customerPhone);
		System.out.println("�ֹ� �� �ּ� : " + customerAddress);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ� �ð� : " + orderTime);
		System.out.println("�ֹ� ���� : " + price);
		System.out.println("�޴� ��ȣ : " + menuId);
	}
}

public class OrderTest {
	public static void main(String[] args) {
		
		Order myOrder = new Order();
		myOrder.orderNumber = "1231241241";
		myOrder.customerPhone = "01012312412";
		myOrder.customerAddress = "����";
		myOrder.orderDate = "2020";
		myOrder.orderTime = "13";
		myOrder.menuId = "0003";
		myOrder.price = 30000;
		
		myOrder.showOrderDetail();
		
		
	}
}
