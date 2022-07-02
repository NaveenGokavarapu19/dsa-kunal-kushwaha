package com.conditionals.intermediate;


import java.util.Scanner;
import java.lang.Math;


class AverageOfNumbersUntil0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        double number_of_subjects = 0;
        double average = 0;
        double total_marks = 0;
        while (flag){
            System.out.print("Input the marks of the subject or 0 to exit: ");
            double marks = sc.nextDouble();
            if(marks == 0){
                flag = false;
                break;
            }else{
                total_marks = marks + total_marks;
                number_of_subjects = number_of_subjects + 1;
            }
        }
        average = Math.abs(total_marks/number_of_subjects);
        System.out.printf("%.3f",average);
    }
}
