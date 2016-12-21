//Author Visweswaran
import java.util.Scanner;
class circle
{
	double area;
	void set_radius(double r)
	{
		area = 3.14*r*r;
	}
	double return_area()
	{
		return area;
	}
}


public class AreaOfCircle {
public static void main(String[] args) {
	System.out.println("Area of circle using Java");
	Scanner obj = new Scanner(System.in);
	double radius;
	System.out.println("Enter the radius of the circle");
	radius = obj.nextDouble();
	circle area = new circle();
	area.set_radius(radius);
	System.out.println("The area of the circle is "+area.return_area());
}
}
