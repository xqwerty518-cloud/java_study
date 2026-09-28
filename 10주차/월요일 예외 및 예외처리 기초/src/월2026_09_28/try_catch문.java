package 월2026_09_28;

/**
 * try : 예외가 날 수 있는 코드 예외가 난 줄에서 바로 멈추고 그 아래줄은 실행 X
 * 
 * catch : 소괄호 안 타입에 해당하는 예외만 처리함. 예외가 났을 때만 실행 
 * 
 * finally : 항상 실행되고 생략할 수 있음. 아래 예제처럼 try와 catch에 똑같은 코드가
 * 			 중복될 때 여기로 뺀다고 생각하면 된다. 
 * 
 * 예외처리 구문이 있다면 예외가 나도 프로그램이 종료되지 않는다. 
 * 
 * 내부 처리과정
 * 1. 3/0에서 예외 발생을 자바 가상 머신이 인지
 * 2. 자바가상머신이 new ArithmeticException() 객체 생성 
 * 3. 그 객체를 catch의 소괄호에 매개변수로 전달 
 * 
 * 받아줄 캐치가 없으면 처리가 안돼서 프로그램 종료 
 * 
 * 
 * 다중 캐치와 순서 규칙 
 * 
 * 캐치는 위에서부터 검사를 한다 if-else if랑 똑같은 구조 
 * Exception을 맨 위에 두면 모든 예외가 거기서 걸려서 아래 캐치는 도달이 불가능한 코드가
 * 됨 그래서 컴파일 오류가 난다 자식예외를 먼저 Exception은 맨 마지막에 써야 한다. 
 * 
 * 처리 내용이 같으면 | 로 묶을 수 있다. 
 * 
 * 한번의 try에서 실행되는 catch는 최대 1개이다. 
 * 
 * 
 */

public class try_catch문 {

	public static void main(String[] args) {
		try {
		    System.out.println(3 / 0);           
		    // 여기서 예외 발생 → 바로 catch로 이동
		    System.out.println("프로그램 종료");     
		    // 실행 안 됨
		} catch (ArithmeticException e) {
		    System.out.println("숫자는 0으로 나눌 수 없습니다.");
		    e.printStackTrace();
		    // e는 자바가상머신이 만들어서 넘겨준 예외 객체를 가리키는 참조 변수다.
		    // e.printStackTrace()는 예외가 어디서 발생했는지 알려준다. 
		} finally {
		    System.out.println("프로그램 종료");     
		    // 예외가 나든 안 나든 항상 실행
		}
		
		System.out.println();
		
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("A10");
		}catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀수 없습니다");
		}catch (Exception e) {
			System.out.println("if 문의 else{}와 같은 역할");
		}finally {
			System.out.println("프로그램 종료");
		}
		
		System.out.println();
		
		try {
			System.out.println(3/0);
			int num = Integer.parseInt("A10");
		}catch(ArithmeticException | NumberFormatException e) {
			System.out.println("예외 처리");
		}finally {
			System.out.println("프로그램 종료");
		}
		// 이때 |로 묶는것은 서로 부모-자식 관계이면 안된다. 
	}

}
