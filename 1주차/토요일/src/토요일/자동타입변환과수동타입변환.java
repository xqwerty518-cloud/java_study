package 토요일;

public class 자동타입변환과수동타입변환 {

	public static void main(String[] args) {
		/**
		 * 타입 변환에는 컴파일러가 자동으로 수행하는 자동타입변환 과 개발자가 직접 타입 변환을 수행해야 하는 수동 타입 변환이 있다
		 * 먼저 크기(범위)가 작은 자료형을 큰 자료형에 대입 할 때를 살펴보자 이를 업캐스팅 이라고 한다. 
		 * 이때는 어떤 데이터 손실도 발생하지 않는다. 따라서 업캐스팅을 할 때는 개발자가 타입 변환 코드를 넣지 않아도 컴파일러가 
		 * 자동으로 타입 변환을 실행하는데 이를 자동타입변환 이라고 부른다. 
		 * 	ㄴ 업캐스팅이 아닐때 자동타입변환이 적용되는 때가 있다. 사실 모든 정수 리터럴값은 int자료형으로 인식된다.
		 * 	ㄴ 하지만 byte나 short 자료형에 저장할 수 이쓴ㄴ 범위 내의 정수 리터럴 값이 대입될 때는 자동타입변환이 
		 * 	ㄴ 각각의 자료형으로 수행된다. 
		 * 
		 * 이제 반대 상황을 살펴보자 큰 자료형을 작은 자료형에 대입하는 행위를 다운캐스팅이라고 한다. 이때는 데이터 손실이 발생할 수
		 * 있으므로 컴파일러에 따른 자동타입변환은 일어나지 않으며 개발자가 직접 명시적으로 타입변환을 수행해야한다.
		 * 자료형의 크기는 byte < short < char < int < long < float < double 의 순서로 커진다
		 */
		
		float value1 =3;
		long value2 = 5;
		double value3 = 7;
		byte value4 = 9;
		short value5 = 11;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println();
		
		// 수동 타입 변환
		byte value6 = (byte)128;
		int value7 = (int)3.5;
		float value8 = (float)7.5;
		
		System.out.println(value6);
		/**
		 * value6이 -128로 출력된 이유 
		 * 정수형 자료형을 작은 범위의 자료형으로 캐스팅할 때는 범위의 반대쪽 끝에서부터 다시 시작하는 서큘러 구조를 보인다 
		 * 즉 정숫값 128(127+1)을 byte 자료형으로 다운캐스팅히면 byte 자료형의 범위에서 반대쪽 끝인 정숫값 -128로 변경된다.
		 */
		System.out.println(value7);
		System.out.println(value8);
		System.out.println();

		/**
		 *  위 예제에서 value4와 value5는 업캐스팅이 아닌데도 예외적으로 자동 변환이 수행된다.
		 *  대입하는 값이 byte short의 저장 범위 내의 값일 때는 자동 변환으로 자료형을 변환했을 때에도 값에 오차가
		 *  없으므로 가능한 것이다. value6,7,8은 큰 자료형을 작은 자료형으로 다운캐스팅한 예로 데이터 손실이 발생한다.
		 *  value8은 데이터 손실이 없는 것처럼 보이지만 소수점 8자리 이상인 double 자료형의 실숫값을 float으로 변환하면
		 *  오차를 확인할 수 있다.
		 *  
		 */
		
		double value9  = 7.0000000005;
		System.out.println(value9);
		float value10 = (float)value9;
		System.out.println(value10);

	}

}
