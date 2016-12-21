//Author Visweswaran
class First
{
	String title = "First One";
}

class Second extends First
{
	String title1 = "Second one";
}

class Third extends Second
{
	Third()
	{
		System.out.println(title);
		System.out.println(title1);
	}
}

public class Inheritance1 {
public static void main(String[] args) {
	@SuppressWarnings("unused")
	Third obj = new Third();
}
}
