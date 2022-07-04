import java.util.Scanner;
import java.lang.Math;

class IsPerfectOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int number = sc.nextInt();
        int sum_of_divisors = 0;
        for (int i = 1;i<number;i++){
            if(number%i==0){
                sum_of_divisors = sum_of_divisors + i;
            }else{
                continue;
            }
        }
        if (Math.abs(sum_of_divisors) == number){
                System.out.println("Is a Perfect"); 
        }else{
                System.out.println("Not a Perfect");
        }
            
        }
    }
