package _03_Ex;

import java.util.Scanner;

public class LoginRun {

	public static void main(String[] args) {
		String id = "tjoeun";
		String pw = "javafull3";
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디 : ");
			String input_id = sc.next();
			
			System.out.print("비밀번호 : ");
			String input_pw = sc.next();
			
			if(!id.equals(input_id)) {
				throw new LoginException("아이디가 잘못되었습니다.");
			} else if(!pw.equals(input_pw)) {
				throw new LoginException("비밀번호가 잘못되었습니다.");
			} else {
				System.out.println("로그인 성공");
			}
		} catch(LoginException e) {
			System.out.println(e.getMessage());
		}
	}
}
