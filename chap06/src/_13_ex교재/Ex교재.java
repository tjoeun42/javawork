package _13_ex교재;

public class Ex교재 {

	public static void main(String[] args) {
		int[] arr = {9,5,24,13,3,21};
		
		Math m = new Math();
		int max = m.max(arr);
		int min = m.min(arr);
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
class Math {
	int max(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}
	
	int min(int[] arr) {
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min > arr[i])
				min = arr[i];
		}
		return min;
	}
}
