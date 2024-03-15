package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub;
		
		DatagramSocket server = new DatagramSocket(4223);
		byte[] buf = new byte[256];
		
		DatagramPacket packet = new DatagramPacket	(buf,buf.length);
		server.receive(packet);
		
		String message = new String(packet.getData());
		
		System.out.println("Message is: "+ message);
	
		server.close();

	}

}
