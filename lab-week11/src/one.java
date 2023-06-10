import java.util.Scanner;
public class one {
	static double num1, num2, num3;
	
	public static void main (String[] args) {
		
		readInput();
		double average = calcAverage(num1, num2, num3);
		printOutput(average);
	}	
		public static void readInput(){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the first number:");
			num1 = sc.nextDouble();
			
			System.out.println("Enter the second number:");
			num2 = sc.nextDouble();
			
			System.out.println("Enter the third number:");
			num3 = sc.nextDouble();
			
	
		
		}
		
		public static double calcAverage(double num1, double num2, double num3) {
			return (num1 + num2 + num3)/3;
		}

		public static void printOutput(double average) {
			System.out.println("The average of the three numbers are " + String.format("%.2f",average));
			
			
		}
}