package 금2026_09_11_3;

/**
 * 마지막으로 this()와 super()가 여러개 섞여 있는 예제를 살펴보자 
 */

class A{
	A(){
		this(3);
		System.out.println("A 생성자 1");
	}
	A(int a){
		System.out.println("A 생성자 2");
	}
}

class B extends A{
	B(){
		this(3);
		System.out.println("B 생성자 1");
	}
	B(int a){
		System.out.println("B 생성자 2");
	}
}
/**
 * 가장 마지막의 경우만 살펴보자면 B bb2 = bew B(2)와 같이 클래스 B의 두 번째 생성자를 호출해 
 * 객체를 생성했다. 두 번째 생성자의 첫 줄에는 this() super()가 모두 없으므로
 * 컴파일러가 자동으로 super()를 추가해 줄 것이다. 따라서 부모의 기본 생성자인 A()가 먼저 호출된다
 * A() 첫 줄에는 다시 this(3)과 같이 int를 받는 자신의 생성자를 호출하고 있으므로 다시 클래스 
 * A의 두번째 생성자가 호출된다. 이제 각각의 메서드들은 순차적으로 실행하면 결과적으로는 
 * A 생성자 2 A 생성자 1 B 생성자 2 순으로 출력될 것이다. 
 * 
 * 그렇다면 클래스 A의 두 번째 생성자의 첫 줄에는 this()도 super()도 없으므로 
 * 역시 super()가 들어가야 하는데 클래스 A는 아무것도 상속받지 않았다. 
 * 그러면 오류가 발생해야 하지 않을까? 이 질문의 한 대답이 바로 다음 절에서 알아보는 최상위 클래스인 
 * Object 클래스이다. 
 */

public class 부모_클래스의_생성자를_호출하는_super메서드_2 {

	public static void main(String[] args) {
		A aa1 = new A();
		System.out.println();
		A aa2 = new A(3);
		System.out.println();
		
		B bb1 = new B();
		System.out.println();
		B bb2 = new B(2);
	}

}
