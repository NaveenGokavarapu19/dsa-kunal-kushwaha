

import java.util.Scanner;


public class MaxOfNumberInput
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxi = 0;
		boolean flag = true;
		while (flag){
		    System.out.print("Enter a number: ");
		    int number = sc.nextInt();
		    if (number == 0){
		        flag = false;
		        break;
		    }
		    if (number > maxi){
		        maxi = number;
		    }
		}
		System.out.println(maxi);
	}
	
}
