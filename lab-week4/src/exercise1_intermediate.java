import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise1_intermediate {

	public static void main(String[] args) {
		program();

	}
	
	public static void program (){
		
		double weight1,price1,weight2,price2 ;
		
		try {
		Scanner sc = new Scanner(System.in);	// Create Scanner object = sc 
		// Prompt the user to enter the weight and price of each package
		System.out.print("Enter weight and price for package 1: ");
		weight1 = sc.nextDouble();
		price1 = sc.nextDouble();
		//double price1 = sc.nextDouble();
		System.out.print("Enter weight and price for package 2: ");
		weight2 = sc.nextDouble();
		price2 = sc.nextDouble();

		if (price1 / weight1 < price2 / weight2)
			System.out.println("Package 1 has a better price.");
		else if (price1 / weight1 > price2 / weight2)
			System.out.println("Package 2 has a better price.");
		else
			System.out.println("Two packages have the same price.");
		
		sc.close();
		}
		catch (InputMismatchException e){
			System.out.println("Input is missmtach, please enter correct number");
			program();
		}
		
	}
}
