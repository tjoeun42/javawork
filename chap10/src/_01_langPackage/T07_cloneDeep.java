package _01_langPackage;

import java.util.Arrays;

class Point3 implements Cloneable {
	int x;
	int y;

	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y; 
	}
}

class Circle implements Cloneable {
	Point3 p;  // 중심점
	double r;  // 반지름
	Circle(Point3 p, double r) {
		this.p = p;
		this.r = r;
	}
	// 인스턴스변수가 기본자료형이면 깊은복사(값 복사)
	// 인스턴스변수가 참조자료형이면 얕은복사(즉, 주소복사)
	@Override
	public Circle clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Circle)obj;
	}
	// 깊은복사 메소드
	public Circle deepClone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Circle c = (Circle)obj;
		c.p = new Point3(this.p.x, this.p.y);
		
		return (Circle)obj;
	}
	
	@Override
	public String toString() {
		return "p : [" + p + "], r : " + r; 
	}
}

public class T07_cloneDeep {
	public static void main(String[] args) {
		// 얕은 복사
		String[] str = {"a", "b", "c"};
		String[] copyStr = str;
		
		str[0] = "d";
		
		System.out.println(str[0]);
		System.out.println(copyStr[0]);
		System.out.println("===============================");
		System.out.println();
		
		// 1. 깊은 복사
		String[] deepCopy = new String[5];
		for(int i=0; i<str.length; i++) {
			deepCopy[i] = str[i];
		}
		System.out.println("str : " + Arrays.toString(str));
		System.out.println("deepCopy : " + Arrays.toString(deepCopy));
		System.out.println("------------------------------");
		
		str[0] = "a";
		System.out.println("str : " + Arrays.toString(str));
		System.out.println("deepCopy : " + Arrays.toString(deepCopy));
		System.out.println("===============================");
		System.out.println();
		
		// 2. Arrays.copyOf(원본배열, 복사할 길이)
		String[] arrayCopy = Arrays.copyOf(str, str.length);
		System.out.println("str : " + Arrays.toString(str));
		System.out.println("arrayCopy : " + Arrays.toString(arrayCopy));
		System.out.println("------------------------------");
		
		arrayCopy[2] = "z";
		System.out.println("str : " + Arrays.toString(str));
		System.out.println("arrayCopy : " + Arrays.toString(arrayCopy));
		System.out.println("===============================");
		System.out.println();
		
		// 3. clone()
		Circle c1 = new Circle(new Point3(5, 10), 3);
		Circle c2 = c1.clone();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("------------------------------");
		
		c1.r = 100;
		c1.p.x = 8;
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("------------------------------");
		
		Circle c3 = c1.deepClone();
		c1.r = 50;
		c1.p.x = 10000;
		System.out.println("c1 : " + c1);
		System.out.println("c3 : " + c3);
		System.out.println("------------------------------");
		
		// 배열에서의 clone은 기본으로 되어 있음
		int[] num = {1,2,3};
		int[] numCopy = num.clone();
		
		numCopy[0] = 100;
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(numCopy));
	}
}