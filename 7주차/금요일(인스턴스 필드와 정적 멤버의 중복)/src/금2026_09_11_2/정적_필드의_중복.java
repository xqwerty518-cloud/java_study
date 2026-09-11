package 금2026_09_11_2;

/**
 * 10.4.2 정적 필드의 중복 
 * 이번에는 정적 필드를 살펴볼꺼다 정적 필드의 저장 공간은 정적 영역의 클래스 내부에 만들어지고 
 * 모든 객체가 공유한다고 했다. 다음 예를 살펴보자 
 */

class A{
	static int m = 3;
}

class B extends A{
	static int m = 4;
}

public class 정적_필드의_중복 {

	public static void main(String[] args) {
		// 정적 필드의 중복 예 1
		A.m = 3;
		A a = new A();
		System.out.println(A.m);
		System.out.println(a.m);
		
		/**
		 * 첫 예시에서는 클래스 영역의 클래스 A내에 정적 필드 m = 3 의 값이 저장된다. 
		 * 객체로 m값을 읽어도 동일한 위치의 값이 읽힌다. 
		 */
		
		//정적 필드의 중복 예 2
		A.m = 3;
		B.m = 4;
		B b = new B();
		b.m = 4;
		System.out.println(B.m);
		System.out.println(b.m);
		/**
		 * 두 번째 예시에서는 b.m = 4는 B객체 속의 m 값에 4를 입력하라는 의미이므로 
		 * B.m = 4; 와 동일한 의미를 지니고 있다 메모리 구조에서도 알 수 있듯
		 * 클래스 A와 B 내에 포함된 정적 필드의 공간은 완벽하게 분리되있는것을 알 수 있다 
		 * 따라서 오버라이딩이 발생하지 않는다. 
		 * 
		 */
		
		A.m = 3;
		B.m = 4;
		
		A ab = new B();
		
		ab.m = 3;
		System.out.println(ab.m);
		/**
		 * 세 번째 예시에서 ab.m = 3은 A 타입이 가리키는 객체 속의 m 값 즉 A.m 과 동일한 의미이다
		 * 이 역시 두 클래스의 정적 필드 저장 공간은 완벽히 분리돼 있으므로 오버라이딩은 발생하지 않는다. 
		 */
		
	}

}
