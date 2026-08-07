package 조건문2026_08_07;

public class do_while_반복_제어문 {

	public static void main(String[] args) {
		/**
		 * do-while문은 while문과 매우 비슷한 반복 제어문으로 조건식의 검사와 반복 실행의 순서에서만 차이가 있다.
		 * 일단 do-while문의 기본 문법 구조를 살펴보자
		 * 
		 * 초기식;
		 * do{
		 * 	실행구문;
		 * 	증감식;
		 * } while(조건식) ;
		 * 
		 * 다른 제어문들과 달리 조금 특이하게 생겼는데 do{...}whule(조건식); 의 형태로 마지막이 중괄호로 끝나지 않으므로
		 * 제어문들 중에는 유일하게 세미콜론을 붙여야 한다. 초기식과 증감식은 while문에서 설명한것처럼 생략할 수 있지만
		 * for문이나 while문과의 상관 관계를 잘 이해할 수 있도록 기본 문법 구조에 포함시켜 놓았다. 실행과정을 살펴보면 일단
		 * do 구문을 실행한 이후 조건식을 검사한다. 조건식이 참이면 다시 do 구문을 실행하고 거짓이면 제어문을 탈출한다.
		 * 
		 * 최초 1회는 무조건 실행구문 실행
		 * 단계 A: 실행구문
		 * 단계 B: 조건식(참) -> 실행구문
		 * 단계 C: 조건식(거짓) -> 종료
		 * 
		 * do-while문이 while문 보다 1회 더 실행된다고 생각할 수 있는데 절대 그렇지 않다. 
		 * 변숫값을 하나씩 따져보면 알수 있겠지만 while문이 0,1,2... 반복 할때
		 * do-while문은 1,1,2,3....을 반복하는것일 뿐이다.
		 */
		
		int a;
		a=0;
		while(a<0) {
			System.out.print(a +" ");
			a++; 
		}// 실행횟수 0번
		
		System.out.println();
		
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<0); // 실행횟수 1번
		
		System.out.println();
		
		a=0;
		while(a<10) {
			System.out.print(a +" ");
			a++; 
		}// 실행횟수 0번
		
		System.out.println();
		
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<10); // 실행횟수 1번
		
		System.out.println();
				
	}

}
