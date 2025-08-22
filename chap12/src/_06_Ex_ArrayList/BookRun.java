package _06_Ex_ArrayList;

public class BookRun {

	public static void main(String[] args) {
		LibraryController lc = new LibraryController(new Member("더조은", 31, "여"));
	    lc.insertBook();
	    System.out.println(lc.selectAll());
	    
	    lc.insertBook(new Book("리액트", "이고잉", "위키북스"));
	    System.out.println(lc.selectAll());

	    Book searchBook = lc.searchBook("java");
	    if(searchBook == null) {
	    	System.err.println("찾는 책이 없습니다");
	    } else {
	    	System.out.println(searchBook);
	    }
	}
}