package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket client = new DatagramSocket();
		InetAddress ipAddress = InetAddress.getLocalHost();// if it two computer need to give other computer ipaddress
		String str = "Hello World";
		byte[] buf = str.getBytes();
		
		DatagramPacket pac = new DatagramPacket(buf,buf.length,ipAddress,4223);
		client.send(pac);
		client.close();
	}
}
