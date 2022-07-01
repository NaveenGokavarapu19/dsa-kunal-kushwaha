package com.conditionals.intermediate;

import java.lang.Math;
import java.util.Scanner;

public class PowerOfNumber
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input the number: ");
	    double number = sc.nextDouble();
	    System.out.print("Input the power: ");
	    double power = sc.nextDouble();
	    double result = 1;
	    for (double i = 1;i<=number;i++){
	        result = result * number;
	    }
	    System.out.println(result);
	    double to_compare_result = Math.abs(Math.pow(number,power));
	    if (result == to_compare_result){
	        System.out.println("The Program is correct");
	        
	    }else{
	        System.out.println("The Program is incorrect");
	    }
	    
	}
}
