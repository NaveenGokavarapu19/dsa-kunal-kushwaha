package com.conditonals.intermediate;

import java.util.Scanner;
import java.lang.Math;


class NumberOfCombinations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the n value: ");
        int n = sc.nextInt();
        System.out.print("Input the r value: ");
        int r = sc.nextInt();
        int fact1 = 1;
        int fact2 = 1;
        int fact3 = 1;
        int com = 0;
        
        for (int i = n;i>0;i--){
            fact1 = fact1 * i;
        }
        for (int j = n- r;j>0;j--){
            fact2 = fact2 * j;
        }
        for (int  k= r;k>0;k--){
            fact2 = fact2 * k;
        }
        com = Math.abs(fact1/(fact2*fact3));
        System.out.println(com);
    }
}
