package 화요일_네번째문제;

class MathUtils {

	static boolean isPrime(int n) {
		// 1. n이 1보다 작거나 같으면 소수가 아님 (false 반환)

		// 2. 2부터 n의 제곱근(Math.sqrt(n))까지 반복하면서 나누어떨어지는지 확인
		// 만약 나누어떨어지는 수가 있다면 소수가 아님 (false 반환)

		// 3. 위 조건들을 다 통과했다면 소수임 (true 반환)

		if (n <= 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}

		return true;
	}

	static int gcd(int a, int b) {
		// 최대 공약수 계산 (반복문 사용)
		// 유클리드 호제법
		// 1. 큰 수를 작은 수로 나눈 나머지를 구한다.
		// 2. 이제 기존의 작은 수를 방금 구한 나머지로 다시 나눈다.
		// 3. 이 과정을 0이 될때까지 반복 한다.
		// 4. 나머지가 0이 되었을때 나누는 수로 사용된 숫자가 최대공약수 이다.

		// 우선 a든 b든 뭐가 가장 큰 수인지 모르니 가장 큰수를 정하는 반복문 부터 만들어야 한다.

		int max=0;
		int min=0;;
		int remainder = 0;
		
		if(a>b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}

	
		remainder = max % min; // 우선 큰 값과 작은값을 나눈뒤 나머지를 저장 

		for (int i = 0; true; i++) {

			if (min % remainder != 0) { // 나머지가 0이 아니라면  
				int newRemainder = min % remainder; 
				//작은값과 제일 첫번째로 구한 나머지를 나눈뒤 나온 나머지를 저장(임시저장)
				min = remainder ; 
				// 제일 작은값은 첫번째로 구한 나머지 값이 됨 ( 두번째~.... 도 마찬가지)
				remainder = newRemainder; 
				// 원래 나머지 값을 위에서 구한 나머지 값으로 
				// 이과정을 반복 
 
			} else {
				return remainder;
				// 그러다 작은값과 나머지로 나눴을때 나머지 값이 0이라면 마지막으로 나눈 나머지 값을 리턴
			}

		}
	}
	
	static int factorial(int n) {
		
		int fac = 1;
		
		for(int i = n; i>0; i--) {
			fac *= i; 
			
		}
		
		return fac;
	}
}

public class 네번째문제 {

	public static void main(String[] args) {
		
		System.out.println(MathUtils.isPrime(7));
		System.out.println(MathUtils.gcd(12, 18));
		System.out.println(MathUtils.factorial(5));

}
}
