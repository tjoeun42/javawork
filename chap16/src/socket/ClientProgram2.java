package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientProgram2 {
	public static void main(String[] args) {
		int port = 3005;
		Scanner sc = new Scanner(System.in);
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			try(Socket socket = new Socket(ip, port);) {
				System.out.println("서버와 연결 성공!");
				
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintWriter pw = new PrintWriter(socket.getOutputStream());) {
					
					System.out.println("서버 : " + br.readLine());
					
					while(true) {
						System.out.print("클라이언트 : ");
						pw.println(sc.nextLine());
						pw.flush();
						
						System.out.println("서버 : " + br.readLine());
					}
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}