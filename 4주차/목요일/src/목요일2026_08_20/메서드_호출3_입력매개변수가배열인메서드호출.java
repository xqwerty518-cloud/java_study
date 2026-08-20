package 목요일2026_08_20;

import java.util.Arrays;

public class 메서드_호출3_입력매개변수가배열인메서드호출 {

	public static void main(String[] args) {
		/**
		 * 앞 예제에서 입력매개변수는 모두 기본 자료형이였다 이제 다음과 같이 입력매개변수가 배열일 때를 살펴보자
		 */
		int[] a = new int[] {1,2,3};
		printArray(a);
		
		printArray(new int[] {1,2,3}); 
		//printArray({1,2,3}); 오류: 배열의 선언/초기화 참조
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	/**
	 * printAraa() 메서드는 입력매개변수로 int[] 자료형을 포함하고 있다. 따라서 이 메서드를 호출하기 위해서는
	 * int[] 객체를 생성해 입력매개변수로 넘겨 줘야 한다 여기서는 2가지만 기억하자 
	 * 첫 번째는 호출할 때의 배열 데이터 입력 방법이다 
	 * 첫 번째 처럼 new int[] = {1,2,3} 을 입력매개변수로 넘겨 주면 메서드에서는 다음 2줄에 코드가 가장 먼저 실행된다
	 * int[] a;
	 * a = new int[] {1,2,3};
	 * 
	 * 이 방법은 1차원 배열 객체를 생성하는 두 번째 방법이다. 만약 세 번째 방법을 사용해 초깃값을 넘겨준다면 객체 생성후 따로
	 * 값을 대입을 하는 코드가 실행되므로 오류가 발생한다.
	 */
}
