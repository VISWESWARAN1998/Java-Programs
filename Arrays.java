// Author Visweswaran
import java.util.Scanner;
public class Arrays {
public static void main(String[] args) {
	System.out.println("Static allcoation of memory in arrays");
	System.out.println("Arrays has been created");
	int array[] = new int[10];
	System.out.println("Adding values to the arrays");
	for(int i=0;i<10;i++)array[i]=i;
	System.out.println("Added values to the arrays");
	System.out.println("Displaying the values");
	for(int i=0;i<10;i++)System.out.println(array[i]);
	System.out.println();
	System.out.println("Dynamic allocation of arrays");
	Scanner obj = new Scanner(System.in);
	int allocate;
	System.out.println("How many values you want to allocate to dynamic array");
	allocate = obj.nextInt();
	int d_array[] = new int[allocate];
	System.out.println("Array has been created and the memory has been allocated successfully");
	System.out.println("Adding values to the arrays");
	for(int i=0;i<allocate;i++)d_array[i]=i;
	System.out.println("Added values to the arrays");
	System.out.println("Displaying the values");
	for(int i=0;i<allocate;i++)System.out.println(d_array[i]);
}
}
