package com.conditionals.intermediate;

import java.util.Scanner;
import java.lang.Math;

class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of hits: ");
        double number_of_hits = sc.nextDouble();
        System.out.print("Input the number of balls: ");
        double number_of_balls = sc.nextDouble();
        double batting_average = Math.abs(number_of_hits/number_of_balls);
        System.out.printf("%.3f " + "\n",batting_average);
    }
}
