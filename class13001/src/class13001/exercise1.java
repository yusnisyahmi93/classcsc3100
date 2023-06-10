package class13001;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
		A program reads the following information and prints a receipt of payment as shown below:
			a. Name, Price and Quantity for two types of items only (e.g. fish, egg, etc)
			b. Government tax (6% of subtotal)
			c. Service charge (10% of subtotal)
			*/
		Scanner sc = new Scanner(System.in);
		 
		String item1 = "";
		int quantity_item1 = 0 ;
		double price_item1 = 0 ;

		String item2 ="";
		int quantity_item2 = 0 ;
		double price_item2 = 0  ;
	
		
		
		
		System.out.print("Item 1 : ");
	    item1 = sc.nextLine();
		System.out.print("Quantity : ");
		quantity_item1 = sc.nextInt();
		System.out.print("unit price : ");
		price_item1 = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Item 2 : ");
		item2 = sc.nextLine();
		System.out.print("Quantity : ");
		quantity_item2 = sc.nextInt();
		System.out.print("unit price : ");
		price_item2 = sc.nextDouble();
		
		
		double government_tax = 0.70;
		double service_charge = 1.16;
		double total_price_item1 = quantity_item1*price_item1 ;
		double total_price_item2 = quantity_item2*price_item2 ;
		double subtotal = total_price_item1 + total_price_item2;
		double Total = subtotal + government_tax + service_charge;
	
		
	    System.out.println("Item 1 : " + item1);
	    System.out.println("Quantity : " + quantity_item1);
		System.out.println("Unit price: " + String.format("%.2f", price_item1));
		System.out.println("Amount : " + String.format("%.2f", total_price_item1));
		
		System.out.println("*************");

		System.out.println("Item 2 : " + item2);
		System.out.println("Quantity : " + quantity_item2);
		System.out.println("Unit price : " + String.format("%.2f", price_item2));
		System.out.println("Amount : " + String.format("%.2f", total_price_item2));
		
		
		System.out.println("Subtotal : " + String.format("%.2f", subtotal));
		System.out.println("Government tax : RM 0.70 ");
		System.out.println("Service Charge : RM 1.16");
		
		System.out.println("Total RM: " + String.format("%.2f", Total));
		
		
	}
}
