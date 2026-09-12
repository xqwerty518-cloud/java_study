package 토2026_09_12_1;

/**
 * 자바의 모든 클래스는 Object 클래스를 상속받는다. 즉 Object 클래스는 자바의 최상위 클래스다. 
 * 조금 의아해할 수 도 있다. 우리는 상속을 배웠지만 한 번도 Object 클래스를 상속한적이 없었기 때문이다. 
 * 실제는 아무런 클래스로 상속하지 않으면 자동으로 extends Object를 삽입해 Object 클래스를 상속한다. 
 * 
 * 따라서 자바의 모든 클래스는 어떤 객체로 만들든지 다음과 같이 Object 타입으로 선언할 수 있게된다.
 * Object oa = new A();
 * Object ob = new B();
 * 
 * 이것은 정말 중요한 장점이다. 메서드 오버로딩을 설명할 때 살펴본 System.out.print() 메서드를 다시 보자
 * print() 메서드는 다양한 타입을 출력하기 위해 여러 개의 입력매개변수 타입으로 오버로딩돼있다. 
 * 만일 10개의 타입을 출력하는 기능을 부여하려면 10개의 메서드로 
 * 오버로딩해 놓아햐 한다. 하지만 sysout은 new A() 와 같은 이 사용자가 만든 직접 만든 클래스 타입도
 * 출력할 수 있다는 것읻. 이것이 가능한 이유는 
 * System.out.print(Object x) 가 바로 그 해답이다. 
 * 즉 기본 자료형 이외에 Object 를 입력매개변수로 하는 print() 메서드를 오버로딩해 놓은 것이다. 
 * 
 * 
 * 10.6.1 Object 클래스의 주요 메서드 
 * 앞에서 이야기한 것처럼 Object 클래스는 자바의 최상위 부모 클래스다 이는 자바의 
 * 모든 클래스가 Object 클래스의 메서드를 포함하고 있다는 것을 의미한다. 그럼 대표적인 메서드를 알아보자 
 * 
 * String toString() 
 * 1.Object 객체의 정보 패키지.클래스명@해시코드
 * 2.일반적으로 오버라이딩해서 사용
 * 
 * boolean equals(Object obj) 
 * 1.입력 매개변수 obj 객체와 stack 메모리값 비교 
 * 2.등가 비교 연산자 == 와 동일한 결과 
 * 
 * int hashCode() 
 * 1.객체의 hashCode() 값 리턴 Hashtable HashMap 등의 동등 비교에 사용
 * 2.위칫값을 기반으로 생성된 고윳값 
 * 
 * 위 메서드들을 간략하게 설명하면 toString()은 객체 정보를 문자열로 출력하는 메서드이고,
 * equals(Object obj)는 등가 비교 연산과 동일하게 스택 메모리값을 비교한다. 
 * hashCode()는 객체의 위치 정보와 관련된 것으로 이후에 배우게 될 Hashtable이나 
 * HashMap 에서 동일 객체 여부를 판단할 때 사용된다. 
 */

public class 최상위_클래스_Object {

	public static void main(String[] args) {

	}

}
