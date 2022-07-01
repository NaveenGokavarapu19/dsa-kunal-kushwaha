package com.conditionals.intermediate;

import java.util.Scanner;
public class Comission
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the Net Sales: ");
	    double comission_rate = 0.05;
	    double net_sales = sc.nextDouble();
	    double comission = net_sales * comission_rate;
	    System.out.println(comission);
	}
}
