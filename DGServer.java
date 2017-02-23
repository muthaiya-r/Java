import java.net.*;
class DGServer
{
	public static void main(String args[]) throws Exception
	{
		DatagramSocket ds = new DatagramSocket();
		byte by[] = new byte[50];
		String s = "Welcome Client!";
		by = s.getBytes();
		DatagramPacket p = new DatagramPacket(by,by.length,InetAddress.getByName("localhost"),4446);
		ds.send(p);
	}
}
