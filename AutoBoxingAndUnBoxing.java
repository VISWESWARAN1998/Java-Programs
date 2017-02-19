// Author : Visweswaran
// The most simple example ever
public class AutoBoxingAndUnBoxing {
	public static void main(String[] args) {
		Integer value = new Integer(10); // AutoBoxing
		int val = value.intValue(); // UnBoxing
		
		System.out.println(val);
	}
}
