package 연산자2026_08_04;

public class 비교_연산자 {

	public static void main(String[] args) {
		/**
		 * 비교 연산자는 크게 비교(<,>,>=,<=)와 등가비교(==, !=)로 나눌 수 있다. 연산 자료는 불리언 자료형 
		 * 즉 fals와 true 중 하나만 나타난다. 참고로 크거나 같다 작거나 같다 같지않다 와 같이 등호를 포함에 
		 * 2개의 연산부호가 연결됐을 때 등호는 항상 오른쪽에 위치하는데 이는 이후에도 계속 적용되는 사항이므로 꼭 기억하자.
		 * 
		 * 비교연산자에서 등가비교할때 비교 대상은 무엇이냐? 바로 스택 메모리의 값을 비교한다.
		 * 이것이 중요한 이유는 앞에서 배운것처럼 스택 메모리의 값이 기본 자료형일 때와 참조 자료형일 때가 서로 다르기 때문이다.
		 * 
		 */
		// 크기 비교
		System.out.println(5 < 2);
		System.out.println(5 > 2);
		System.out.println(5 <= 5);
		System.out.println(5 >= 5);
		System.out.println();
		
		int a = 5;
		int b = 2;
		int c = 5;
		
		//등가 비교
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a == c);
		System.out.println(a != c); 
		System.out.println();
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1 == str2);// 위치값이 다르기에 false
	}

}
