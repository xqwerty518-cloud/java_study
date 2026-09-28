package 월2026_09_28;

class A {
	
}

class B extends A{
	
}

/**
 * 14.1 예외
 * 
 * 개발자가 프로그램을 작성하는 과정에서 실수를 하거나 사용자가 잘못된 값을 입력하면 
 * 오류가 발생할 수 있다. 다양하게 발생하는 오류 중 개발자가 해결할 수 있는 오류를
 * 예외 이러한 예외가 발생했을 때 이를 적절히 처리하는 것을 예외 처리 라고 한다. 
 * 
 * 예외와 에러의 차이점
 * 자바에서 제공하는 예외처리 메커니즘을 이해하기 전에 예외와 에러의 의미를 정리할 
 * 필요가 있다. 먼저 예외는 연산 오류 숫자 포맷 오류 등과 같이 상황에 따라 
 * 개발자가 해결할 수 있는 오류를 말한다. 여기서 해결할 수 있는 의 의미는
 * 오류 자체를 수정할 수 있다는 것이 아니라 오류가 발생했을 때 차선책을 선택하는 것을
 * 말한다. 반면 에러는 자바 가상머신 자체에서 발생하는 오류로 개발자가 해결할 수 없는 오류를 말한다.
 * 
 * 상속구조 
 * Object -> Throwable -> Error , 
 * Exception(일반 예외들이 이 클래스를 상속) 
 * -> RuntimeException(실행 예외들이 이 클래스를 상속)
 * 
 * 일반예외 vs 실행예외 (핵심 차이)
 * 
 * 일반예외 : 검사 시점: 컴파일 전에 검사 , 처리 안하면 : 문법 오류(컴파일 불가)
 * 
 * 일반 예외의 검사는 예외가 실제로 발생하는지 보는게 아니라 
 * 예외가 발생할 수 있는 문법을 썼는지 검사하는 것이다. 
 * -
 * 실행예외 : 검사 시점: 실행할 때 발생 
 * 		 , 처리 안하면 : 컴파일은 되는데 실행중 터지면 프로그램 강제 종료 
 * 
 * 
 * 
 * 실행예외 5가지 
 * 
 * ArithmeticException : 연산 자체가 불가능 할 때 (대표적인 예 : 분모가 0)
 * 
 * ClassCastException : 불가능한 다운캐스팅 
 * 
 * ArrayIndexOutOfBoundsException : 인덱스가 0~(길이-1)을 벗어날 때
 * 
 * NumberFormatException :
 * Integer.parseInt("10!")처럼 숫자가 아닌 문자열을 변환할 때
 * 
 * NullPointerException : null인 참조변수로 필드나 메서드를 쓸 때
 * 
 * 일반 예외 5가지 
 * 
 * InterruptedException
 * 
 * ClassNotFoundException
 * 
 * IOException
 * 
 * FileNotFoundException
 * 
 * CloneNotSupportedException
 * 														
 */

public class 예외처리_기초 {

	public static void main(String[] args) {
		
		
		// 1. ArithmeticException
		System.out.println(3/0);
		
		// 2. ClassCastException
		A a = new A();
		B b = (B)a;
		
		// 3. ArrayIndexOutOfBoundsException
		int array[] = {1,2,3};
		System.out.println(array[3]);
		
		// 4. NumberFormatException
		int num = Integer.parseInt("10!");
		
		// 5. NullPointerException
		String str = null;
		System.out.println(str.charAt(2));
		
		
	}

}
