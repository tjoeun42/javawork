package _01_langPackage;
/*
 * clone() : 복제
   1. 반드시 clone하고자하는 클래스에 implements Cloneable 반드시 넣어줘야 함
   		: '이 클래스는 복제할 수 있는 클래스이다'라는것을 알려줄 목적
   2. clone()을 오버라이딩하지 않아도 됨
      Object클래스의 clone()메소드의 접근제어자가 protected임.
      같은 java.lang패키지 안에 있어야 함
   3. 2번과 같은 이유로 clone()를 오버라이딩 해야함.
 */
class Point implements Cloneable {
	int x;
	int y;
	Point() {}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/*
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	// 형변환없이 반환했을 때는 사용시 아래와 같이 강제형변환 해야됨
	Point copy = (Point)original.clone();
	*/
	@Override
	public Point clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Point)obj;
	}
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y; 
	}
}
public class T05_cloneRun {
	public static void main(String[] args) {
		Point original = new Point(3,4);
		Point copy = original.clone();
		
		System.out.println("원본 객체 : " + original);
		System.out.println("복제 객체 : " + copy);
	}
}