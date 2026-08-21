package 금요일2026_08_21;

/**
 * 생성자와 객체의 생성방법
 * 생성자의 모양에 따라 객체를 생성하는 방법이 결졍된다.
 * 어떤 클래스 안에 기본 생성자만 있다면 기본 생성자 모양으로만 객체를 생성할 수 있고 int형을 입력매개변수로 포함하고 있는 생성자만
 * 있다면 int형 값을 받는 생성자를 호출해야만 객체를 만들 수 있다. 생성자도 메서드처럼 오버로딩을 할 수 있다.
 * 즉 메서드처럼 생성자의 입력매개변수 자료형이나 개수에 따라 여러개의 생성자를 정의할 수 있다. 
 */

class D{
	D(){
		System.out.println("첫 번째 생성자");
	}
	
	D(int a){
		System.out.println("두 번째 생성자");
	}
	
	D(int a , int b){
		System.out.println("세 번째 생성자");
	}
}

public class 생성자와_객체의_생성방법 {

	public static void main(String[] args) {
		D d1 = new D();
		D d2 = new D(3);
		D d3 = new D(3,5);
	}

}
