package day1;



import java.util.Scanner;



public class Main {

	    

	    public static String calculateGrade(int marks) {

	        if (marks >= 90) {

	            return "A";

	        } else if (marks >= 80) {

	            return "B";

	        } else if (marks >= 70) {

	            return "C";

	        } else if (marks >= 60) {

	            return "D";

	        } else {

	            return "F";

	        }

	    }



	    

	    public static void printResult(String studentName, int marks) {

	        String grade = calculateGrade(marks);

	        System.out.println("Student: " + studentName);

	        System.out.println("Marks: " + marks);

	        System.out.println("Grade: " + grade);

	    }



	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        

	        System.out.print("Enter student name: ");

	        String name = scanner.nextLine();

	        

	        System.out.print("Enter marks (0-100): ");

	        int marks = scanner.nextInt();

	        

	        if (marks < 0 || marks > 100) {

	            System.out.println("Invalid marks.");

	        } else {

	            

	            printResult(name, marks);

	        }



	        scanner.close();

	    }

	}