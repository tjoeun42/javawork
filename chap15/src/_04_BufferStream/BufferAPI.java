package _04_BufferStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 보조 스트림 : 기반스트림만으로 부족했던 성능개선을 해주는 스트림
 			   기반스트림에서 제공하지 않는 추가적인 메소드 제공(전송속도 높인다거나 등등)
   >> 외부매체와 직접 연결되지 않음
      단독 사용 불가(반드시 기반스트림과 함께 사용)
      
 * BufferedWriter / BufferedReader: 버퍼라는 공간을 제공해주는 보조스트림(속도 향상) 
 */
public class BufferAPI {
	// 기반스트림 : FileWriter 사용(2byte 단위 전송)
	// 보조스트림 : BufferedWriter 사용
	void fileSave() {
		BufferedWriter bw = null;
		try {
			/*
			// 1. 기반스트림 생성
			FileWriter fw = new FileWriter("c_buffer.txt");
			
			// 2. 보조스트림 생성
			BufferedWriter bw = new BufferedWriter(fw);
			*/
			
			// 위의 2줄은 한줄로
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// 3. 쓰기
			bw.write("안녕하세요?\n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("좋은하루 되세요");
			// 버퍼라는 공간에 계속 쌓아놨다가 한번에 출력해줌 => 속도 향상
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/*
		 try~with~resource 구문 : 자원반납을 알아서 해줌
		 
		 try(try블럭내에서 사용할 스트림객체 생성 구문) {
		 
		 } catch(예외클래스 e) {
		 
		 }
		 */
		
		try(BufferedWriter bw2 = new BufferedWriter(new FileWriter("d_buffer.txt"))) {
			bw2.write("안녕하세요?\n");
			bw2.write("반갑습니다");
			bw2.newLine();
			bw2.write("좋은하루 되세요");
		} catch (IOException e) {
			e.printStackTrace();
		} // 자원반납 구문을 안써도됨 자동으로 반납까지 해줌
	}
}