package PracticeSession;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;


public class GuenthersMarket {
	
	private static Scanner scan;
	private static Map<String, Double> items = new TreeMap<>(); 
	private static List<String> orderNames = new ArrayList<>();
	private static List<Double> orderPrices = new ArrayList<>();
	

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		fillItemsMap();
		printMenu();
		
		System.out.println("What item would you like to order?");
		String itemName = scan.nextLine();
		Double itemPrice = items.get(itemName);
		System.out.println("Adding " + itemName + " to cart at $" + itemPrice);
		
	}
	
	private static void fillItemsMap() {
		items.put("apple\t", .99);
		items.put("potato\t", 1.29);
		items.put("kiwi\t", 1.49);
		items.put("watermelon", 3.59);
		items.put("broccoli", 2.99);
		items.put("banana\t", .79);
		items.put("cucumber", 1.39);
		items.put("squash\t", 2.89);
	}
	private static void printMenu() {
		System.out.println("Item\tPrice");
		System.out.println("======================");
		
		   for (Map.Entry<String,Double> entry : items.entrySet()) 
	            System.out.println(entry.getKey() + "\t"
	                              + entry.getValue());
	}

	private static double averageItemCost() {
		//return itemPrices / itemsOrdered
		//set above equal to a String
		//print string under calling this in main method
		//will need to make a loop that does i++ to "itemsOrdered"
		
	

}
