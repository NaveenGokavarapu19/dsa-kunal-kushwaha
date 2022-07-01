package com.conditionals.intermediate;


import java.lang.Math;
import java.util.Scanner;

class Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        double sum_of_subjects = 0;
        double number_of_subjects = 0;
        double cgpa = 0;
        while (flag){
            System.out.print("Input the marks of the subject or enter zero to exit: ");
            double marks = sc.nextDouble();
            if (marks == 0){
                flag = false;
                break;
            }else{
                sum_of_subjects = sum_of_subjects + marks;
                number_of_subjects = number_of_subjects + 1;
            }
        }
        double avg = sum_of_subjects / number_of_subjects;
        cgpa = Math.abs(avg) * 9.5;
        System.out.printf("%.2f",cgpa);
        
        
    }
}
