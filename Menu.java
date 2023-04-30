import java.util.Scanner;
import java.util.HashSet;
public class Menu {
	
	
	Scanner kb = new Scanner(System.in);
	
	
	protected String Combo1;
	protected String Combo2;
	protected String Combo3;
	String order;
	
	
	
	
	String[] menu = new String[5]; {
	menu[0] = "Combo 1: Fried Rice + Chili Chicken";
	menu[1] = "Combo 2: Chicken Khemma Frice Rice + Boba";
	menu[2] = "Combo 3: Fried Rice + Veg Manuchurian";
	menu[3] = "Combo 4: Fried Rice + Chili Paneer";
	menu[4] = "Combo 5: Paneer Panini + Masala Fries"; 
	}
	
	public void printMenu() {
		for (int i = 0; i < menu.length;i++) {
			System.out.println(menu[i]);
		}
	}
	

	
	
	
}


