package 배열2026_08_11;

import java.util.Arrays;

public class 참조_자료형으로서_배열의_특징 {

	public static void main(String[] args) {
		 /**
		  * 지금까지 배운 배열에 관한 지식만으로도 충분히 기본 자료형과 참조 자료형의 차이를 이해할 수 있다.
		  * 이를 위해 기본 자료형과 참조 자료형에서 변수를 복사할 때를 비교해 보자 먼저 대입 연산자를 이용해 변수가 복사되는 과정을
		  * 이해해야 한다 변수의 복사라는 말에는 목적어가 빠져 있다. 변수의 어떤 값을 복사한다는 의미일까? 바로 변수에 포함돼 있는
		  * 스택 메모리의 값이다 그런데 기본자료형과 참조 자료형이 스택 메모리에 저장하는 값의 의미가 다르므로 자연스럽게 둘 사이에
		  * 차이가 발생하는 것이다.
		  * 먼저 기본 자료형을 살펴보자 기본 자료형은 스택 메모리에 실제 데이터값을 저장하고 있으므로 기본 자료형 변수를 복사하면
		  * 실제 데이터값이 1개 더 복사된다 이후 복사된 값을 아무리 변경해도 원본 값은 아무런 영향을 받지 않는다.
		  * 
		  * 그럼 이번에는 참조 자료형을 살펴보자 참조 자료형은 스택 메모리에 실제 데이터값이 아닌
		  * 힙 메모리에 저장된 객체의 위치를 저장하고 있다. 따라서 참조 자료형 변수를 복사하면 
		  * 실제 데이터가 복사되는것이 아니라 실제 데이터의 위치값이 복사된다 따라서 하나의 참조 변수를 이용해
		  * 데이터를 수정하면 다른 참조 변수가 가리키는 데이터도 변하게 되는 것이다.
		  */
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println();
		
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1;
		array2[0] = 5;
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
	}

}
