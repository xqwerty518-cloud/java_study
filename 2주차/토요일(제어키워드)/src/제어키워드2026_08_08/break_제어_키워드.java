package 제어키워드2026_08_08;

public class break_제어_키워드 {

	public static void main(String[] args) {
		/**
		 * break는 if문을 제외한 가장 가까운 중괄호를 탈출 하는 제어 키워드다 이미 switch문에서 살펴본 적이 있는데
		 * 그때는 switch문을 탈출하기 위한 용도로 사용했다. 일반적으로 break는 반복문에서 특정 조건을 만족할 때 반복문을
		 * 탈출하는데 사용한다. 다음 예를 살펴보자.
		 */
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			break;
		}
		
		/**
		 * 10회 반복을 수행하는 for 문 내부에 break가 포함돼 있다. 반복문이 실행되는 과정에서 break를 만나면 if 문을 
		 * 제외하고 가장 가까운 중괄호를 탈출하라는 의미이므로 for문을 탈출할것이다. 즉 for문의 반복 횟수와 단 하나의 출력만
		 * 실행되고 for문이 종료될것이다.
		 * 그런데 한 번만의 값을 출력하고 싶다면 굳이 for문을 쓸 필요가 없다 그래서 break 키워드만 사용되는 때는 거의 없으며
		 * 일반적으로 다음예제와 같이 if문과 함께 사용해 특정 조건이 만족될 때 반복문을 탈출하도록 구성하는것이 일반적이다.
		 */
		for(int i=0; i<10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		/**
		 * 여기서 꼭 기억해야 하는 점은 break를 이용해 탈출하는 것은 if 문을 제외한 가장 가까운 중괄호 하나라는것이다.
		 * 따라서 이중으로 중복된 for 문 내에서 break을 사용할 때 안쪽 for문만 탈출하게 된다.
		 */
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(j==3) {
					break;
				}
				System.out.println(i+", "+j);
			}
		}
		System.out.println();
		/**
		 * j가 3이 돼 break를 만나면 탈출하는 반복문은 안쪽의 for문이다. 
		 */
		
		/**
		 * break로 다중 반복문을 한 번에 탈출하는 자바의 공식적인 방법은 break+Label(레이블) 문법이다.
		 * break 다음에 레이블을 지정하면 한 번의 여러 개의 다중 반복문을 탈출 할 수 있다.
		 * 레이블명은 개발자가 임의로 지을 수 있으며 레이블 다음에는 반드시 콜론을 표시해야한다.
		 */
		out:
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(j==3) {
					break out;
				}
				System.out.println(i+", "+j);
			}
		}
	}

}
