package _02_StringMethod;

public class T04_startsWith_endsWoth {

	public static void main(String[] args) {
		// startsWith : 맨 앞에 지정하는 문자로 시작하는지
		String str = "springjavahtmlsql";
		boolean result = str.startsWith("sp");
		System.out.println(result);
		
		// endsWith : 맨 끝에 지정하는 문자로 끝나는지
		String[] strArr = {"bb.class", "aa.jpg", "cc.text", "dd.png"};

		for(int i=0; i<strArr.length; i++) {
			if(strArr[i].endsWith("jpg") || strArr[i].endsWith("png"))
				System.out.println(strArr[i] + "는 그림파일 입니다");	
		}
	}
}