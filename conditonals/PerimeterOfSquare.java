import java.util.Scanner;
import java.lang.Math;


class  PerimeterOfSquare{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: " );
        double a = sc.nextDouble();
        double area = Math.pow(a,2);
        System.out.printf("%.2f",area); 
    }
}
