import java.util.Scanner;

public class two {
	  static double miles, kilometer;
	  static double meter, feet;
	  static Scanner scan = new Scanner(System.in);
      static char answer;
	  public static void main (String[] args) {
		do {	
		 System.out.println ("Choose from the menu below:");
		 System.out.println ("1: convert mile to kilometer:");
		 System.out.println ("2: convert meter to feet:");
		 int choice = scan.nextInt();
		 switch(choice){
		 		case 1:
		 		miles = readMile();	
		 		kilometer = calcKilometer(miles);
		 		displayKM(miles,kilometer);
		 		break;
		 		case 2:
		 		meter = readMeter();	
		 		feet = calcFeet(meter);
		 		displayFeet(meter,feet);
		 		break;
		 }
		 System.out.println("Continue(Y/N)");
		   answer = scan.next().charAt(0);
		 }while(answer =='Y'|| answer =='y');
		scan.close();
	  }
	  
	  public static double readMile(){
		    System.out.print("Enter mile: ");
		    double miles = scan.nextDouble();
		    return miles;
		  }
		  public static double calcKilometer(double miles) {
			return kilometer = 1.6 * miles;
		  }
		  public static void displayKM(double miles, double kilometer){
		    System.out.println ( miles + " miles is Kilometer = " +String.format("%.2f",kilometer));
		  }
		  public static double readMeter(){
			    System.out.print("Enter feet: ");
			    double meter = scan.nextDouble();
			    return meter;
			  }
			  public static double calcFeet(double meter) {
				return feet = 3.2786 * meter;
			  }
			  public static void displayFeet(double meter, double feet){
			    System.out.println ( meter + " meter is Feet = " + (feet));
			  }

}