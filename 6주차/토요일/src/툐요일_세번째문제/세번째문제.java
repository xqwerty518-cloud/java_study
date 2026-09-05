package 툐요일_세번째문제;

import java.util.Arrays;

class fibonacci {

	/**
	 * 
	 * @param n
	 * @return n번째의 피보나치 수 반환
	 */
	static int getNth(int n) {
		if (n <= 1) {
			return n;
		} else {
			return getNth(n - 1) + getNth(n - 2);
		}
	}

	/**
	 * 
	 * @param count
	 * @return 처음부터 count개의 피보나치 수열을 배열로 반환
	 */
	static int[] getSequence(int count) {

		int[] fibo = new int[count];

		fibo[0] = 0;
		fibo[1] = 1;

		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}

		return fibo;
	}
}

public class 세번째문제 {

	public static void main(String[] args) {
		fibonacci n1 = new fibonacci();

		System.out.println(n1.getNth(5));
		System.out.println(Arrays.toString(n1.getSequence(10)));
	}

}
