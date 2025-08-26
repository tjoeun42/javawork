package _05_ObjectStream;

import java.io.*;

/*
 * 보조스트림
   - ObjectOutputStream / ObjectInputStream : 객체 단위로 입출력 할 수 있도록 도움을 주는 스트림
   - 메소드는 writeObject() / readObject()를 사용
   - 객체에 toString()을 오버라이딩하지 않으면 readObject()로 읽으면 객체의 주소가 들어옴
 * 기반스트림
   - FileOutputStream / FileInputStream : 파일과 연결하여 1byte단위로 입력하는 스트림
 */
public class ObjectAPI {
	public void fileSave() {
		Phone ph1 = new Phone("아이폰", 1900000);
		Phone ph2 = new Phone("갤럭시 폴드", 2200000);
		Phone ph3 = new Phone("갤럭시 노트", 2500000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"))) {
			oos.writeObject(ph1);
			oos.writeObject(ph2);
			oos.writeObject(ph3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))) {
			while(true) {
				System.out.println(ois.readObject());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {  // 순서는 반드시 IOException 이전에 써야됨
			System.out.println("파일을 모두 읽었습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}
