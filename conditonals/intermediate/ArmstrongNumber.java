package com.conditionals.Intermediate;


import java.util.Scanner;
import java.lang.Math;


class  ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value of n: ");
        int  n = sc.nextInt();
        double original = n;
        String n_string = Integer.toString(n);
        double power = n_string.length();
        double sum_of_numbers = 0;
        while (n >0){
            int rem = n%10;
            System.out.println(rem);
            double digit = Math.pow(rem,power);
            System.out.println(digit);
            sum_of_numbers = sum_of_numbers + digit;
            n = n/10;
        }
        if (original == sum_of_numbers){
            System.out.println("Is Armstrong");
        }else{
            System.out.println("Not Armstrong");     }
    }
}
