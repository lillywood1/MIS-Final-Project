import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
public class CustomerInfo1 extends CompanyStorage { 
	
		public CustomerInfo1(String custName, String customerPhoneNum, String customerEmail) {
		super();
		customerEmail = "N/A";
		
	}
		Scanner kb = new Scanner(System.in);
		
		public void directCustomer() {
			CustomerInfo1 customer = new CustomerInfo1("N/A", "N/A", "N/A");
	 int userChoice = 0;
	 while (userChoice != 4) {
	 System.out.println("Welcome! What would you like to do?");
	 System.out.println("1. Place an order");
	 System.out.println("2. Confirm/add new phone number");
	 System.out.println("3. Confirm/add new email");
	 System.out.println("4. Exit");
	 userChoice = kb.nextInt();
	 kb.nextLine();
	 if (userChoice == 1) {
	 customer.placeOrder(menuOptions);
	 }
	 else if (userChoice == 2) {
	 customer.printPersonalInfo();
	 }
	 else if (userChoice == 3) {
	 customer.printEmail();
	 }
	 else if (userChoice == 4) {
	 System.out.println("Thank you for choosing Pot Bharoon, we hope to see you soon!");
	 }
	 else {
	 System.out.println("Please type a number 1-4.");
	 }
		}
		}
		
		
		
		private void placeOrder(Menu menuOptions) {
			System.out.println("Type 'start' to begin your order.");
			String readyToOrder = kb.nextLine();
			if(readyToOrder.equalsIgnoreCase("start")) {
				System.out.println("Here are the menu options.");
				menuOptions.printMenu();
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
			
			numberOfItems++;
			System.out.println("Here are number of items in your order: " + numberOfItems );
			}
	
		
	
		}




		public void printPersonalInfo() {
			System.out.println("If you are a new customer type 'new', if you are a returning customer type 'old'");
			String newReturning = kb.next();
			if(newReturning.equalsIgnoreCase("new")) {
				System.out.println("Enter your name.");
				String custName = kb.nextLine();
				System.out.println("Enter your phone number.");
				String customerPhoneNum = kb.nextLine();
				System.out.println("Is this the correct name and phone number?");
				System.out.println(custName + customerPhoneNum);
				String yesOrNo = kb.nextLine();
				if(yesOrNo.equalsIgnoreCase("yes")) {
					//**********
				Customer e = new Customer();
				e.setCustomerName(custName);
				e.setCustomerPhoneNumber(customerPhoneNum);
				customerInfo.put(e , customerPhoneNum);
				
				System.out.println(e.getCustomerName());
				System.out.println("Your information has been saved.");
			}
			}
				else if(newReturning.equalsIgnoreCase("old")) {
					Customer Arika = new Customer();
					Customer Lilly = new Customer();
					customerInfo.put(Arika, "4705556678");
					customerInfo.put(Lilly, "4703456789");
					System.out.println("Type the name associated with your account.");
					String nameAccount = kb.next();
					System.out.println(customerInfo.get(nameAccount));
					for (Entry<Customer, String> info : customerInfo.entrySet() ) {
						System.out.print(customerInfo.get(nameAccount));
					}
					
				}
				}	
		
		
		
	
		
		public void printEmail() {
			System.out.println("If you are a new customer type 'new', if you are a returning customer type 'old'");
			String emailRouting = kb.nextLine();
			if(emailRouting.equalsIgnoreCase("new")) {
				System.out.println("What is your email?");
				String yourEmail = kb.nextLine();
				System.out.println(yourEmail);
				System.out.println("Is this the email you would like to add?");
				String confirm = kb.nextLine();
				if(confirm.equalsIgnoreCase("yes")) {
				
					Customer b = new Customer(yourEmail);
					b.setCustomerEmail(yourEmail);
					customerEmails.add(b.getCustomerEmail());
					System.out.println("Your email has been saved.");
					
					
				}
			}
			else if(emailRouting.equals("old")){
				customerEmails.add("lilly@uga.edu");
				customerEmails.add("avani@uga.edu");
				System.out.println("Type in your email");
				String oldEmail = kb.nextLine();
				if (customerEmails.contains(oldEmail))
				{ 
					System.out.print("Your email is in our system.");}
				
			}
		}
		
		ArrayList<String> orderItems = new ArrayList<String>();
		
	
}




