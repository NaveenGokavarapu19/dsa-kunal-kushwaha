package com.conditonals;


import java.util.Scanner;


class VolumeOf Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the l: ");
        double l = sc.nextDouble();
        System.out.print("Input the b: ");
        double b = sc.nextDouble();
        System.out.print("Input the h: ");
        double h = sc.nextDouble();
        double volume = l*b*h/3;
        System.out.printf("%.2f",volume); 
    }
}
