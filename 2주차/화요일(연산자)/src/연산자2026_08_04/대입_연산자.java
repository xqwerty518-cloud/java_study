package 연산자2026_08_04;

public class 대입_연산자 {

	public static void main(String[] args) {
		/**
		 * 대입 연산자는 오른쪽 피연산자의 연산결과를 왼쪽 변수에 대입하는 연산자로 앞으로 가장 많이 사용하게 될 연산자 중 하나다
		 * 예를 들어 a=3이라는 코드는 오른쪽 값인 3을 왼쪽 변수 a에 대입하라는 명령이다. 그러면 a = a+3을 살펴보자
		 * 수학에서는 말이 되지 않는 수식이다. 이 세상 어떤 수도 자신과 자신에게 더한 수가 같을 수는 없다. 하지만 자바코드에서는
		 * 가능하다. 그 이오는 등호의 오른쪽이 먼저 계산되고 이후 대입 연산자가 실행되기 떄문이다 
		 * 즉 a = a+3은 a에 값에 3을 더한 후 그 결과를 다시 a에 대입하라는 의미다. 
		 * 축약 표현도 있다 
		 * += , -+, *= 등등등
		 */
		
		int value1 = 3;
		value1 = value1+3;
		System.out.println(value1);
		System.out.println();
		
		int value2;
		value2 = 5; System.out.println(value2 += 2);
		value2 = 5; System.out.println(value2 -= 2);
		value2 = 5; System.out.println(value2 *= 2);
		value2 = 5; System.out.println(value2 /= 2);
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 |= 2);
		value2 = 5; System.out.println(value2 <<= 2);
		value2 = 5; System.out.println(value2 >>= 2);
		value2 = 5; System.out.println(value2 >>>= 2);

	}

}
