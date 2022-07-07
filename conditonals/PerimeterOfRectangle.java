import java.util.Scanner;


class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input l: ");
        double l = sc.nextDouble();;
        System.out.print("Input b: ");
        double b = sc.nextDouble();        
        double perimeter = 2 * (l+b);
        System.out.printf("%.2f",perimeter); 
    }
}
