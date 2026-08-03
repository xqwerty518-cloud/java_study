package 연산자2026_08_03;

public class 시프트연산자 {

	public static void main(String[] args) {
		/**
		 * 시프트 연산자는 비트의 위치를 좌우로 이동하는 연산으로 산술 시프트(<<,>>)와 논리시프트(>>>)가 있다.
		 * 
		 * 산술시프트는 숫자의 부호 비트는 유지하면서 나머지 비트를 왼쪽(<<) 또는 오른쪽(>>) 으로 이동하는 연산자이다.
		 * 
		 * << 연산을 수행하면 부호 비트를 제외한 나머지 전체 비트가 왼쪽으로 이동하므로 1bit 이동할때마다 X2의 효과가 있다.
		 * 반변 >> 연산을 수행하면 부호 비트를 제외한 나머지 전체 비트가 오른쪽으로 이동하므로 1bit 이동할때 마다 /2의 효과가 있다
		 * 
		 * 여기서 주의해야 할 점은 이동한 이후에 발생하는 빈칸이다 빈칸을 채우는 방식은 시프트 방향에 따라 다르다.
		 * <<연산일 때 빈칸이 오른쪽에 생기면 0으로 빈칸을 채운다 반면 >> 연산일때 빈칸은 왼쪽 부호 비트 다음에 생기며 이때는
		 * 부호 비트값과 동일한 값으로 채운다 
		 * 
		 * 
		 * 논리 시프트는 부호 비트를 포함해 전체 비트를 오른쪽으로 이동시키는 연산으로 빈칸은 모두 0으로 채운다.
		 * 부호 비트까지 이동시키므로 부호 비트가 1인 음수일 떄 논리 시프트 이후에는 값이 양수로 변할 것이다.
		 * 이러한 논리 시프트는 3번째 비트는 사운드 on/off 여부를 나타내고 4번째 비트 위치는 자동완성 on/off를 의미한다.
		 * 와 같이 각 비트 위치에서의 값만이 의미가 있을때 주로 사용하는 연산이므로 숫자의 크기나 부호는 의미가 없다. 
		 * 일반적으로 논리 시프트를 이용해 각 비트값을 알아내는 법은 다음과 같다.
		 * 
		 */
		
		int flags = 0b10110110;
		System.out.println(flags >>> 0 & 1);
		System.out.println(flags >>> 1 & 1);
		System.out.println(flags >>> 2 & 1);
		System.out.println(flags >>> 3 & 1);
		System.out.println(flags >>> 4 & 1);
		System.out.println(flags >>> 5 & 1);
		System.out.println(flags >>> 6 & 1);
		System.out.println(flags >>> 7 & 1);
		System.out.println();
		
		//산술 시프트
		System.out.println(3 << 1);
		System.out.println(-3 << 1);
		System.out.println(3 << 2);
		System.out.println(-3 << 2);
		System.out.println();
		
		System.out.println(5 >> 1);
		System.out.println(-5 >> 1);
		System.out.println(5 >> 2);
		System.out.println(-5 >> 2);
		System.out.println();
		
		//논리 시프트 
		System.out.println(3 >>> 1);
		System.out.println(-3 >>> 31);
	}

}
