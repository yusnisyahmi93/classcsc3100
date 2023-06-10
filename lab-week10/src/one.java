

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class one {
	   public static void main(String[] args) {
	        // Create the input file
	       // createInputFile("StudentsData.txt");

	        // Read the contents of the input file and display the results
	    //    readInputFile("StudentsData.tx");
	    }

public static void createInputFile(String fileName) {
    try {
        // Create the file object
        File inputFile = new File(fileName);

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Create the file writer
        java.io.FileWriter fileWriter = new java.io.FileWriter(inputFile);

        // Write up to 15 student records to the file
        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter Matric No and Name for Student " + i + ":");
            String matricNo = scanner.next();
            String name = scanner.next();
            double[] testScores = new double[5];

            // Prompt for and read five test scores
            System.out.println("Enter five test scores for Student " + i + ":");
            for (int j = 0; j < 5; j++) {
                testScores[j] = scanner.nextDouble();
            }

            // Calculate the average test score
            double average = calculateAverage(testScores);

            // Calculate the corresponding grade
            String grade = calculateGrade(average);

            // Write the student record to the file
            fileWriter.write(matricNo + " " + name + " " + average + " " + grade + "\n");
        }

        // Close the file writer
        fileWriter.close();

        System.out.println("Input file created successfully.");

    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}

public static void readInputFile(String fileName) {
    try {
        // Create the file object
        File inputFile = new File(fileName);

        // Create a scanner to read the file
        Scanner scanner = new Scanner(inputFile);

        // Read and display each student record
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            String matricNo = parts[0];
            String name = parts[1];
            double average = Double.parseDouble(parts[2]);
            String grade = parts[3];

            System.out.println("Matric No: " + matricNo);
            System.out.println("Name: " + name);
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);
            System.out.println();
        }

        // Close the file scanner
        scanner.close();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}

public static double calculateAverage(double[] testScores) {
    double sum = 0;

    for (double score : testScores) {
        sum += score;
    }

    return sum / testScores.length;
}

public static String calculateGrade(double average) {
    if (average >= 90) {
        return "A";
    } else if (average >= 80) {
        return "B";
    } else if (average >= 70) {
        return "C";
    } else if (average >= 60) {
        return "D";
    } else {
        return "F";
    }
}
}