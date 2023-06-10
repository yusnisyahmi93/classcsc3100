import java.util.Scanner;

public class lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			program();
		}
public static void program() {
Scanner in = new Scanner(System.in);

try {
        System.out.println("Please Enter two characters: ");
        System.out.print("For example m1, c1, c2: ");
        String status = in.next();
        
        char major = Character.toUpperCase(status.charAt(0));
        char year = status.charAt(1);
        
        String courseName = "";
        String yearName = "";
        
        
        if (major == 'M' || major == 'I' || major == 'C')
        {
            switch(major)
            {
                case 'M':
                    courseName = "Mathematics";
                    break;
                case 'C':
                    courseName = "Computer Science";
                    break;
                case 'I':
                    courseName = "Information Technology";
                    break;
                default:
                    break;
            }
            
            switch(year)
            {
                case '1':
                    yearName = "Freshman";
                    break;
                case '2':
                    yearName = "Sophmore";
                    break;
                case '3':
                    yearName = "Junior";
                    break;
                case '4':
                    yearName = "Senior";
                    break;
                default:
                	yearName = "graduate";
                    break;
            }
            System.out.printf("%s %s%n", courseName, yearName);
        	}
         else{
            System.out.printf("Invalid input.%n");
            program();
          }
        }
        catch(StringIndexOutOfBoundsException e) {
        	 System.out.println("You enter only one number");
        	 program();
        }
    }
}
