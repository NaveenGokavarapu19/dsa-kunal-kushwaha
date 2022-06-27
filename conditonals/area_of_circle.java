package com.conditonals;

import java.util.Scanner;

public class AreaOfCircle
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("input r: ");
	    double area = 0;
	    double r = sc.nextDouble();
	    area = 3.14 * r * r;
	    System.out.println(area);
	}
}
