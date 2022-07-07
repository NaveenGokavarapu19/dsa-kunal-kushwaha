package com.condtionals;


import java.util.Scanner;

class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = sc.nextDouble();
        double perimeter = 4 * a;
        System.out.printf("%.2f",perimeter); 
    }
}
