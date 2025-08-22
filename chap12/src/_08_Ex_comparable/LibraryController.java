package _08_Ex_comparable;

import java.util.ArrayList;

public class LibraryController {
	ArrayList<Book> list = new ArrayList<>();
	LibraryController() {
		list.add(new Book("자바 프로그래밍 소스", "서민구", "컴퓨터", 20000));
		list.add(new Book("요리는 소스빨", "아무개", "요리", 25000));
		list.add(new Book("대화의 기술 자바", "다니엘", "인문", 32000));
	}

	void insertBook(Book book) {
		list.add(book);
	}
	ArrayList<Book> selectList() {
		return list;
	}
	ArrayList<Book> searchBook(String keyword) { 
		ArrayList<Book> searchList = new ArrayList<>();
		for(Book book : list) {
			if(book.getTitle().contains(keyword)) {
				searchList.add(book);
			}
		}
		return searchList;
	}
	Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(int i=0; i<list.size(); i++) {
			if(title.equals(list.get(i).getTitle()) && author.equals(list.get(i).getAuthor())) {
				removeBook = list.remove(i);
				break;
			}
		}
		return removeBook;
	}
	
	// null을 전달하면 리스트의 요소들이 Comparable인터페이스를 구현하고 있는 경우,
	// 해당 객체의 compareTo 메소드를 기반으로 정렬함.
	int ascBook() {
		list.sort(null);
		return 1;
	}
}
