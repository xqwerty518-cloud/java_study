package 토요일;

public class 기본자료형간의타입변환 {

	public static void main(String[] args) {
		/**
		 * boolean을 제외한 기본 자료형 7개는 자료형을 서로 변환할 수 있는데 이를 타입 변환이라고 한다.
		 * 자바는 항상 대입(=) 연산자를 중심으로 왼쪽과 오른쪽 자료형이 일치해야 하므로 타입 변환을 수행해야 할 때가 있다.
		 * 타입 변환 방법은 단순히 변환 대상 앞에서 (자료형)만 표기하면 된다.
		 * 
		 * 자료형 A 변수명 = (자료형 A) 값
		 * long 변수명 = 값 + L
		 * 
		 * 여기서 반드시 알아야 할 점은 타입 변환을 수행할 때는 저장할 수 있는 값의 범위나 종류가 달라지므로 값이 변할 수 있다는 것이다.
		 * 
		 */
		
		int value1 = (int) 5.3; // 5.3 -> 5
		long value2 = (long) 10; 
		float value3 = (float) 5.8;
		double value4 = (double) 16;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4+"\n");
		
		long value5 = 10L;
		long value6 = 10l;
		float value7 = 5.8F;
		float vlaue8 = 5.8f;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(vlaue8);

		
	}

}
