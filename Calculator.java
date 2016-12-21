// Author: Visweswaran
import java.util.Scanner;
class Addition
{
	int no1,no2;
	void set(int x,int x1)
	{
		no1 = x;
		no2 = x1;
	}
	int return_addition()
	{
		return no1+no2;
	}
}

class Subtraction
{
	int no1,no2;
	void set(int x,int x1)
	{
		no1 = x;
		no2 = x1;
	}
	int return_subtraction()
	{
		return no1-no2;
	}
}

// we have used double here for better precision
class Division
{
	double no1,no2;
	void set(int x,int x1)
	{
		no1 = x;
		no2 = x1;
	}
	double return_division()
	{
		return no1/no2;
	}
}

class Multiplication
{
	int no1,no2;
	void set(int x,int x1)
	{
		no1 = x;
		no2 = x1;
	}
	int return_multiplication()
	{
		return no1*no2;
	}
}
public class Calculator {
public static void main(String[] args) {
	int select;
	int no1,no2;
	System.out.println("Enter the choice");
	System.out.println("1 for addition");
	System.out.println("2 for subtratcion");
	System.out.println("3 for division");
	System.out.println("4 for multiplication");
	Scanner obj = new Scanner(System.in);
	select = obj.nextInt();
	switch(select)
	{
	case 1:
		Addition add = new Addition();
		System.out.println("Enter the no 1");
		no1 = obj.nextInt();
		System.out.println("Enter the nom 2");
		no2 = obj.nextInt();
		add.set(no1, no2);
		System.out.println("Addition of two numbers is "+add.return_addition());
		break;
	case 2:
		Subtraction sub = new Subtraction();
		System.out.println("Enter the no 1");
		no1 = obj.nextInt();
		System.out.println("Enter the nom 2");
		no2 = obj.nextInt();
		sub.set(no1, no2);
		System.out.println("Subtraction of two numbers is "+sub.return_subtraction());
		break;
	case 3:
		Division div = new Division();
		System.out.println("Enter the no 1");
		no1 = obj.nextInt();
		System.out.println("Enter the nom 2");
		no2 = obj.nextInt();
		div.set(no1, no2);
		System.out.println("Division of two numbers is "+div.return_division());
		break;
	case 4:
		Multiplication mul = new Multiplication();
		System.out.println("Enter the no 1");
		no1 = obj.nextInt();
		System.out.println("Enter the nom 2");
		no2 = obj.nextInt();
		mul.set(no1, no2);
		System.out.println("Division of two numbers is "+mul.return_multiplication());
		break;
	default:
		System.out.println("Wrong choice");
	}
}
}
