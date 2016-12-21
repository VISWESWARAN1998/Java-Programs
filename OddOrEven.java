//Author Visweswaran

/*
 *  Simple odd or even solution in JAVA
 */
import java.util.Scanner;
public class OddOrEven {
public static void main(String[] args) {
	int number; // The no which is yet to be found whether it is odd or even
	System.out.println("Odd or even program in Java"); // you may use print to avoid the new line
	Scanner obj = new Scanner(System.in);// we create a new Scanner object so that we can get the input
	System.out.println("Enter the no: ");
	number = obj.nextInt(); //getting integer as an input
	if(number%2==0)System.out.println("It is an even number"); // % returns remainder while / returns the quotient
	else System.out.println("It is an odd number");
	}
}
