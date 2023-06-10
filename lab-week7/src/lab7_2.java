
import java.util.Scanner;
public class lab7_2 {

// TODO Auto-generated method stub
 public static void main(String[] args) {
			    Scanner input = new Scanner(System.in);
			    System.out.print("Enter a letter grade: ");
				String s = input.nextLine();
				input.close();
			    char ch = s.charAt(0);
				ch = Character.toUpperCase(ch);

			    
			    if(ch >= 'A' && ch <= 'F' && ch != 'E')
				{
					System.out.print("The numeric value for grade " + ch + " is ");
					switch(ch)
					{
						case 'A': System.out.println(4); 
						break;
						case 'B': System.out.println(3);
						break;
						case 'C': System.out.println(2); 
						break;
						case 'D': System.out.println(1); 
						break;
						case 'F': System.out.println(0);
					}
				}
			    System.out.println(ch + " is an invalid grade");
			  }  
	}

