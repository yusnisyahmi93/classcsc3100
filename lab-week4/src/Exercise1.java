
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		(Financial: compare costs) Suppose you shop for rice in two different packages.
		You would like to write a program to compare the cost. The program prompts the
		user to enter the weight and price of the each package and displays the one with
		the better price.
		*/
		
		double weight1,price1,weight2,price2 ;
		
	
		Scanner sc = new Scanner(System.in);	// Create Scanner object = sc 
		// Prompt the user to enter the weight and price of each package
		System.out.print("Enter weight and price for package 1: ");
		weight1 = sc.nextDouble();
		price1 = sc.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		weight2 = sc.nextDouble();
		price2 = sc.nextDouble();

		if (price1 / weight1 < price2 / weight2) //condition first (proses 1)
			System.out.println("Package 1 has a better price.");
		else if (price1 / weight1 > price2 / weight2) //condition ke-2 (proses 2)
			System.out.println("Package 2 has a better price.");
		else				//condition ke-3 (proses 3)
			System.out.println("Two packages have the same price.");
		
		sc.close();

	
	
	}

}
