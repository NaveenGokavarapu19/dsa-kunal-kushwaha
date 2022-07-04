package com.conditonals.intermediate;

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int number = sc.nextInt();
        int sum_of_digits = 0;
        while (number > 0){
            int rem = number % 10;
            sum_of_digits = sum_of_digits + rem;
            number = number / 10;
        }
        System.out.println(sum_of_digits); 
    }
}
