// Author : Visweswaran
// String Buffer example in Java
public class StringBufferExample {
	public static void main(String[] args) {
	StringBuffer buffer = new StringBuffer();
	buffer.append("This is a value to be appended to the String Buffer");
	buffer.append("\nThis is another value to be appended to the string Buffer");
	System.out.println("Working status of a String Buffer:\n"+buffer);
	buffer.insert(0, "JAVA ");
	System.out.println("JAVA inserted @ 0: "+buffer);
	}
}
