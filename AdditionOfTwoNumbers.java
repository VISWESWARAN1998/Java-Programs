//Author Visweswaran
import java.util.Scanner;

class AdditionOfTwoNumbers {
public static void main(String[] args) {
	System.out.println("Addition of two numbers in Java");
	for(int i=0;i<40;i++)System.out.print("*");
	System.out.println();
	Scanner obj = new Scanner(System.in);
	int no1,no2;
	System.out.println("Enter the number 1");
	no1 = obj.nextInt();
	System.out.println("Enter the number 2");
	no2 = obj.nextInt();
	System.out.println("The addition of two numbers is "+(no1+no2));
}
}
