package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientProgram3 {
	public static void main(String[] args) {
		int port = 3005;
		Scanner sc = new Scanner(System.in);
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			try(Socket socket = new Socket(ip, port);) {
				System.out.println("서버와 연결 성공!");
				
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintWriter pw = new PrintWriter(socket.getOutputStream());) {
					
					String msg = null;
					while((msg = br.readLine()) != null) {
						System.out.println("서버 : " + msg);
						
						System.out.print("클라이언트 : ");
						String sendMsg = sc.nextLine();
						pw.println(sendMsg);
						pw.flush();
						
						if(sendMsg.equals("exit"))
							break;
					}
					System.out.println("서버와 연결 해제됨");
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}