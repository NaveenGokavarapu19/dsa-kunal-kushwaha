package com.conditionals;

import java.util.Scanner;
public class FactorsOfNumbers
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input the number: ");
	    int number = sc.nextInt();
	    for (int i = 2;i<number;i++){
	        if (number%i==0){
	            System.out.println(i);
	        }else{
	            continue;
	        }
	    }
	}
}
