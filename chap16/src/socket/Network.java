package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 통신을 하기 위해서는 서버의 ip주소(또는 도메인명), 포트번호를 알아야 함
   > 네트워크 정보를 확인하는 클래스 및 정보 얻기
 */
public class Network {
	public static void main(String[] args) {
		try {
			// InetAddress : 네트워크 정보(ip주소 관련)를 확인할 수 있는 클래스
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost);
			
			System.out.println("내 pc명 : " + localhost.getHostName());
			System.out.println("내 ip주소 : " + localhost.getHostAddress());
			System.out.println("--------------------------------------");
			
			// 도메인을 통해 서버에 관련된 정보 얻기
			InetAddress googleHost = InetAddress.getByName("google.com");
			System.out.println("google 서버명 : " + googleHost.getHostName());
			System.out.println("google ip 주소 : " + googleHost.getHostAddress());
			System.out.println("--------------------------------------");
			
			// 도메인을 통해 서버에 관련된 정보를 배열로 얻기
			InetAddress[] naverHost = InetAddress.getAllByName("naver.com");
			System.out.println("naver의 호스트 갯수 : " + naverHost.length);
			for(InetAddress i : naverHost) {
				System.out.println("naver 서버명 : " + i.getHostName());
				System.out.println("naver ip 주소 : " + i.getHostAddress());
			}
		} catch (UnknownHostException e) { // 서버의 DNS설정이 안되어 있던지, 도메인을 찾을 수 없는 경우 예외 발생됨
			e.printStackTrace();
		}
	}
}
