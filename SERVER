import java.io.*;
import java.net.*;
class Client
{
	Socket soc=null;
	PrintWriter out=null;
	BufferedReader read=null;
	Client()
	{
		try
		{
			soc=new Socket("localhost",4445);
			read=new BufferedReader(new InputStreamReader(soc.getInputStream()));
			out=new PrintWriter(soc.getOutputStream(),true);
			System.out.println(read.readLine());
			System.out.println("Server says: "+read.readLine());
			out.println("Hello Server");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String arg[])
	{
		new Client();
	}
}
