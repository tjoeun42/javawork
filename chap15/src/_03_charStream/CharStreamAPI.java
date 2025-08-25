package _03_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 문자기반 스트림
   - 데이터를 2바이트 단위로 전송하는 통로(넓은통로)
   - 기반스트림 : 외부매체 직접적으로 연결되는 통로
   
   xxxReader : 입력용 스트림
   xxxWriter : 출력용 스트림
 */
public class CharStreamAPI {
	void fileSave() {
		FileWriter fw = null;
		
		try {
			// 1. 객체 생성
			fw = new FileWriter("b_char.txt");
			
			// 2. writer() 메소드 이용한 출력
			//		2byte단위로 데이터 전송
			fw.write('A');
			fw.write(' ');
			fw.write("더");
			fw.write("조");
			fw.write("은");
			fw.write("\n");
			fw.write("와 스트림 재미있다"); // 하나씩 전송
			fw.write("\n");
			
			char[] arr = {'a','p','p','l','e'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	void fileRead() {
		FileReader fr = null;
		try {
			// 1. 객체 생성
			fr = new FileReader("b_char.txt");
			
			// 2. read() 메소드 이용하여 읽기
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 닫기
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}










