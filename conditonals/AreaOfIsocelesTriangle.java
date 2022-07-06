package com.conditionals;

import java.util.Scanner;

class AreaOfIsocelesTriangle {
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
