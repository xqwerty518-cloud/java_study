package 조건문2026_08_05;

public class if_선택_제어문 {

	public static void main(String[] args) {
		/**
		 * if 문은 조건식에 따라 실행문의 실행 여부를 결정하는 선택 제어문이다. 기본적인 문법 구조는 크게 3가지 유형으로 나뉜다.
		 * 
		 * 유형 ① if 단일 구문
		 * 	먼저 유형 1은 조건식 1개 중괄호 1개가 있는 구조로 조건식 = true 일 때 중괄호 안을 실행하고 조건식 = false 일 때 
		 * 	중괄호 안을 실행하지 않는다.
		 */
		// 단일 if 구문
		if(5>3) {
			System.out.println("실행 0");
		}
		
		if(5<3) // 실행문이 한개일때는 중괄호 생략 가능 
			System.out.println("실행 X");
			System.out.println("실행 0"); // 컴파일러가 중괄호를 씌우는건 위 출력문까지만.
		
		int a = 3;
		if(a==3) {
			System.out.println("실행 0");
		}
		
		boolean b = false;
		if(b) {
			System.out.println("실행 x");
		}
		
		/**
		 * 유형 ② if-else문
		 * 	유형 2는 조건식 하나와 중괄호 2개가 있는 형태로 if구문의 조건식이 true일때는 if 구문의 중괄호가 실행 
		 * 	false일때는 else 구문의 중괄호가 실행된다. 모든 조건식은 true가 아니라면 false이므로 둘 중 하나는 반드시
		 * 	실행된다.
		 */
		//if-else구문
		if(5>3) {
			System.out.println("실행 0");
		}else {
			System.out.println("실행 X");
		}
		
		int c,d;
		c = 5; d = 0;
		if(c > 5) { // 5>5 XX else문으로 넘어가 d=20 실행
			d = 10;
		}else {
			d = 20;
		}
		System.out.println(d);
		
		// 삼항 연산자로 변환
		c=5; d=0;
		d = (c>5) ? 10 : 20;
		System.out.println(d);
		
		/**
		 * 유형 ③ if-else if-else 구문
		 * 	마지막으로 유형 3은 N개의 조건식과 N+1개의 중괄호를 포함하고 있는 형태로 if-else if-else의 구조이다
		 * 	중간의 else if 구문도 생략할 수 있으며 이를 생략하면 유형 ② 의 형태가 된다 물론 else 구문까지 생략하면 
		 * 	유형 ①의 형태가 될것이다. 
		 * 	else if구문은 개수에 상관 없이 추가 가능하다 단 반드시 기억해야할 내용은
		 *	조건식을 검색할때 항상 위에서부터 검사를 실행하며 처음으로 조건식이 true가 나오는 중괄호 블럭을 만나면 해당 블록의
		 *	중괄호를 실행하고 if문을 탈출 한다는 것이다. 
		 */
		//if-else if-else 구문
		// 90 이상 : A 80이상 ~ 90미만 : B 70이상~80미만 : C 70미만 : F
		int e = 85;
		
		if (e>=95) {
			System.out.println("A");
		}else if(e>=80) {
			System.out.println("B");
		}else if(e>=70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		int f = 85;
		if (f>=70) {
			System.out.println("C"); // 처음 조건문이 참이기에 C가 출력되고 if문 탈출 B학점인데도 C가 나오는 문제발생
		}else if(f>=80) {
			System.out.println("B");
		}else if(f>=90) {
			System.out.println("A");
		}else {
			System.out.println("F");
		}
		
		int g = 85;
		if (g >= 70 && g < 80) {
			System.out.println("C");
		}else if(g >=80 && g<90) {
			System.out.println("B");
		}else if(g >= 90) {
			System.out.println("A");
		}else {
			System.out.println("F");
		}
		
	}

}
