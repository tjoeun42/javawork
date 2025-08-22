package _08_Ex_comparable;

import java.util.ArrayList;
import java.util.Scanner;

public class BookRun {
	static LibraryController lc = new LibraryController();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.println();
			System.out.println("*************** 메뉴 *************");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 전체 도서 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서명 오름차순 정렬");
			System.out.println("0. 종료");

			System.out.println();
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(num) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4 :
				deleteBook();
				break;
			case 5 :
				ascBook();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력하세요");
			} // switch end
		} // while end
	} // main end
	
	static void insertBook() {
		System.out.println("=========== 새 도서 추가 =============");
		
		System.out.println("책 정보 입력하기");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르(인문 / 자연과학 / 컴퓨터 / 요리 / 기타) 중 선택 : ");
		String category = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		lc.insertBook(new Book(title, author, category, price));
	}
	
	static void selectList() {
		System.out.println("=========== 모든 도서 조회 =============");
		ArrayList<Book> bookList = lc.selectList();
		if(bookList.isEmpty()) {
			System.out.println("도서가 한권도 없습니다");
		} else {
			for(Book book : bookList) {
				System.out.println(book);
			}
		}
	}
	
	static void searchBook() {
		System.out.println("=========== 도서 검색 =============");
		System.out.print("검색어 입력 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Book> searchList = lc.searchBook(keyword);
		if(searchList.isEmpty()) {
			System.out.println("검색 결과 책이 없습니다");
		} else {
			for(Book book : searchList) {
				System.out.println(book);
			}
		}
	}
	
	static void deleteBook() {
		System.out.println("=========== 도서 삭제 =============");
		System.out.print("삭제할 도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("삭제할 저자명 : ");
		String author = sc.nextLine();
		
		Book book = lc.deleteBook(title, author);
	
		if(book == null) {
			System.out.println("삭제할 도서가 없습니다.");
		} else {
			System.out.print(book);
			System.out.println("의 책이 성공적으로 삭제되었습니다.");
		}
	}
	
	static void ascBook() {
		int result = lc.ascBook();
		if(result == 1) {
			System.out.println("정렬에 성공");
		} else {
			System.out.println("정렬에 실패");
		}
	}
}
