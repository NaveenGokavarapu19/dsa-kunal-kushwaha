import java.util.Scanner;

class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input l: ");
        double l = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();
        System.out.print("Input h: ");
        double h = sc.nextDouble();
        double volume = l * b * h;
        System.out.printf("%.2f",volume); 
    }
}
