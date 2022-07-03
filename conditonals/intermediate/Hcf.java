package com.conditionals.intermediate;


import java.util.Scanner;


class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = sc.nextInt();
        System.out.print("Input the second number: ");
        int b = sc.nextInt();
        int hcf = 1;
        int min = a;
        if (b<min){
            b = min;
        }
        for (int i = min;i>0;i--){
            if (a%i==0 && b%i==0){
                hcf = i;
                break;
            }
        }
        System.out.println(hcf);
    }
}
