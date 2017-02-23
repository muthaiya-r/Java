import java.io.*;
import java.net.*;
class Server
{
	ServerSocket serversoc=null;
	Socket soc=null;
	PrintWriter out=null;
	BufferedReader read=null;
	Server()
	{
		try
		{
			serversoc=new ServerSocket(4445);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		while(true)
		{
			try
			{
				System.out.println("Server is waiting for client");
				soc=serversoc.accept();
				read=new BufferedReader(new InputStreamReader(soc.getInputStream()));
				out=new PrintWriter(soc.getOutputStream(),true);
				out.println("Connection Accepted");
				out.println("Hi Client!");
				System.out.println("Client Says:" +read.readLine());
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String arg[])
	{
		new Server();
	}
}
