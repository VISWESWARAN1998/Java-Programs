// Author: Visweswaran
import java.util.Scanner;
import java.net.*;
public class NetWorking1 {
public static void main(String[] args) {
	try {
		String url;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the name of the website name");
		url = obj.nextLine();
		URL current_url = new URL(url);
		System.out.println("Protocol: "+current_url.getProtocol());
		System.out.println("Port: "+current_url.getPort());
		System.out.println("Host: "+current_url.getHost());
		System.out.println("Authority: "+current_url.getAuthority());
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		System.out.println("Enter the full doman name please!\nBelow are the stack trace of the exceptiona have a look at it");
		e.printStackTrace();
	}
	
}
}
