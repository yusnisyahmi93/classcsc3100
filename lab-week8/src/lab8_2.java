import java.util.Scanner;

public class lab8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Imagine you are developing a system that requires user to enter any string. Your system
		//will display menu with several manipulating string options, as follows:
		
		//• A character at a specified index.
		/*
		o Ask user to enter any index, and displayed the character if the index is valid.
		• Compare the string with a new string.
		*/
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String str = sc.nextLine();
		        System.out.print("Enter the index of the character to display: ");
		        int index = sc.nextInt();
		        if (index >= 0 && index < str.length()) {
		            System.out.println("The character at index " + index + " is: " + str.charAt(index));
		        } else {
		            System.out.println("Invalid index");
		                System.out.println("The strings are equal");
		        }
		        
		        /*
		        o Ask user to enter a new string and display true if they are equal.
				• Identify how many characters in the string.
				• Count the number of letters in the string.
				• Count the number of digits in the string.*/
		    	
		        System.out.print("Enter a string: ");
		        String str2 = sc.next();
		        
		        System.out.print("Enter a new string to compare: ");
		        String newStr = sc.next();
		        if (str2.equals(newStr)) {
		        	System.out.println("The strings are equal");
		        } else {
		        		System.out.println("The strings are not equal");
		        }
		        
		        System.out.println("The string has " + str2.length() + " characters");
		        
		        System.out.print("Enter a string: ");
		        String str3 = sc.next();
		        int letters = 0;
		        for (int i = 0; i < str3.length(); i++) {
		            if (Character.isLetter(str3.charAt(i))) {
		                letters++;
		            }
		        }
		        System.out.println("The string has " + letters + " letters");
		        int digits = 0;
		        for (int i = 0; i < str3.length(); i++) {
		            if (Character.isDigit(str3.charAt(i))) {
		                digits++;
		            }
		        }
		        System.out.println("The string has " + digits + " digits");
		        
		        System.out.print("Enter a string: ");
		        String str4 = sc.next();
		        StringBuilder newStr2 = new StringBuilder();
		        for (int i = 0; i < str4.length(); i++) {
		            char c = str4.charAt(i);
		            if (Character.isLowerCase(c)) {
		                newStr2.append(Character.toUpperCase(c));
		            } else if (Character.isUpperCase(c)) {
		                newStr2.append(Character.toLowerCase(c));
		            } else {
		                newStr2.append(c);
		            }
		        }
		        System.out.println("The new string is: " + newStr2.toString());
		        /*
		         

				• Change any lowercase letter into uppercase letter and vice versa.
				• Replace any character in the string with a new character.
				o Ask user to enter any new character and any character in the string.
				• Delete any character or substring in the string.
				o Ask user to enter any character or substring to delete, and display the new string
				after delete operation.*/

		            
		/*• Insert any character or string into the string.
		o Ask user to enter any new character or string, and display after insertion.
		Display the output for each task.*/
    		
		 }
	}

