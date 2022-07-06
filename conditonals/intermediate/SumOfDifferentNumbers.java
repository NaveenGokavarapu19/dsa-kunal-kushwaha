package com.conditonals.intermediate;


import java.util.Scanner;


class SumOfDifferentNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum_of_positive_even_numbers = 0;
        int sum_of_positive_odd_numbers = 0;
        int sum_of_negative_numbers = 0;
        boolean flag = true;
        while (flag == true){
            System.out.print("Input the number: ");
            int n = sc.nextInt();
            if (n == 0){
                flag = false;
                break;
            }else if (n< 0){
                sum_of_negative_numbers = sum_of_negative_numbers + n;
            }else if (n > 0 && n%2== 0){
                sum_of_positive_even_numbers = sum_of_positive_even_numbers + n;
            }else if (n> 0 && n % 2 == 1){
                sum_of_positive_odd_numbers = sum_of_positive_odd_numbers + n;
            }else{
                continue;
            }
                
            }
            System.out.println(sum_of_negative_numbers + " " + sum_of_positive_even_numbers + " " + sum_of_positive_odd_numbers); 
            }
        }
