package com.conditonals;

import java.util.Scanner;
import java.lang.Math;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input r: ");
        double r = sc.nextDouble();
        double pi = Math.PI;
        double perimeter = 2 * pi * r;
        System.out.printf("%.2f",perimeter); 
    }
}
