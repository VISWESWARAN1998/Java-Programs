//Author Visweswaran
/*
 *      Abstract class example
 *      conditions:
 *      (a) should not create an object for this type of class
 *      (b) Could be used only via inheritance
 *      (c) Should Override all abstract methods
 */

abstract class Electronics
{
	abstract void onstate();
}

class PC extends Electronics
{
	void onstate()
	{
		System.out.println("The PC will be turned on using Power on button");
	}
}

class Televison extends Electronics
{
	void onstate()
	{
		System.out.println("The Televison will be turned on by turning on the switch");
	}
}

public class Abstraction {
public static void main(String[] args) {
	PC obj = new PC();
	Televison obj1 = new Televison();
	obj.onstate();
	obj1.onstate();
	
}
}
