package com.conditionals.intermediate;

import java.util.Scanner;


public class ElectricityBill
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input the wattage consumed per hour: ");
	    int wattage = sc.nextInt();
	    int consumption = wattage * 720;
	    int total_consumption = consumption / 1000;
	    int total_cost = total_consumption * 9;
	    System.out.println(total_cost);
	    
	}
}
