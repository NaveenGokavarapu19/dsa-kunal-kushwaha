package com.conditionals.intermediate;

import java.util.Scanner;

class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = sc.next().trim().charAt(0);
        
        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            System.out.println("Is a vowel"); 
        }else if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
            System.out.println("Is a vowel"); 
        }else{
            System.out.println("Is not a vowel"); 
        }
        }
    }
