package com.conditonals;

import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input b: " );
        double b = sc.nextDouble();
        System.out.print("Input h: ");
        double h = sc.nextDouble();
        double area = 0.5*b*h;
        System.out.println(area); 
    }
}
