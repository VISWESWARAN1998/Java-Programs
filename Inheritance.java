//Author Visweswaran
class SingleInheritance
{
	String name = "Single Inheritance Example has been found to be working";
}

class TestInheritance extends SingleInheritance
{
	TestInheritance()
	{
		System.out.println(name);
	}
}

public class Inheritance {
public static void main(String[] args) {
	@SuppressWarnings("unused")
	TestInheritance obj = new TestInheritance();
}
}
