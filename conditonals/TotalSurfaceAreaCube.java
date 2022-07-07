package com.conditonals;

import java.util.Scanner;
import java.lang.Math;

class TotalSurfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = sc.nextDouble();
        double temp = Math.pow(a,2);
        double total_surface_area = 6 * temp;
        System.out.printf("%.2f",total_surface_area);
    }
}
