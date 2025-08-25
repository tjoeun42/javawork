package _02_byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 바이트 스트림
   - 바이트 스트림 : 데이터를 1바이트 단위로 전송하는 통로(좁은 통로임. 1바이트면 한글 깨짐)
   - 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
   
   xxxInputStream : xxx매체로부터 데이터를 입력받는 통로(외부매체로부터 데이터를 읽어오겠다)
   xxxOutputStream : xxx매체로 데이터를 출력하는 통로(외부매체로 데이터를 내보내겠다. 쓰겠다)
   
 * 순서
   1. 스트림 생성(통로 만들기)
   2. 스트림으로 데이터 출력 or 입력(메소드 활용)
   3. 다 사용한 후 스트림 반납
 */
public class ByteStreamAPI {
	
	public void fileSave() {
		// FileOutputStream : 파일과 직접 연결하여 1바이트 단위로 출력(쓰기)하는 스트림
		FileOutputStream fout = null;
		try {
			// 1. 스트림 생성
			fout = new FileOutputStream("a_byte.txt"); // 파일이 없으면 새로 만들고 통로 연결/ 파일이 있으면 통로연결
			
			// 2. 스트림으로 데이터 출력 : write메소드 사용
			fout.write(97);	// 'a'문자 저장
			fout.write('b');
			
			byte[] arr = {99,100,101};
			fout.write(arr);
			
			fout.write(arr, 1, 2); // (배열, 시작index, 갯수)
			// fout.write('랑');    2바이트라 깨져서 들어감

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 3. 스트림 반납하기
		try {
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}  // fileSave() end
	
	
	public void fileRead() {
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
		FileInputStream fin = null;
		try {
			// 1. 스트림 생성(통로 만들기)
			fin = new FileInputStream("a_byte.txt");
			
			// 2. 스트림으로 데이터 입력 : read() 메소드 이용
			//	  1byte단위로 하나씩 읽어옴 / 숫자로 읽음
			// System.out.println(fin.read());  // 97
			// System.out.println((char)fin.read());  // 문자로 형변환
			
			// read() : 읽어올 데이터가 없을 때 -1반환
			/*  반복문 수행시 fin.read()가 2번씩 실행되어 하나씩 건너띄고 출력됨
			while(fin.read() != -1) {
				System.out.println((char)fin.read());
			}
			*/
			
			// 해결방법 1.
			/*
			while(true) {
				int value = fin.read();
				if(value == -1)
					break;
				System.out.println((char)value);
			}
			*/
			
			// 해결방법 2. 권장방법
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.println((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 다 사용한 후 스트림 반납
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
} // class end











