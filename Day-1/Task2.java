package day1;



import java.util.Scanner;



public class Task2 {



	    public static void main(String[] args) {

	    	

	        Scanner scanner = new Scanner(System.in);

	        

	        System.out.print("Enter principal amount: ");

	        

	        double principal = scanner.nextDouble();

	        

	        System.out.print("Enter rate of interest (in %): ");

	        

	        double rate = scanner.nextDouble();

	        

	        System.out.print("Enter time period (in years): ");

	        

	        double time = scanner.nextDouble();

	        

	        double simpleInterest = (principal * rate * time) / 100;

	        

	        System.out.println("Simple Interest = " + simpleInterest);



	        scanner.close();

	    

	}



}

