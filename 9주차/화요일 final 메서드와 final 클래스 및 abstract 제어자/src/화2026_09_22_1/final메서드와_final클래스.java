package 화2026_09_22_1;

/**
 * 11.1.2 final 메서드와 final 클래스 
 * final 메서드와 final 클래스의 기능은 직관적이다. final 변수는 변수가 저장한 값이 
 * 최종 값의 의미를 지니고 있는 것럼 final 메서드 및 클래스도 각각 최종 메서드 최종 클래스의
 * 의미를 지닌다.
 * 
 * 그럼 최종 메서드의 의미는 무엇일까? 상속할 때 부모의 메서드를 오버라이딩하면 자식 클래스에서는
 * 메서드의 기능이 변경된다 final 메서드는 이렇게 메서드의 기능을 변경할 수 없는 메서드다
 * 즉 메서드를 final로 정의하면 자식 클래스에서 해당 메서드를 오버라이딩 할 수 없다. 
 * 
 * 이와 같은 개념으로 final 클래스 역시 최종 클래스의 의미로 더 이상 자식 클래스가
 * 없다는 것을 의미한다. 따라서 final 클래스는 상속 자체가 불가능 하다.
 */

class A{
	void abc() {}
	final void bcd() {}
}

class B extends A {
	void abc() {}
	//void bcd() {} 불가능 
}

final class C{
	// class D extends C{} 불가능 
}

public class final메서드와_final클래스 {

	public static void main(String[] args) {

	}

}
