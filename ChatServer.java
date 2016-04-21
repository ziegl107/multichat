import java.io.*;
import java.net.*;


public class ChatServer{
	
	public static void main(String[] args) {
		DatagramSocket socket = null;
		DatagramPacket packet= null;
		byte[] buffer = null;

		try {
			socket = new DatagramSocket();

			//while(true){
				String out = "my first message";
				buffer = out.getBytes();

				InetAddress address = InetAddress.getByName("203.0.113.0");
				packet = new DatagramPacket(buffer, buffer.length, address, 4446);

				socket.send(packet);
				System.out.println("Server is sending: "+ out);
				
			//}
		}

		catch(IOException e){
			e.printStackTrace();
		}

	}
}
