import java.util.InputMismatchException;
import java.util.Scanner;
public class lab8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program();
		
	}
	
	
public static void program() {	
try {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("1. A character at a specified index");
        System.out.println("2. Compare the string with a new string");
        System.out.println("3. Identify how many characters in the string");
        System.out.println("4. Count the number of letters in the string");
        System.out.println("5. Count the number of digits in the string");
        System.out.println("6. Change any lowercase letter into uppercase letter and vice versa");
        System.out.println("7. Replace any character in the string with a new character");
        System.out.println("8. Delete any character or substring in the string");
        System.out.println("9. Insert any character or string into the string");
        System.out.print("Enter a choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter an index: ");
                int index = scanner.nextInt();
                if (index >= 0 && index < str.length()) {
                    System.out.println("Character at index " + index + ": " + str.charAt(index));
                } else {
                    System.out.println("Invalid index!");
                }
                break;
            case 2:
                System.out.print("Enter a new string: ");
                String newStr = scanner.next();
                boolean isEqual = str.equals(newStr);
                System.out.println(isEqual);
                break;
            case 3:
                System.out.println("Length of the string: " + str.length());
                break;
            case 4:
                int letterCount = 0;
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (Character.isLetter(c)) {
                        letterCount++;
                    }
                }
                System.out.println("Number of letters in the string: " + letterCount);
                break;
            case 5:
                int digitCount = 0;
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (Character.isDigit(c)) {
                        digitCount++;
                    }
                }
                System.out.println("Number of digits in the string: " + digitCount);
                break;
            case 6:
                StringBuilder sb = new StringBuilder(str);
                for (int i = 0; i < sb.length(); i++) {
                    char c = sb.charAt(i);
                    if (Character.isUpperCase(c)) {
                        sb.setCharAt(i, Character.toLowerCase(c));
                    } else if (Character.isLowerCase(c)) {
                        sb.setCharAt(i, Character.toUpperCase(c));
                    }
                }
                System.out.println("String after case change: " + sb.toString());
                break;
            case 7:
                System.out.print("Enter the character to replace: ");
                char oldChar = scanner.next().charAt(0);
                System.out.print("Enter the new character: ");
                char newChar = scanner.next().charAt(0);
                str = str.replace(oldChar, newChar);
                System.out.println("String after replacement: " + str);
                break;
            case 8:
                System.out.print("Enter the substring to delete: ");
                String substringToDelete = scanner.next();
                str = str.replace(substringToDelete, "");
                System.out.println("String after deletion: " + str);
                break;
            case 9:
                //System.out.println("Enter the character or string to insert");
                //String originalString = scanner.next();
                System.out.println("Enter a character or substring to delete: ");
                String deleteString = scanner.next();
                String newString = str.replace(deleteString, "");
                break;
            default:System.out.println("Please choose option 1 unitl 9 after enter string: ");
            		program();
            	break;
            
	}
	}catch(InputMismatchException e) {
		 System.out.println("You enter wrong");
		 program();
	}
 }
}
