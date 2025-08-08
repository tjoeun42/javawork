package _04_overloading;

public class OverOp {
	int num = 1;

	int minus() {
		return num;
	}
	int minus(int num1) {
		return num1-num;
	}
	int minus(int num1, int num2) {
		return num1-num2;
	}
	
	int multiply() {
		return num*2;
	}
	int multiply(int num1) {
		return num*num1;
	}
	int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	double divide() {
		return num;
	}
	double divide(double num1) {
		return num1/num;
	}
	double divide(double num1, double num2) {
		return num1/num2;
	}
}
