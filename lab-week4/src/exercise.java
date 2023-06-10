import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			BufferedReader in = new BufferedReader( 
			new InputStreamReader( 
			System.in)); 

			//declare setting input [0][1]
			String[] input = new String[2]; 
			
			double weight1,price1,weight2,price2 ;
			//double weight1; 
			//double price1; 
			//double weight2;
			//double price2;

			System.out.print("Enter weight and price for package 1: ");
			input = in.readLine().split(""); 

			weight1 = Double.parseDouble(input[0]); 
			price1 = Double.parseDouble(input[1]); 
			System.out.print("Enter weight and price for package 2: ");	
			input = in.readLine().split(" "); 
			weight2 = Double.parseDouble(input[0]); 
			price2 = Double.parseDouble(input[1]); 

			if (price1 / weight1 < price2 / weight2)
				System.out.println("Package 1 has a better price.");
			else if (price1 / weight1 > price2 / weight2)
				System.out.println("Package 2 has a better price.");
			else
				System.out.println("Two packages have the same price.");
			
	}

}
