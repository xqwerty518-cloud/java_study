package 조건문2026_08_06;

public class while_반복_제어문 {

	public static void main(String[] args) {
		/**
		 * while 반복 제어문 while 문도 중괄호 안의 실행 구문을 반복적으로 실행하는 반복 제어문으로 소괄호 안의 조건식이 true인 동안
		 * 반복은 지속된다. while 반복 제어문의 기본 문법 구조는 다음과 같다
		 * 
		 * 초기식; // 필수는 아니지만 대부분 사용 while(조건식){ 실행구문; 증감식; }
		 * 
		 * 여기서 초기식과 증감식은 불필요할때 생략할 수 있지만 for문과 비교하기 위해 기본 문법구조에 포함시켜 놓았다. 여기서 주의해야 할 점은
		 * 초기식은 while 문 실행 이전에 정의돼야 하고 증감식은 중괄호 안에 있어야 for문과 동일한 수행을 하게 된다는 것이다. 가끔 실수로
		 * 초기식을 중괄호 안에 넣으면 매 반복마다 초기화돼 원하지 않는 무한 루프에 빠질 수 있다.
		 * 
		 * while문의 실행 순서는 먼저 조건식을 검사하고 조건식이 true일 때 중괄호 안의 실행 구문을 실행한다. 이후 닫힌 중괄호를 만나면
		 * 다시 조건식을 검사하며 이와 같은 과정을 조건식이 거짓이 될때까지 반복된다. while문이 종료되는 시점은 닫힌 중괄호가 아닌 조건식이다
		 * 이상의 과정을 정리하면 일반적으로 while문은 반복 횟수를 정하지 않고 특정 조건까지 반복하고자 할 때 주로 사용한다. 예를 들어
		 * 자연수를 순서데로 더해 합계가 처음으로 100보다 커지는 때의 숫자와 합계를 알고 싶을 때 while문을 사용할 수 있다.
		 * 
		 * 
		 */
		int num = 0, sum = 0;
		while (sum < 100) {
			sum += num;
			num++;
		}
		System.out.println((num - 1) + "까지의 합 = " + sum);
		
		int a = 0;
		while(a<10) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int b = 10;
		while(b>0) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println();
		
		for(int i=10; i>0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int c =0;
		while(true) {
			if(c>10) {
				break;
			}
			System.out.print(c+" ");
			c++;
		}
	}

}
