import  java.lang.Math;
import java.util.Scanner;

public class CompoundInterest
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input the principal: ");
	    double p = sc.nextDouble();
	    System.out.print("Input the rate percentage per annum: ");
	    double r = sc.nextDouble()/100;
	    System.out.print("Input the number of years: ");
	    double t = sc.nextDouble();
	    double amount = 0;
	    double rate = 0;
	    double ci = 0;
	    
	    double temp = Math.abs(1 + r);
	    rate = Math.pow(temp,t);
	    amount = p * rate;
	    ci = amount - p;
		System.out.printf("%.2f",ci);
	}
}
