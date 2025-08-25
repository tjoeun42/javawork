package _01_fileStream;

import java.io.File;
import java.io.IOException;

public class T01_File {
	public static void main(String[] args) {
		try {
			// 1. 경로를 지정하지 않고 파일 생성. 프로젝트 아래 만들어짐
			File f1 = new File("test.txt");
			f1.createNewFile();	// 메소드까지 실행해야만 실제 파일이 만들어짐
			System.out.println("절대 경로 : " + f1.getAbsolutePath());
			
			// 2. 존재하는 폴더에 파일 생성 -> 경로지정 해주면 됨
			// File f2 = new File("D:\\test.txt");
			File f2 = new File("D:/test.txt");
			f2.createNewFile();
			
			/* 3. 없는 폴더에 파일은 생성할 수 없음
			File f3 = new File("D:/temp/test.txt");
			f3.createNewFile();
			*/
			
			// 4. 폴더 먼저 만들고 파일 만들기
			File tempFolder = new File("D:/temp");
			tempFolder.mkdir();		// 폴더생성
			
			File f4 = new File("D:/temp/test.txt");
			f4.createNewFile();
			
			System.out.println(f1.exists());  // true
			System.out.println(new File("file.txt").exists());
			
			System.out.println(f1.isFile());
			System.out.println(tempFolder.isFile());
			
			System.out.println("------------------------------------");
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent/person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}