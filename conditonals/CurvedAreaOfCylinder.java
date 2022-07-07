package com.conditonals;

import java.util.Scanner;
import java.lang.Math;


class CurvedAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the r: ");
        double r = sc.nextDouble();
        System.out.print("Input the h: ");
        double h = sc.nextDouble();
        double pi = Math.PI;
        double curved_surface_area=  2 * pi * r * (r+h);
        System.out.printf("%.2f",curved_surface_area); 
    }
}
