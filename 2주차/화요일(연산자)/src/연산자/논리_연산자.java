package 연산자;

public class 논리_연산자 {

	public static void main(String[] args) {
		/**
		 * 논리 연산자는 비트 연산자와 매우 비슷하지만 피연산자로 불리언값만을 낼 수 있고 연산 결과 또한 불리언 타입만을 지닌다.
		 * 값 1		값 2		&&(AND)	||(OR) ^(XOR) !(NOT)
		 * false	false	false	false	false	false > true
		 * false	true	false	true	true	true > false
		 * true		false	false	true	true
		 * true		true	true	true	false
		 * 
		 * 쇼트서킷
		 * 이러한 논리 연산은 비트 연산자로도 수행할 수 있다. 일반적으로 비트 연산자의 양쪽에 위치하고 있는 피연산자는 정숫값이지만
		 * 양쪽 피연산자의 자리에 불리언값이 위치하면 비트연산자는 비트연산이 아닌 논리연산을 수행한다.
		 * 그렇다면 논리 연산자로 논리 연산을 수행하는 것과 비트 연산자로 논리 연산을 수행하는것과의 차이점은 무엇일까?
		 * 그것은 바로 쇼트서킷의 적용 여부다. 쇼트 서킷은 연산을 수행하는 과정에서 결과가 이미 확정됐을 때 나머지 연산 과정을
		 * 생략하는것을 의미한다. 예를 들어 (5>3) || (3<2)를 수행하고 할때 왼쪽이 true이므로 오른쪽 항의 결과와 상관없이
		 * 항상 true일 것이다 따라서 이때는 오른쪽 항인 (3<2)를 아예 읽지도 않는 것이 바로 쇼트 서킷이다.
		 * 비트연산으로 논리연산을 하면 쇼트서킷은 실행되지 않는다.
		 */

		System.out.println(true && false);
		System.out.println(true || (5 < 3));
		System.out.println((5 >= 5) ^ (7 > 2));
		System.out.println();
		System.out.println(true & false);
		System.out.println(true | (5<3));
		System.out.println((5>=5) ^(7>2));
		/**
		 * 두 연산자를 이용한 논리 연산의 결과가 항상 동일하면서 논리 연산자는 불필요한 계산을 생력했으므로 논리 연산자가 좋아 보일 수 있다
		 * 하지만 쇼트서킷을 의도적으로 적용하지 않아야 하는 때도 있다. 
		 */
		int a,b,c;
		a = 3; b = 3; c = 3;
		System.out.println(false && a++ > 6);
		System.out.println(true || b++ > 6);
		System.out.println(true ^ c++ > 6); 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println();
		
		a = 3; b = 3; c = 3;
		System.out.println(false & a++ > 6);
		System.out.println(true | b++ > 6);
		System.out.println(true ^ c++ > 6);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		/**
		 * 논리 연산과 비트 연산의 각 오른쪽 피연산자에 증감 연산자가 포함돼 있다 논리 연산자일 때 왼쪽 항의 결과로 이미 결과가 
		 * 결정됐을 떄는 오른쪽 항을 실행시키지 않으므로 각 변수의 증감 연산은 이뤄지지 않는다. 반면 비트 연산자를 이용해 동일한
		 * 논리 연산을 수행하면 연산 결과의 결정 시기와 관계없이 항상 각 변수의 증감 연산이 수행된다.
		 * 
		 * 논리 XOR 연산을 수행하기 위해서는 항상 양쪽 값을 모두 확인해야 하므로 쇼트 서킷을 구조적으로 적용할 수 없다. 
		 * 이것이 바로 논리 XOR 연산과 비트 XOR연산의 연산 기호가 ^로 동일한 이유이다.
		 */
		
	}

}
