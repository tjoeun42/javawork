package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientProgram {
	public static void main(String[] args) {
		// 1. 서버의 포트번호, ip주소를 알아야 함
		int port = 3005;
		
		BufferedReader br = null;	// 입력용 보조스트림
		PrintWriter pw = null;		// 출력용 보조스트림
		Socket socket = null;
		
		Scanner sc = new Scanner(System.in);
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			socket = new Socket(ip, port);
			
			System.out.println("서버와 연결 성공!");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			
			System.out.println("서버 : " + br.readLine());
			
			while(true) {
				System.out.print("클라이언트 : ");
				pw.println(sc.nextLine());
				pw.flush();
				
				System.out.println("서버 : " + br.readLine());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			pw.close();
			br.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}