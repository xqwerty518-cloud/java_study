package 토요일;

public class 기본자료형간의연산 {

	public static void main(String[] args) {
		/**
		 * boolean을 제외한 나머지 기본 자료형은 서로 연산할 수 있다. 
		 * 이떄 모든 연산은 같은 자료형끼리만 가능하며 연산 결과 역시 같은 자료형이 나온다.
		 * 단 int보다 작은 자료형 간의 연산 결과는 int형이 나온다.
		 * 예를 들어 byte + byte, short+short byte+short 의 결과 자료형은 int이다.
		 * 이는 cpu에서 연산 최소 단위가 int이므로 int보다 작은 자료형도 일단 int로 읽어 와서 연산을 수행하기 때문이다.
		 * 
		 * 그렇다면 int+long은 계산할 수 없을까? 이것이 바로 타입 변환을 배운 이유다.
		 * 다운캐스팅은 개발자가 직접 해 줘야 하지만. 업캐스팅은 자동 타입 변환이므로 int + long을 수행하면 컴파일러는
		 * 연산을 위해 앞의 int를 long으로 자동타입변환해 long + long으로 계산한다. 당연한 이야기지만 결과도 long으로 나올것이다.
		 */
		
		int value1 = 3+5;
		int value2 = 8/5; 
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0/5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		
		int value5 = data1 + data2;
		
		System.out.println(value1);		
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println();
		
		// 다른 자료형 간의 연산
		double value6 = 5 + 5.3;
		int value7 = 5 + (int) 3.5;
		
		double value8 = 5 / 2.0;
		byte data3 = 3;
		short data4 = 5;
		int value9 = data3 + data4;
		double value10 = data3 + data4;
		
		System.out.println(value6);		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		


	}

}
