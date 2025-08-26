package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerProgram3 {
	public static void main(String[] args) {
		int port = 3005;
		Scanner sc = new Scanner(System.in);
		try {
			try(ServerSocket server = new ServerSocket(port);) {
				System.out.println("클라이언트의 요청을 기다리고 있음...");
				
				Socket socket = server.accept();
				System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함");
				
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream());) {

					pw.println("환영합니다. 💌");
					pw.flush();
					
					String msg = null;
					while((msg = br.readLine()) != null) {
						if(msg.equals("exit")) {
							System.out.println("채팅 종료");
							break;
						}
						System.out.println("클라이언트 : " + msg);
						
						System.out.print("서버 : ");
						pw.println(sc.nextLine());
						pw.flush();
					}
					System.out.println("클라이언트와 연결 해제함");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
