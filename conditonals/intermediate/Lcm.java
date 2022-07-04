package com.conditonals.intermediate;

import java.util.Scanner;


class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int min = a;
        int hcf = 0;
        if (b<min){
            b = min;
        }
        for (int i = min;i>0;i--){
            if(a%i==0 && b%i==0){
                hcf = i;
                break;
            }
        }
        int lcm = (a*b)/hcf;
        System.out.println(lcm); 
    }
}
