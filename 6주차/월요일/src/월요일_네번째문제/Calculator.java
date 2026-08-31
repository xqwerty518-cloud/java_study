package 월요일_네번째문제;

public class Calculator {
	static int add(int a,int b) {
		return a + b;
	}
	
	static int multiply(int a, int b) {
		return a * b;
	}
	
	static double average(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		return (double)sum/arr.length;
		
	}

}
