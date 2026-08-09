package 일요일2026_08_09;

public class 복습 {

	public static void main(String[] args) {
		/**
		 * 산술 연산자
		 * 		10 + 3 = 13 // 더하기
		 * 		10 - 3 = 7 // 빼기
		 * 		10 * 3 = 30 // 곱하기
		 * 		10 / 3 = 3 // 나누기(소수점 버림)
		 * 		10 % 3 = 1 // 나머지만
		 * 
		 * 증감 연산자
		 * 		int a = 5;
		 * 		++a; // 먼저 1 올리고 그 값 사용
		 * 		a++; // 먼저 값 사용 후 1 올리기 
		 * 
		 * 비교 연산자 
		 * 		10 == 10 // true (같으면)
		 * 		10 != 3 // true (다르면)
		 * 		10 > 3 // true (크면)
		 * 		10 < 3 // true (작으면)
		 * 		10 >= 3 // true (크거나 같으면)
		 * 		10 <= 9 // true (작거나 같으면)
		 * 
		 * 논리 연산자
		 * 		true && true // true (둘 다 true여야)
		 * 		true && false // false
		 * 		true || true // true (하나만 true여도)
		 * 		false || false // false
		 * 		!true // false (반대로)
		 * 		!false // true 
		 * 
		 * 대입 연산자
		 * 		int a = 10;
		 * 		a+=5 // a = 15
		 * 		a-=5 // a = 5
		 * 		a*=2 // a = 20
		 * 		a/=2 // a = 5
		 * 		a%=3 // a = 1
		 * 
		 * 삼항 연산자 
		 * 		int a = 10, b=20;
		 * 		int max = (a>b) ? a : b // max = 20
		 * 
		 * 비트 연산자
		 * 		5 & 3 // 101 & 011 = 001 = 1 (둘 다 1이여야 1)
		 * 		5 | 3 // 101 | 011 = 111 = 7 (둘 중 하나만 1이여도 1)
		 * 		5 ^ 3 // 101 ^ 011 = 110 = 6 (다르면 1)
		 * 		~3 // 00000011 -> 11111100 = -4 (앞자리 0-> 음수 1-> 양수)
		 * 		3 << 1 // 00000011 -> 00001100 = 6 (*2 효과)
		 * 		-8 >> 1 // 11111000 -> 11111100 = -4 (/2 효과 부호 유지)
		 * 		-8 >>> 1 // 11111000 -> 01111100 = 큰 양수 (무조건 0으로 채움)
		 * 		
		 * 		
		 */
		
		int a = 3, b = 5;
		int result = (a++ + ++b) * 2;
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
		
		a = 10;
		if (a % 3 == 0) {
		    System.out.println("A");
		} else if (a % 2 == 0) {
		    System.out.println("B");
		} else {
		    System.out.println("C");
		}
		
		for (int i = 1; i <= 10; i++) {
		    if (i % 2 == 0) continue;
		    if (i == 7) break;
		    System.out.println(i);
		}
		
		int i = 0;
		while (i < 5) {
		    i++;
		    if (i == 3) continue;
		    System.out.println(i);
		}
		
		a = 5; b = 3;
		String result1 = (a > b) ? ((a % b == 0) ? "나누어짐" : "안나누어짐") : "b가 더 큼";
		System.out.println(result1);
	}

}
