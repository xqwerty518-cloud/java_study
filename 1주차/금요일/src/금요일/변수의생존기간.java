package 금요일;

public class 변수의생존기간 {
	/**
	 * 변수의 생존기간은 메모리에 변수가 만들어진 이후 사라지기까지의 기간을 의미한다. 
	 * 자바에서는 개발자가 직접 변수를 생성한다. 하지만 메모리에서 변수를 삭제하는 작업은 
	 * 자바 가상 머신이 알아서 한다. 따라서 변수가 사라지는 시점을 이해하는 것은 매우 중요하다.
	 * 사라진 변숫값을 읽으려고 하거나 값을 대입하려고 하면 문법 오류가 발생하기 때문이다. 
	 * 그렇다면 메모리의 변수는 언제 생성되고 언제 삭제되는지 한번 아래의 예제로 배워본다.
	 */
	
	public static void main(String[] args) {
		int value1 = 3; // 변수 value이 생성되는 시점
		{
			int value2 = 5; // 변수 value2가 생성되는 시점
			System.out.println(value1);
			System.out.println(value2);

		} // value2가 사라지는 시점
		System.out.println(value2); // 오류
	}// value1이 사라지는시점
}
