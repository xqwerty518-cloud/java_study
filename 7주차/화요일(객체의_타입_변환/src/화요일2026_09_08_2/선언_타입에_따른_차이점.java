package 화요일2026_09_08_2;

/**
 * 10.2.3 선언 타입에 따른 차이점 
 * 다운캐스팅을 메모리 구조상에서 이해했다면 선언 타입에 따른 차이점은 어렵지 않게 이해 할 수 있을 것이다. 
 * 다음과 같이 2개의 클래스가 있다고 가정해 보자 
 */

class A{
	int m = 3;
	void abc() {
		System.out.println("A");
	}
}

class B extends A{
	int n = 4;
	void bcd() {
		System.out.println("B");
	}
}
/**
 * 클래스 A는 필드 m과 메서는 abc() 가 있고 이 클래스를 상속한 클래스 B는 필드 n과 메서드 bcd()를
 * 추가로 정의했다. 즉 클래스 B에서는 m,n abc() bcd()를 사용할 수 있다. 
 * 이제 동일하게 B() 생성자로 객체를 생성하고 이를 B 타입과 A 타입으로 각각 선언했을때의 차이를 알아보자
 * 
 * 메모리 구조상 B b = new B() 일때 B객체를 가르키고 B 객체 안에 부모 클래스의 객체인 A 객체도
 * 존재 하기에 다 사용가능하다 
 * 하지만 A a = new B() 일때를 보면 타입 자체가 A 이기에 A 객체를 가르킬것이다. 이러면 m과 abc()만 
 * 사용 가능하다. 
 */

public class 선언_타입에_따른_차이점 {

	public static void main(String[] args) {
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();
		
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		A ab = new B();
		System.out.println(ab.m);
		ab.abc();
	}

}
