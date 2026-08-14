package 배열2026_08_11;

import java.util.Arrays;

public class 참조변수와_배열객체의_값_초기화 {

	public static void main(String[] args) {
		/**
		 * 앞에서도 잠깐 언급한 바와 같이 스택 메모리 변수를 초기화하지 않으면 메모리 공간은 텅 비어 있다.
		 * 이 상태서는 해당 변수를 출력할 때 오류가 발생한다. 기본 자료현 변수이든 참조 자료형 변수이든 모든 변수는
		 * 스택 메모리에 위치하고 있다. 따라서 모든 변수는 초기화 이후에만 출력할 수 있다.
		 * 
		 * 기본 자료형 변수는 스택에 실제 데이터값을 저장하므로 초깃값 역시 실제 데이터값(0,-1,false 등) 을 저장한다.
		 * 반면 참조 자료형 변수는 실제 데이터의 위치를 저장하므로 초깃값으로는 실제 데이터값이 아닌 가리키고 있는 위치가 없음
		 * 을 나타내는 null 을 사용하면 된다.
		 */
		
		int value1;
		//System.out.println(value1); // 오류
		
		int[] value2;
		//System.out.println(value2); // 오류
		
		int value3 = 0; // 0으로 초기화
		System.out.println(value3);
		
		int[] value4 = null; // null로 초기화
		System.out.println(value4);
		
		System.out.println();
		
		// 힙 메모리의 초깃값(강제 초기화)
		boolean[] array1 = new boolean[3]; // false로 초기화
		for(int i=0; i<3; i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		
		int[] array2 = new int[3]; // 0으로 초기화
		for(int i=0; i<3; i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		
		double[] array3 = new double[3]; // 0.0으로 초기화
		for(int i=0; i<3; i++) {
			System.out.print(array3[i]+" ");
		}
		System.out.println();
		
		String[] array4 = new String[3]; // null로 초기화
		for(int i=0; i<3; i++) {
			System.out.print(array4[i]+" ");
		}
		System.out.println();
		
		//배열을 한 번에 출력하는 메서드
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
	}

}
