package 연산자2026_08_03;

public class 연산자의_연산방법 {

	public static void main(String[] args) {
		/**
		 * 산술 연산자와 증감 연산자
		 * 산술 연산자는 가장 기본적인 연산자로 사칙연산과 나머지 연산이있다. 이중 정수/정수 형태의 나누기를 할때 주의해야 할 필요가 있다
		 * 기본 자료형 간의 연산에서도 언급한 것처럼 int / int = int이므로 5/2의 값은 2.5가 아니라 2이다 즉 정수 / 정수 의 
		 * 결과는 나눗셈의 몫이다 이와 달리 % 연산은 말 그대로 나누기를 수행한 이후의 나머지를 나타내는데 이를 모듈로 연산이라고 한다.
		 * 
		 * 증감 연산자(++,--) 는 변숫값을 1씩 증가 또는 감소시킨다 예를 들어 a++의 의미는 a = a+1 즉 현재 a의 값을 1 증가
		 * 시켜 다시 변수 a에 저장시키는 으미다 이후 제어문에서 사용해 보겠지만 변숫값을 1씩 증가 또는 감소할 일이 매우 많아 코드의 간결함을
		 * 위해 생긴 연산자이다. 증감 연산자는 다시 변수 앞에 붙는 전위형과 변수 뒤에 붙는 후위형으로 나뉜다. 둘 사이의 유일한 차이점은
		 * 실행의 우선순위이다 전위형은 다른 모든 명령보다 먼저 실행되고 후위형은 가장 나중에 실행된다. 쉽게 말해 우선순위가 일등과 꼴등이라고 생각하면 된다.
		 * 
		 */
		
		int a = 3;
		++a;
		System.out.println(a);
		
		int b =3;
		b++;
		System.out.println(b);
		/**
		 * 위 예제에서 ++a 와 ++b는 모두 해당 행에서 하나의 명령을 수행한다. 따라서 전위형이든 후위형이든 실행 순서에 차이가 없으므로
		 * 결과는 동일하다.
		 */
		
		int a1 = 3;
		int b1 = ++a1; // a1 값에 1을 더하기 (전위형) 먼저 더하고 대입
		
		System.out.println(a1);
		System.out.println(b1);
		
		int a2 =3;
		int b2 = a2++; //a2 값을 b2 값에 대입 후에 a2 값에 1을 더하기 (후위형)
		
		System.out.println(a2);
		System.out.println(b2);
		
		/**
		 * 산술 연산자와 3가지 연산자
		 */
		
		System.out.println(2+3);
		System.out.println(8-5);
		System.out.println(7*2);
		System.out.println(7/2);
		System.out.println(8%5);
		System.out.println();
		
		//증감 연산자 case1
		int value1 =3;
		value1++;
		System.out.println(value1);
		
		int value2 = 3;
		++value2;
		System.out.println(value2);
		
		//case2
		int value3 =3;
		int value4 = value3++;
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		
		int value5 =3;
		int value6 = ++value5;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println();
		
		//case3
		
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
	}

}
