package com.conditonals.intermediate;


import java.util.Scanner;
import java.lang.Math;


class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int inputted_number = sc.nextInt();
        int original_number = inputted_number;
        int reversed_number = 0;
        while (inputted_number>0){
            int rem = inputted_number%10;
            reversed_number = reversed_number * 10 + rem;
            inputted_number= Math.abs(inputted_number/10);
        }
        if (original_number == reversed_number){
            System.out.println("Is a Palindrome");
        }else{
            System.out.println("Is not a Palindrome");
        }
    }
}
