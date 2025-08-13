package _06_ex;

public interface Product {
	void power();
	int volume(int volume);
	
	static void AISpeak(String str) {
		System.out.println(str);
	}
	
	default void search(String search) {
		System.out.println(search + "를 인터넷에서 검색합니다");
	}
}
