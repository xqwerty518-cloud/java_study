package 수요일2026_09_09_3;

/**
 * 10.3.3 메서드 오버라이딩과 메서드 오버로딩
 * 간혹 메서드 오버라이딩과 메서드 오버로딩을 혼동할 때가 있다. 
 * 오버로딩은 이름이 동일하지만 시그니처가 다른 여러 개의 메서드를 같은 공간에 정의하는 것을 말한다. 
 * 오버라이딩과 오버로딩을 폴더 내의 파일과 비교해 보면 오버라이딩은 파일명과 확장명이 완벽하게 동일한 파일을
 * 같은 공간에 복사할 때다. 이때는 덮어쓰기가 수행될 것이다. 반면 오버로딩은 파일명은 동일하지만 
 * 확장명이 다른 파일을 같은 폴더에 복사해 넣을 때다 이때 각각의 파일이 모두 같은 공간에 존재할 수 있다. 
 * 다음 예를 보자 
 */

class A{
	void print() {
		System.out.println("A 클래스 print1");
	}
	void print2() {
		System.out.println("A 클래스 print2");
	}
}
class B extends A{
	void print() {
		System.out.println("B 클래스 print1");
	}
	void print2(int a) {
		System.out.println("B 클래스 print2");
	}
}

/**
 * 클래스 A 에는 print1()과 print2() 메서드가 있다 클래스 A를 상속받은 클래스 B에서는 
 * print1() 과 print2(int a)를 추가로 정의했다. 이때 클래스 B에서는 몇 개의 메서드를 사용할 수 있을까?
 * 정답은 3개다. print1()은 상속받은 메서드와 리턴타입과 시그니처가 완벽하게 동일하므로 오버라이딩 된다. 반면
 * 클래스 A에게 상속받은 print2() 메서드는 입력매개 변수가 없는 print2() 메서드이며 
 * 클래스 B 에서 추가로 정의한 메서드는 입력매개변수로 정숫값은 1개 받는 print(int a) 이므로 메서드 시그니처가 
 * 다르다 즉 print2() 메서드는 오버로딩 되는 것이다 결과적으로 클래스 B 내부에서는 3개를 사용할 수 있다.
 */

public class 메서드_오버라이딩과_메서드_오버로딩 {

	public static void main(String[] args) {
		A aa = new A();
		aa.print();
		aa.print2();
		System.out.println();
		
		B bb = new B();
		bb.print();
		bb.print2();
		bb.print2(3);
		System.out.println();
		
		A ab = new B();
		ab.print();
		ab.print2();
	}

}
