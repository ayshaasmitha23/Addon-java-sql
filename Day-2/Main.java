package day2;



import java.util.Scanner;



public class Main {



	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);



	        System.out.print("Enter a sentence: ");

	        String sentence = sc.nextLine();



	        

	        String[] words = sentence.trim().split("\\s+");

	        int wordCount = words.length;



	       

	        int charCount = 0;

	        for (char c : sentence.toCharArray()) {

	            if (c != ' ') charCount++;

	        }



	        

	        String reversed = new StringBuilder(sentence).reverse().toString();



	        

	        String longest = "";

	        for (String w : words) {

	            if (w.length() > longest.length()) {

	                longest = w;

	            }

	        }



	      

	        System.out.println("Word count: " + wordCount);

	        System.out.println("Character count: " + charCount);

	        System.out.println("Reversed string: " + reversed);

	        System.out.println("Longest word: " + longest);



	        sc.close();

	    }

	}

