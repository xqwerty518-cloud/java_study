package 토2026_09_12_3;

/**
 * equals(Object obj) - 스택메모리의 값 비교 
 * equals 는 입력매개변수로 넘어온 객체와 자기 객체의 스택 메모리 변숫값을 비교해 그 결과를 true
 * 또는 false로 리턴하는 메서드다 기본 자료형이 아닌 객체의 스택 메모리값을 비교하므로 실제 데이터의 값이 아닌
 * 실제 데이터의 위치를 비교하는 것이다. 
 * 즉 등가 비교 연산과 완벽하게 동일한 기능을 수행한다. 
 * 
 */

class A {
	String name;
	A(String name){
		this.name = name;
	}
}
/**
 * 클래스 A는 name 필드 1개를 포함하고 있으며 생성자를 이용해 이 필드값을 초기화한다. 
 * 이후 A aa1 = new A("안녕"), A aa2 = new A("안녕") 과 같이 동일한 필드값을 포함하고 있는
 * 2개의 객체를 생성해보자 
 * 객체 내부의 값은 동일하지만 실제 객체는 다른 곳에 위치하므로 위칫값을 나타내는 스택 메모리
 * 값은 서로 다르다 따라서 모두 false가 나온다. 
 * 만일 실제 내용을 비교하고자 할때는 equals 메서드를 오버라이딩해 사용해야 한다. 
 */


class B{
	String name;
	B(String name){
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			if(this.name == ((B) obj).name)
				return true;
		}
		return false;
	}
}
/**
 * 메서드의 내부에서는 자신의 name값과 입력받은 객체의 name값을 비교해 동일하면 true
 * 동일하지 않으면 false를 리턴했다. 이 과정에서 자신의 객체 타입을 일치시키기 위해
 * 캐스팅을 할 수 있는지를 확인하는 instanceof 키워드와 다운 캐스팅을 사용했다. 
 * 이렇게 되면 클래스의 B의 equals는 이제 위칫값이 아니라 내용을 비교하게 된다. 
 * 따라서 bb1.equals(bb2)는 true를 반환하게 된다. 
 */

public class equals메서드 {

	public static void main(String[] args) {
		A aa1 = new A("안녕");
		A aa2 = new A("안녕");
		System.out.println(aa1.equals(aa2));
		System.out.println(aa1 == aa2);
		
		B bb1 = new B("방가");
		B bb2 = new B("방가");
		System.out.println(bb1 == bb2);
		System.out.println(bb1.equals(bb2));
		
	}

}
