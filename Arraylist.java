// Author: Visweswaran

// An example for array list in Java

import java.util.*;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
