package 예외처리실습;

class A{
	
}
class B extends A{
	
}

public class 첫번째실습 {

	public static void main(String[] args) {
		
		
		try {
			System.out.println(3/0);
		}catch (ArithmeticException e) {
			System.out.println("불가능한 연산입니다.");
		}
		
		try {
			A a = new A();
			B b = (B)a;
		}catch (ClassCastException e) {
			System.out.println("캐스팅 불가능");
		}
		
		try {
			int arr[] = {1,2,3};
			arr[3] = 3;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스의 길이를 벗어났습니다");
		}
		
		try {
			int num = Integer.parseInt("10!");
		}catch (NumberFormatException e) {
			System.out.println("숫자를 적어주세요");
		}
		
		try {
			String str = null;
			System.out.println(str.charAt(2));
		}catch (NullPointerException e) {
			System.out.println("null!");
		}
	}

}
