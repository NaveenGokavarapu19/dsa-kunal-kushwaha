package com.conditonals;


import java.util.Scanner;

public class SumOfDigits
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input the number: ");
	    int number = sc.nextInt();
	    int sum_of_numbers = 0;
	    int r = 0;
	    while (number > 0){
	        r = number % 10;
	        sum_of_numbers = sum_of_numbers + r;
	        number = number / 10;
	        
	    }
	    System.out.println(sum_of_numbers);
	    }
}
