package com.conditonals;

import java.util.Scanner;

public class ProductOfDigits
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input the number: ");
	    int number = sc.nextInt();
	    int product_of_numbers = 1;
	    int r = 1;
	    while (number > 0){
	        r = number % 10;
	        product_of_numbers = product_of_numbers * r;
	        number = number / 10;
	        
	    }
	    System.out.println(product_of_numbers);
	    }
}
