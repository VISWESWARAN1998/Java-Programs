// Author : Visweswaran
import java.net.*;
import java.io.*;

class Server 
{
public static void main(String[] args) {
	ServerSocket server = null;
	try
	{
		// Open the port no-666
		server = new ServerSocket(666);
		Socket socket = server.accept();
		System.out.println("Connection receiverd @ "+socket.getLocalPort()+" from"+socket.getRemoteSocketAddress());
		// Client initiates the communication between the sockets
		DataInputStream input = new DataInputStream(socket.getInputStream());
		System.out.println(input.readUTF());
		// Now server will send the connection
		DataOutputStream output = new DataOutputStream(socket.getOutputStream());
		output.writeUTF("Connected!");
		socket.close();
		server.close();
	}
	catch(IOException e)
	{
		
	}
}
}
