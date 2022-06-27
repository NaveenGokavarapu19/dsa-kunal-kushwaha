import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int n = 5;
	    int a = 0;
	    int b = 1;
	    int fib_sum = 0;
	    for( int i=0;i<=n;i++){
	        fib_sum = a + b;
	        a = b;
	        b = fib_sum;
	    }
	    System.out.println(fib_sum);

}

}
