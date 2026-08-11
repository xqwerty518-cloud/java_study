package 배열2026_08_11;

import java.util.Arrays;

public class 반복문을_이용해_배열_데이터_읽기 {

	public static void main(String[] args) {
		/**
		 * 배열은 동일한 자료형을 여러 개 묶어 저장한다고 했다. 따라서 배열의 모든 데이터를 출력하려면 배열의 길이만큼 출력해야한다
		 * 
		 * 하지만 이건 아닌 듯하다 하나의 배열 데이터를 출려하기 위해 무려 100줄이나 소비했다. 어쩌면 그나마 배열의 길이가 100
		 * 이어서 다행인지도 모른다. 눈치챘겠지만 이럴 때 반복문을 사용하는것이다.
		 * 
		 * 배열의 길이
		 * 반복의 횟루를 결정하기 위해서는 먼저 배열의 길이를 알아야한다. 물론 배열을 생성할 때 길이가 결정도므로 그 길이만큼 
		 * 반복문을 수행하면 될 것이다. 하지만 많은 배열을 사용할 때 모든 배열의 길이를 일일이 외울 수도 없고 
		 * 외울 필요도 없다
		 * 자바는 배열 참조 변수 .length로 배열의 길이를 구할 수 있는 쉬운 방법을 제공한다. 여기서 포인트 연산자(.)는
		 * 해당 참조 변수가 가리키는 곳으로 가라는 의미다. length는 객체에 포함된 읽기 전용 속성으로
		 * 배열의 객체의 방 개수에 해당하는 값을 지닌다. 따라서 배열 참조 변수.length 를 풀어 설명하면
		 * "배열 참조 변수가 가리키는 곳에 가면 배열 객체가 있는데 그 배열의 방의 개수를 가져오라" 는 의미이다.
		 * 
		 */
		int[] a = new int[100];
		
		for(int i=0; i<a.length; i++) {
			a[i] = i;
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		/**
		 * for-each문을 사용하는 방법도 있다. for-each문은 배열이나 컬렉션 등의 집합 객체에서 원소들을 하나씩 떠내는 과정을
		 * 반복하는 구문으로 집합 객체의 원소들을 출력할 때 사용한다.
		 * 
		 * for(원소 자료형 변수명: 집합 객체) {} 
		 * 
		 */
		int[] a2 = new int[100];
		for (int i=0; i<a2.length; i++) {
			a2[i] = i;
		}
		for(int k : a2) {
			System.out.print(k+" ");
		}
		System.out.println();
		/**
		 * 배열의 각 원소 값을 출력하는 마지막 방법은 Arrays 클래스의 toString() 정적 메서드를 사용하는 것이다. 
		 * 아직은 클래스,메서드를 잘 모르겠고 더욱이 정적이란 말은 들어보지 못했을 수 있다. 지금 이 단계에서는
		 * System.out.println(Arrays.toString(1차원 배열 참조 변수)) 를 실행하면 모든 배열의 원소가 출력 된다는
		 * 것만 알아두자.
		 * 
		 */
		int[] array = new int[] {1,2,3,4,5};
		
		System.out.println(array.length); // 배열의 길이 구하기
		
		//출력 1
		System.out.print(array[0]+" ");
		System.out.print(array[1]+" ");
		System.out.print(array[2]+" ");
		System.out.print(array[3]+" ");
		System.out.print(array[4]+" ");
		System.out.println();
		
		//출력 2
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		//출력 3
		for(int k:array) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		//출력 4
		System.out.println(Arrays.toString(array));
	}

}
