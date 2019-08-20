package primeNumbers;

import java.util.Scanner;

//Write a program, which:
//Reads two numbers from the console
//Prints the prime number in that range

	public class PrimeNumbers {
	    public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       int num1 = Integer.parseInt(scanner.nextLine());
	       int num2 = Integer.parseInt(scanner.nextLine());
	       for (int i = num1; i <= num2; i++){
	           int nr = 0;
	           for(int j = 2; j < i ; j++ ){
	               if(i % j == 0 ){
	                   nr++;
	               }
	           }
	             if(nr == 0 ){
	                 System.out.printf("%d ", i);
	             }  
	           
	       }
	    }
	}
