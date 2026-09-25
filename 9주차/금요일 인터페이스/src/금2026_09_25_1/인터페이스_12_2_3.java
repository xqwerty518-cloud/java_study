package 금2026_09_25_1;

/**
 * 12.2.3 인터페이스 타입의 객체 생성 방법
 * 
 * 인터페이스도 추상 메서드를 포함하고 있으므로 객체를 직접 생성할 수는 없다.
 * 이때는 추상 클래스와 마찬가지로 자식 클래스를 정의하고 자식 클래스의 생성자로 객체를 
 * 생성하는 방법과 익명 니너 클래스를 이용해 바로 객체를 생성하는 방법을 사용할 수 있다.
 * 각각의 방법은 인터페이스를 상속한다는 것을 제외하고 추상 클래스의 객체 생성 방법과 같다. 
 */

interface A {
	int a = 3;
	void abc();
}

class B implements A{
	public void abc() {
		System.out.println("방법 1");
	}
}

public class 인터페이스_12_2_3 {

	public static void main(String[] args) {
		A a = new B();
		a.abc();
		
		A a1 = new A() {
			public void abc() {
				System.out.println("방법 2");
			}
		};
		
		a1.abc();
	}

}
