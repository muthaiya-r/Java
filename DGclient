import java.net.*;
class DGClient
{
	public static void main(String args[]) throws Exception
	{
		MulticastSocket ms = new MulticastSocket(4446);
		byte by[] = new byte[50];
		DatagramPacket p = new DatagramPacket(by,by.length);
		ms.receive(p);
		System.out.println("Server send: "+new String(p.getData()));
	}
}
