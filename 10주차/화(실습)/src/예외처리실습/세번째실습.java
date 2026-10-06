	package 예외처리실습;
	
	import java.util.Scanner;
	
	public class 세번째실습 {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			try {
				System.out.print("첫 번째 수 입력 : ");
				int a = Integer.parseInt(sc.next());
				System.out.print("두 번째 수 입력 : ");
				int b = Integer.parseInt(sc.next());
				
				System.out.println(a/b);
			}catch(NumberFormatException e){
				System.out.println("숫자를 입력해 주세요.");
			}catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}finally {
				System.out.println("프로그램 종료");
			}
		}
	
	}
