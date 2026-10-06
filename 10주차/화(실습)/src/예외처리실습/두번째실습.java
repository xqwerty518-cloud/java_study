package 예외처리실습;

public class 두번째실습 {
	public static void main(String[] args) {
		
		
		try {
			System.out.println(3/0);
		
		}catch (ArithmeticException e) {
			System.out.println("불가능한 연산입니다.");
		}catch (Exception e) {
			 System.out.println("예외처리를 해주세요");
		}finally {
			System.out.println("컴파일 에러 발생");
		}
	}
}
