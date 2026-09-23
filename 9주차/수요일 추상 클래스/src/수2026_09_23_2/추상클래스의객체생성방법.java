package 수2026_09_23_2;

/**
 * 다음과 같이 자식 클래스 B를 직접 정의하고 2개의 객체를 생성하는 예제를 살펴보자.
 * 
 * 직접 자식 클래스를 생성하므로 일단 한번 정의한 이우에는 자식 클래스 생성자의 
 * 호출만으로도 객체를 몇 개든 생성할 수 있다.
 * 
 * 반면 익명 이너 클래스일 때는 클래스명을 알 수 없기 때문에 객체를 정의할 때 마다 익명 이너 
 * 클래스를 정의해야한다. 
 * 
 * 이를 정리하자면 객체를 여러 개 만들어야 하는 상황이라면 자식 클래스를 직접 정의하는 첫 번째
 * 방법이 적절하다. 딱 한번만 만들어 사용할 객체일 때는 익명 이너 클래스를 활용하는 것이 
 * 훨씬 간결한 코드를 작성하는데 도움이 된다. 
 */

abstract class A{
	abstract void abc();
}

class B extends A{
	void abc() {
		System.out.println("방법 1 자식 클래스 생성 및 추상 메서드 구현 ");
	}
}



public class 추상클래스의객체생성방법 {

	public static void main(String[] args) {
		A b1 = new B();
		A b2 = new B();
		
		b1.abc();
		b2.abc();
		
		A a1 = new A() {
			void abc() {
				System.out.println("방법 2 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		
		A a2 = new A() {
			void abc() {
				System.out.println("객체를 생성할 때 마다 오버라이딩 필요");
			}
		};
		
		a1.abc();
		a2.abc();
	}

}
