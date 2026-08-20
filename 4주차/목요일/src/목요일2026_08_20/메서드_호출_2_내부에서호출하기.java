package 목요일2026_08_20;

public class 메서드_호출_2_내부에서호출하기 {

	public static void main(String[] args) {
		/**
		 * 클래스 내부에서 메서드 호출하기
		 * 이제 클래스 내부에서 메서드 간에 상호 호출할 때를 살펴보자 클래스 내부에 있는 메서드 끼리는 객체를 생성하지 않고
		 * 서로를 호출할 수 있다. 말 그대로 같은 멤버이기 때문이다, 필드 또한 멤버이므로 클래스 내부의 모든 메서드 안에서 객체를 생성하지
		 * 자신이 속한 클래스의 필드를 사용할 수 있다, 다만 메서드 앞에 static이 붙어 있을 때는 static이 붙은 필드 또는 메서드만
		 * 호출할 수 있다. 이는 나중에 알아보기로 하고 여기서는 같은 멤버끼리는 클래스 내부에서 얼마든지 객체를 생성하지 않고 서로를
		 * 호출 할 수 있다는 사실만 기억하자. 
		 * 
		 * 다음 예를 살펴보자 main() 메서드 내에서 같은 클래스에 포함된 메서드를 객체 생성 과정 없이 바로 호출해 사용하고 있다는 것을
		 * 알 수 있다. 
		 * 
		 */
		
		print();
		int a = twice(3);
		System.out.println(a);
		double b = sum(a,5.8);
		System.out.println(b);
		
	}
	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int k) {
		return k * 2;
	}
	
	public static double sum(int m,double n) {
		return m+n;
	}
}
