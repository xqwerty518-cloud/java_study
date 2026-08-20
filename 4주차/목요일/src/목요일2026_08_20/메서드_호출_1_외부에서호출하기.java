package 목요일2026_08_20;


class A{
	
	void print() {
		System.out.println("안녕");
	}
	
	int data() {
		return 3;
	}
	
	double sum(int a, double b) {
		return a+b;
	}
	
	void printtMonth(int m) {
		if(m < 0 || m > 12) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(m + "월입니다.");
	}
}

public class 메서드_호출_1_외부에서호출하기 {

	public static void main(String[] args) {
		/**
		 * 클래스 외부에서 메서드 호출하기
		 * 
		 * 메서드도 클래스의 멤버이므로 객체안에 존재할 것이고 클래스 외부에서 메서드를 사용하려면 먼저 객체를 생성해야 할것이다.
		 * 이어서 객체의 위치를 저장하고 이쓴ㄴ 참조 변수를 이용해 메서드를 호출해야한다. 다음 실습은 앞에서 알아본 4개의 메서드를
		 * 클래스 A에 구성하고 클래스 외부에서 클래스 A의 객체를 생성해 메서드를 호출하는 예다.
		 * 
		 * 이 실습에서 알 수 있는것 처럼 리턴타입이 void인 메서드의 경우 리턴되는 값이 없어 그대로 메서드만 호출하지만
		 * 리턴값이 있는 메서드는 일반적으로 리턴되는 값을 저장할 수 있는 변수를 선언해 대입한다. 물론 리턴값을 저장하지 않아도 
		 * 문법 오류는 발생하지 않는다 다만 리턴값이 필요해 그 메서드를 호출했을 것이므로 일반적이지 않다.
		 * 
		 * 
		 */
		
		A a = new A();
		
		a.print();
		int k = a.data();
		a.data();
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result);
		a.printtMonth(5);
		a.printtMonth(15);
	}

}
