package com.conditionals.intermediate;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the value of n: ");
	    double sum_of_numbers = 0;
	    double n = sc.nextDouble();
	    double avg = 0;
	    
	    for (double i = 0;i<=n;i++){
	        sum_of_numbers = sum_of_numbers + i;
	        
	    }
	    avg = sum_of_numbers / n;
	    System.out.println(avg);
	}
}
