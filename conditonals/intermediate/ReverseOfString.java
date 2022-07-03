package com.conditionals.intermediate;

import java.util.Scanner;

class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the string: ");
        String inputted_string = sc.nextLine().trim();
        int high = inputted_string.length()-1;
        for (int i = high;i>=0;i--){
            System.out.print(inputted_string.charAt(i));
        }
    }
}
