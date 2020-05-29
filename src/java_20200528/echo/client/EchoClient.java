package java_20200528.echo.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	

		private String ip;
		private int port;
		
		public EchoClient(String ip, int port) {
			this.ip = ip;
			this.port = port;
		}
		
		public void run() {
			Socket socket = null;
			socket.getInetAddress();
			try {
				//3. Socket객체를 생성하여 서버와 연결을 시도한다
				//4. 
				socket = new Socket(ip,port);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			new EchoClient("203.248.252.2",3000).run();
		}
	}


