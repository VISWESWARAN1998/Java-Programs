//Author: Visweswaran
import java.net.*;
import java.io.*;

public class PageSource {
public static void main(String[] args) throws IOException {
	try
	{
		URL url = new URL("https://www.youtube.com");
		BufferedReader readUrl = new BufferedReader(new InputStreamReader(url.openStream()));
		String read;
		while((read=readUrl.readLine())!=null)System.out.println(read);
		readUrl.close();
	}
	catch(MalformedURLException e)
	{
		e.printStackTrace();
	}
}
}
