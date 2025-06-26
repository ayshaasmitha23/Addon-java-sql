package day1;



import java.util.Scanner;



public class Task4 {

	public void leap(int year) {

	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

        System.out.println(year + " is a leap year.");

    } else {

        System.out.println(year + " is not a leap year.");

    }

	}

	

	    public static void main(String[] args) {

	    	Task4 obj= new Task4();

	 

	        Scanner scanner = new Scanner(System.in);

	        

	        System.out.print("Enter a year: ");

	        int year = scanner.nextInt();

	        obj.leap(year);



	        scanner.close();

	



}

}