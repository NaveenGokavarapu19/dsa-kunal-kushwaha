package com.conditonals;

import java.util.Scanner;
import java.lang.Math;



class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input r: ");
        double r = sc.nextDouble();
        System.out.print("Input h: ");
        double h = sc.nextDouble();
        double pi = Math.PI;
        double temp = Math.pow(r,2);
        double volume = pi * temp * h;
        System.out.printf("%.2f",volume); 
    }
}
