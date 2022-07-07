import java.util.Scanner;
import java.lang.Math;


class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the r: ");
        double r = sc.nextDouble();
        double pi = Math.PI;
        double temp = Math.pow(r,3);
        double volume = (4* pi*temp)/3;
        System.out.printf("%.2f",volume); 
    }
}
