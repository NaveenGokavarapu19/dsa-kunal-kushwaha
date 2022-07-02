import java.util.Scanner;
import java.lang.Math;


class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value of n: ");
        int sum_of_numbers = 0;
        int n = sc.nextInt();
        for (int i=0;i<=n;i++){
            sum_of_numbers = sum_of_numbers + i;
            
        }
        System.out.println(sum_of_numbers);
    }
}
