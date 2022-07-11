package week2.day2;

public class MyMobile {
	float version=12.00f;
	String name="IQOO"; 
	long number=8681021072l;
	float amount=209.00f;
	
	public void makeCall() {
	System.out.println("My mobile number is " +number);
	}
	public void sendMsg() {
	System.out.println("Hi Friends");
	}
	private void payBills() {
	System.out.println("Mobile Recharge pack is Rs." + amount);
	}
	
	public static void main(String[] args) {
	MyMobile data = new MyMobile();
	System.out.println(data.name);
	System.out.println(data.version);
	System.out.println(data.amount);
	System.out.println(data.number);
	data.makeCall();
	data.sendMsg();
	data.payBills();
	}

}
