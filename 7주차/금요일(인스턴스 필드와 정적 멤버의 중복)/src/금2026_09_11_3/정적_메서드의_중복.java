package 금2026_09_11_3;

/**
 * 10.4.3 정적 메서드의 중복 
 * 
 * 인스턴스 메서드가 오버라이딩됐던 이유는 동일한 공간에 동일한 이름의 메서드를 저장했기 때문이다
 * 하지만 정적 메서드는 정적 필드와 마찬가지로 클래스 내부에 존재한다. 즉 다른 공간에 저장되는 것이다.
 * 
 * 부모 클래스의 정적 메서드는 부모 클래스 내부, 자식 클래스의 정적 메서드는 자식 클래스 내부에 저장된다.
 * 따라서 부모 클래스의 정적 메서드와 동일한 이름으로 자식 클래스에서 정의 한다 하더라도
 * 절대 오버라이딩 되지 않는다. 
 */

class A {
	static void print() {
		System.out.println("A 클래스");
	}
}
class B extends A {
	static void print() {
		System.out.println("B 클래스");
	}
}

public class 정적_메서드의_중복 {

	public static void main(String[] args) {
		A.print();
		B.print();
		System.out.println();
		
		A a = new A();
		B b = new B();
		A ab = new B();
		
		a.print();
		b.print();
		ab.print();
	}

}
