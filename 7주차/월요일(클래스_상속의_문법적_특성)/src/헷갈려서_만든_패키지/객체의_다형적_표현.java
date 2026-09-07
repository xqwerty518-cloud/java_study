package 헷갈려서_만든_패키지;

/**
 * 10.1.6 객체의 다형적 표현 
 * 
 * 앞에서는 객체의 다형적 표현을 개념적으로 설명했다. 이제 실제 코드에서 객체를 다형적으로 표현하는 방법을 
 * 살펴보자. 
 * 먼저 간단하게 E를 상속받아 클래스 F를 생성한 (A<-B) 예를 살펴보자
 * 
 * 상속 구조에서 자기 자신을 가리키거나 화살표 방향으로는 항상 다형적 표현을 할 수 있다. 
 * 따라서 이때 A는 A다 B는 A다 등은 모두 가능한 표현이다. 
 * A는 A다를 코드로 표현하면 A a = new A() 와 같이 표현할 수 있다. 이를 풀어 쓰면 
 * A 생성자로 만든 A 객체라 부를 수 있다. 이와 같은 방식으로 B는 A다 라고 표현 할 수 있으므로 
 * 이는 코드로 A a1 = new B() 와 같이 표현할 수 있다. 
 * 
 * 앞에서 말한 것 처럼 생성한 객체와 동일한 타입으로 선언하는 것은 물론 자식 클래스의 객체를 부모 클래스 
 * 타입으로 선언하는 모든 다형적 표현을 할 수 있다 따라서 클래스 A B C D가 다음과 같은 상속 구조일 때 
 * 다음 객체 생성 코드는 모두 올바른 예다. 
 */

class A{
	
}
class B extends A{
	
}
class C extends B{
	
}
class D extends C{
	
}

public class 객체의_다형적_표현 {

	public static void main(String[] args) {
		//다형적 표현의 올바른 방법
//		A a = new A();
//		B b = new B();
//		C c = new C();
//		D d = new D();
//		
//		A a1 = new B();
//		A a2 = new C();
//		A a3 = new D();
//		
//		B b1 = new C();
//		B b2 = new D();
		
		// A타입의 다형적 표현 
		A a1 = new A(); // A는 A다
		A a2 = new B(); // B는 A다
		A a3 = new C(); // C는 A다
		A a4 = new D(); // D는 A다 
		
		// B타입의 다형적 표현 
		//B b1 = new A(); // A는 B다 (X)
		B b2 = new B(); // B는 B다
		B b3 = new C(); // C는 B다
		B b4 = new D(); // D는 B다
		
		// C타입의 다형적 표현 
		//C c1 = new A(); // A는 C다 (X)
		//C c2 = new B(); // B는 C다 (X)
		C c3 = new C(); // C는 C다
		C c4 = new D(); // D는 C다
		
		// D타입의 다형적 표현 
		//D d1 = new A(); // A는 D다 (X)
		//D d2 = new B(); // B는 D다 (X)
		//D d3 = new C(); // C는 D다 (X)
		D d4 = new D(); // D는 D다
		
	}

}
