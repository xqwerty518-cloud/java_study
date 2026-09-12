package 토2026_09_12_2;

/**
 * toString() - 객체 정보를 문자열로 출력
 * Object 클래스의 toString() 메서드는 객체 정보를 문자열로 리턴하는 메서드다 여기서 객체 정보는
 * 패키지명.클래스명@해시코드 로 나타난다. 해시코드는 객체가 저장된 위치와 관련된 값이다. 실제 객체의 정보를
 * 표현하고자 할 때는 대부분 클래스명이나 숫자로 나열된 해시코드보다는 객체에 포함돼 있는 필드값을 출력한다.
 * 따라서 이때 자식 클래스에는 toString 메서드를 오버라이딩해 사용한다.  
 */

class A{
	int a = 3;
	int b = 4;
}

class B{
	int a = 3;
	int b = 4;
	@Override
	public String toString() {
		return "필드값: a = " + a + ", b = " + b;
	}
}

/**
 * 클래스 A는 아무것도 상속하지 않았으므로 컴파일러가 자동으로 extends Object 를 삽입한다. 따라서
 * 내부에는 Object 메서드가 포함돼 있을 것이다. 이때 다음과 같이 A 객체를 생성한 후 hashCode() 메서드의
 * 리턴값은 16진수로 출력하면 aa 객체의 위칫값과 관련된 고유값이 출력된다.
 */

public class toString메서드 {

	public static void main(String[] args) {
		A aa = new A();
		System.out.printf("%x\n", aa.hashCode());
		System.out.println(aa);
		/**
		 * 또한 print() 메서드는 객체를 출력하면 자동으로 객체내의 toString() 메서드를 호출한다. 
		 * 따라서 System.out.println(toString(aa)) 과 같은 표현이다. 
		 * 앞에서 언급한것처럼 toString의 출력결과인 패키지명.클래스명.해시코드는 객체의 직관적인
		 * 정보를 제공하지 못한다. 그래서 B클래스와 같이 오버라이딩해서 사용하는 것이 일반적이다. 
		 */
		
		B bb = new B();
		System.out.println(bb);
		/**
		 * 클래스 B에서 오버라이딩한 toString() 메서드에서는 자신의 필드 2개를 출력하는 문자열을 리턴한다.
		 * 따라서 다음과 같이 B 클래스의 객체를 생성한후 System.out.println(bb) 실행하면 
		 * 필드값이 출력된다. 
		 */
	}

}
