package com.conditionals.intermediate;

import java.util.Scanner;

public class DiscountOfItem
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the value of List Price: ");
	    int list_price = sc.nextInt();
	    System.out.print("Enter the value of Selling Price: ");
	    int selling_price = sc.nextInt();
	    int discount = list_price - selling_price;
	    System.out.println(discount);
	}
}
