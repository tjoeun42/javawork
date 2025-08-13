package _04_interfaceExtends;

// 같은 interface에서 상속 받을 때는 extends키워드로 상속 받음
//   다중 상속 가능
interface Inter1 {
	int method1();
}

interface Inter2 {
	int method2();
}

public interface Inter extends Inter1, Inter2 {
	int method();
}
