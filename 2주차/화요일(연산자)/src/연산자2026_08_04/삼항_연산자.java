package 연산자2026_08_04;

public class 삼항_연산자 {

	public static void main(String[] args) {
		/**
		 * 삼항 연사는 다음과 같이 자바 연산자중 유일하게 3개의 피연산자가 있는 연산자다
		 * 
		 * 삼항 연산자의 구성
		 * (참 또는 거짓) ? 참일 때 연산 결과 : 거짓일 때 연산 결과
		 * 물음표(?) 앞에는 불리언 자료형인 참 또는 거짓만 올 수 있으며 불리언 자료형이 직접 올 수 있지만 
		 * 주로 연산 결과가 불리언 자료형인 논리 연산자와 비교 연산자가 위치 한다. 
		 * 이 값이 참일때 콜론의 앞쪽 거짓일 때는 뒤쫏이 연산결과가 된다.
		 */
		
		int value1 = (3>5) ? 6:9;
		System.out.println(value1);
		
		int value2 = (5>3) ? 10 : 20;
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println((value3 % 2 ==0 )? "짝수" : "홀수");
		
		//cf. if-else구문으로 변환
		if(value3%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}

}
