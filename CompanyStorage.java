
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;
public class CompanyStorage {
	Scanner kb = new Scanner(System.in);
	protected static int numberOfItems;
	protected HashMap<Customer, String> customerInfo = new HashMap<Customer, String>();
	
	protected HashSet<String> customerEmails = new HashSet<String>();
	
	
	protected Menu menuOptions = new Menu(); 
	public void addNamePhone(Customer customerPhoneNum, String name) {
		customerInfo.put(customerPhoneNum, name);
	}
	public void callNamePhone(String name, String phoneNum) {
		
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
				
				customerEmails.add(yourEmail);
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
				System.out.println("Your email is saved");
			}
			else 
			{
				System.out.println("Your email is not in the system.");
			}
		}
	}
	
	
		
}

