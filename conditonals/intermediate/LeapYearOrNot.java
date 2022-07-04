package com.conditionals.intermediate;


import java.util.Scanner;
import java.lang.Math;

class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();
        if (Math.abs(year%400 == 0)){
            System.out.println("Is a leap year");
        }else if (year % 4 ==0 & year % 100 != 0){
            System.out.println("Is a leap year");
        }else{
            System.out.println("Is not a Leap year");
        }
    }
}
