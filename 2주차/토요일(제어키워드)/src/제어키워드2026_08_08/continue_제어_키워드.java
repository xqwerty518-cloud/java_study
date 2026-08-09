package 제어키워드2026_08_08;

public class continue_제어_키워드 {

	public static void main(String[] args) {
		/**
		 * continue는 반복 제어문의 닫힌 중괄호 역할을 하는 제어 키워드다. 반복 제어문은 조건식이 true가 돼 
		 * 실행 구문을 실행한 후 닫힌 중괄호를 만나면 다시 다음 반복을 위해 증감식을 수행하거나 조건식을 검사한다.
		 * 즉 반복문은 실행도중 continue를 만나면 실행해야 할 코드가 남아 있더라도 마치 닫힌 중괄호를 만난 것처럼 다음 반복을
		 * 위해 증감식을 수행하거나 조건식을 검색한다는 말이다. 따라서 continue는 주로 반복 과정에서 특정 구문을 실행하지 않고
		 * 건너 뛰고자 할 때 사용한다.
		 */
		
		for(int i=0; i<10; i++) {
			continue;
			//System.out.println(i); 오류 
		}// continue가 대체하는 중괄호
		
		for(int i=0; i<10; i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					continue;
				}
				System.out.println(i+", "+j);
			}
		}
		System.out.println();
		/**
		 * j=3일때 continue가 실행되면 출력 구문의 실행 없이 바로 증감식으로 이동해 값이 j=4로 변경된다 이후에는
		 * 정상적인 이중 for문이 수행된다. 
		 * 
		 * continue도 label문법을 사용할 수 있으며 이때 해당 레이블이 붙은 반복문의 닫힌 중괄호의 역할을 수행해
		 * 한 번에 여러 반복문을 건너뛸 수 있다. 
		 */
		
		POS1:
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(j==3) {
						continue POS1;
					}
					System.out.println(i+", "+j);
				}
			}
		/**
		 * 바깥쪽 for문에 POS1 레이블을 지정해 놓은 후 이중 for문 내부에서 j=3 일 때 continue POS1이 실행되도록
		 * 했다. 이때 continue가 대체하는 중괄호는 레이블이 가리키고 있는 바깥 쪽 for문의 닫힌 중괄호 이므로 i++의 증감식으로
		 * 바로 이동할 것이다. 따라서 이때 바깥쪽 for문은 i값이 0,1,2,3,4총 5회 j는 0,1,2로 총 3회 반복할것이다.
		 */
	}

}
