package 조건문2026_08_05;

public class switch_선택_제어문 {

	public static void main(String[] args) {
		/**
		 * switch 문은 점프 위치 변숫값에 따라 특정 위치로 이동해 구문을 실행하는 선택 제어문이다.
		 * 점프할 수 있는 위치는 'case 위칫값:' 으로 설정한다 이렇게 콜론 문자가 붙은 값은 이동할 위치를 가르키는
		 * 일종의 팻말 역할을 한다고 생각하면 된다. case 구문말고 default 구문도 포함될 수 있는데 이는 if문의 else구문과
		 * 비슷한 기능으로 일치하는 위칫값이 없을때 점프할 위치를 나타낸다. default 구문은 생략할 수 있다.
		 */
		
		int a = 2;
		switch(a) {
		case 1:
			System.out.println("A");
		case 2: // switch(a)에 따라 case 2로 이동한 후 차례대로 구문 실행
			System.out.println("B"); // 실행됨
		case 3: 
			System.out.println("C"); // 실행됨
		default:
			System.out.println("D"); // 실행됨
		}
		
		System.out.println();
		/**
		 * break 제어 키워드를 사용한다면 else-if문처럼 사용이 가능하다. 
		 * 여기서는 break는 if문을 제외한 가장 가까운 중괄호를 탈출하는 키워드라고 외워두자.
		 */
		
		switch(a) {
		case 1:
			System.out.println("A");
			break;
		case 2: 
			System.out.println("B"); // 실행됨
			break; // switch문을 탈출
		case 3:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}
		/**
		 * 애초에 case 구문 문법을 만들때 break 기능을 포함하면 좋았을 텐데 라고 생각하는 사람도 있을것이다.
		 * 하지만 의도적으로 break를 빼고 프로그램을 작성할때도 있다 예를 들어서
		 * 10점 만점에 7점 이상은 pass를 출력하고 나머지는 fail을 출력하고자 할때를 생각해보자.
		 */
		
		a = 8;
		switch(a) {
		case 10:
			System.out.println("pass"); break;
		case 9:
			System.out.println("pass"); break;
		case 8:
			System.out.println("pass"); break;
		case 7:
			System.out.println("pass"); break;
		default:
			System.out.println("fail");
		}
		/**
		 * 한 눈에 봐도 중복 코드가 많아 비효율적으로 보인다 각 case 구문에서 pass 또는 fail을 출력하는 명령 
		 * 하나만 수행하므로 이 정도이지 만약 case 구문마다 수십가지 작업을 수행한ㄷ마ㅕㄴ 코드의 중복은 더욱 심해질 것이다. 
		 * 이렇게 case 구문마다 break를 붙이는 대신 다음 예와 같이 하나의 실행문에 여러 case를 지정하면 훨씬 간결하게 
		 * 코드를 작성할 수 있다. 
		 */
		
		switch (a) {
		case 10: 
		case 9:
		case 8:
		case 7:
			System.out.println("pass"); break;
		default :
			System.out.println("fail");
		}
		/**
		 * switch 문은 위치값으로 정수,문자,문자열만 사용할 수 있는 반면 if문ㅇ느 조건식에서 다양한 비교 연산자 논리 연산자를
		 * 쓸 수 있으므로 효율성에는 차이가 날 수 있지만 기본적으로 switch문은 if문과 상호 변환할 수 있다. switch문과 if문의
		 * 동작 원리를 알면 변환자체는 그리 어려운 일이 아닐 것이다. 다음 예는 switch문으로 작성된 코드를 동이한 기능을 수행하는 
		 * if문으로 변환한 코드다.
		 */
		
		switch(a) {
		case 10:
		case 9:
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		default:
			System.out.println("D");
		}
		
		if (a>=9) {
			System.out.println("A");
		}else if(a==8) {
			System.out.println("B");
		}else if(a==7) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		/**
		 * 그렇다면 switch 문과 if 문 사이에는 어떤 성능 차이가 있을까? 답을 먼저 말하면 전체적인 속도의 차이는 거의 없다고 보면 된다.
		 * 다만 각 결과에 따른 속도 차이는 날 수 있는데 예를 들어 위 예제의 if문에서 A가 출력될 때는 1개의 조건식만 검사한 후 출력되지만
		 * C나 D가 출력될 때는 3개의 조건식을 비교한 후에 출력된다. 따라서 100만개의 A 출력과 100개의 C 출력 사이에 속도 차이가 발생 할 수 있다.
		 * 반면 switch 문일 때 A를 출력하든 C나 D를 출력하든 동일하게 한 번의 점프만을 수행한 후 실행되므로 모든 출력 속도가 
		 * 동일 하다는 장점이 있다 하지만 조건식의 검사 속도가 워낙 빠른데다 한 번에 수백만 개의 데이터를 처리하는 상황이 아니라면
		 * 어느 것을 사용해도 상관없다.
		 */
		
		
	}

}
