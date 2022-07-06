import java.util.Scanner;
import java.lang.Math;

class AreaOfTEquilateralriangle {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: " );
        double a = sc.nextDouble();
        double root_three = Math.pow(3,0.5);
        double multiplier = root_three/4;
        double square_a = Math.pow(a,2);
        double area = multiplier * square_a;
        System.out.printf("%.2f",area); 
    }
}
