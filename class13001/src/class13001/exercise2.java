package class13001;

import java.util.Scanner;

public class exercise2 {
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
	 
		double first_test = 0;
		double second_test = 0;
	
		double assingment_1 = 0;
		double assingment_2 = 0;
		double assingment_3 = 0;
		double Final_exam=0;
	
	
		
		System.out.print("first_test : ");
		first_test = sc.nextDouble();
		System.out.print("second_test : ");
		second_test = sc.nextDouble();
		System.out.print("Assingment 1 : ");
		assingment_1 = sc.nextDouble();
		System.out.print("Assingment 2 : ");
		assingment_2 = sc.nextDouble();
		System.out.print("Assingment 3 : ");
		assingment_3 = sc.nextDouble();
		System.out.print("Final examination : ");
		Final_exam= sc.nextDouble();
		sc.nextLine();
		
		double total_first_test = first_test/50*0.2;
		double total__second_test= second_test/50*0.2;
		double total_assignment = (assingment_1 + assingment_2 + assingment_3)/ (90*0.3) ;
		double total_final_exam = Final_exam/100*0.3;
		double total = total_first_test +total__second_test+total_assignment +total_final_exam;
		
		
		System.out.println("final examination : " + String.format("%.1f", total));
	}
}