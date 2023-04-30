import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;
public class Customer {
	Scanner kb = new Scanner(System.in);
	protected String customerName;
	protected String customerPhoneNumber;
	protected String customerEmail;

	
	ArrayList<String> orderItems = new ArrayList<String>();
	
	public Customer(String custName, String customerPhoneNum) {
		customerName = "N/A";
		customerPhoneNumber = "N/A";
		customerEmail = "N/A";
	}
	public Customer(String customerEmail2) {
		customerEmail = "N/A";
	}
	public Customer() {
		customerName = "N/A";
		customerPhoneNumber = "N/A";
		customerEmail = "N/A";
	}
	
	public String getCustomerName() {
		
		return customerName;
		
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
	public void placeOrder(Menu m) {
		System.out.println("Type 'start' to begin your order.");
		String readyToOrder = kb.nextLine();
		if(readyToOrder.equalsIgnoreCase("start")) {
			System.out.println("Here are the menu options.");
			m.printMenu();
		}
		
		System.out.println("Enter the combo number you would like to order.");
		System.out.println("Type 'done' when you are done with your order.");
		while(!readyToOrder.equals("done")) {
		String order = kb.nextLine();
		orderItems.add(order);
		System.out.println("These are the item(s) in your order: ");
		for(int i = 0; i < orderItems.size(); i++) {
			System.out.println(orderItems.get(i));
		}
		}
		
	}
	
	
}
