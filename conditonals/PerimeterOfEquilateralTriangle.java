package com.conditionals;

import java.util.Scanner;


class  PerimeterOfEquilateralTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = sc.nextDouble();
        double perimeter = 3 * a;
        System.out.printf("%.2f",perimeter); 
    }
}
