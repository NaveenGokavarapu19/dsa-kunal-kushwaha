package com.conditionals;

import java.util.Scanner;

public class SumOfNumberUntilZero
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int sum = 0;
	    boolean flag = true;
	    while (flag){
	        System.out.print("Enter the number: ");
	        int number = sc.nextInt();
	        if (number == 0){
	            flag = false;
	            break;
	        }else{
	            sum = sum + number;
	        }
	        
	    }
	    System.out.println(sum);
	    
	}
}
