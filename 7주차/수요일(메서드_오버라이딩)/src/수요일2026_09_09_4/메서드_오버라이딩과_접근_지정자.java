package 수요일2026_09_09_4;

/**
 * 10.3.4 메서드 오버라이딩과 접근지정자
 * 자식 클래스가 부모 클래스의 메서드를 오버라이딩할 때는 반드시 상속받은 메서드의 접근 지정자와 범위가 
 * 같거나 넓어야 한다 즉 접근 지정자의 범위를 좁힐 수 없다는 말이다 예를 들어 부모 클래스의 메서드가 
 * default 접근 지정자를 포함하고 있을 때 자식 클래스는 default 접근 지정자와 같거나 큰 범위의 
 * 접근 지정자 즉 public protected default 접근 지정자만 사용할 수 있다. 
 */

class A{
	protected void abc() {}
}
class B extends A{
	public void abc() {}
}
class B2 extends A{
	protected void abc() {}
}
class B3 extends A{
	//void abe() {} // default 접근 지정자(좁아져서 불가능)
}
class B4 extends A{
	//private void abc() {} // private 접근 지정자(좁아져서 불가능)
}

public class 메서드_오버라이딩과_접근_지정자 {

	public static void main(String[] args) {
		
	}

}
