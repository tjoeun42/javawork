package _03_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class T02_HashMap {

	public static void main(String[] args) {
		/*
		 HashMap 생성하여, 3개 넣기
		 Map<String, String>
		       id,     pw
		       
		 1. 사용자로 부터 id pw를 입력받아서
		    - id가 없으면 : '입력한 id는 없습니다' 출력 후 다시실행
		    - pw가 맞지 않으면 : 'pw가 맞지 않습니다' 출력 후 다시실행
		    - id와 pw가 맞으면 : '로그인 되었습니다' 출력 후 종료
		 */
		HashMap<String, String> map = new HashMap<>();
		map.put("myId", "pw1234");
		map.put("hong", "pw56");
		map.put("park", "pw78");
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		while(true) {
			System.out.print("id 입력 : ");
			String id = sc.next();
			
			if(map.containsKey(id)) {
				while(true) {
					System.out.print("pw 입력 : ");
					String pw = sc.next();		
					if(pw.equals(map.get(id))) {
						System.out.println("로그인 되었습니다");
						flag = true;
						break;
					} else {
						System.out.println("비밀번호가 맞지 않습니다");
					}
				}
				if(flag)
					break;
			} else {
				System.out.println("입력한 id는 없습니다");
			}
		}
	}
}