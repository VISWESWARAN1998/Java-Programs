//Author Visweswaran
class Patterns {
public static void main(String[] args) {
	System.out.println("Straight stars");
	for(int i=0;i<50;i++)System.out.print("*");
	System.out.println();
	System.out.println("Vertical Starts");
	for(int i=0;i<10;i++)System.out.println("*");
	System.out.println("Implementing box");
	for(int i=0;i<10;i++)System.out.print("*");
	System.out.println();
	for(int i=0;i<10;i++)System.out.println("*\t *");
	for(int i=0;i<10;i++)System.out.print("*");
	System.out.println();
	System.out.println("Mountain implementation");
	int count=0;
	while(count!=100)
	{
		count++;
		for(int i=0;i<count;i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
