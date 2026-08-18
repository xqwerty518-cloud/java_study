package 화요일2026_08_18;

class C{
	boolean b;
	int i;
	double d;
	String s;
	
	void work1() {
		int k;
		//System.out.println(k); <- 초깃값 없이 출력을 시도해 오류 발생 
		System.out.println(b);
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
	}
}

public class 필드와_지역변수의_초깃값 {

	public static void main(String[] args) {
		/**
		 * 필드와 지역 변수의 초깃값
		 * 
		 * 필드와 지역 변수의 또 다른 차이점은 초깃값이다. 필드는 직접 초기화 하지 않아도
		 * 강제로 초기화 된다. 반면 지역 변수는 직접 초기화하지 않으면 저장 공간이 빈 공간 그대로 있어 
		 * 값을 출력하고자 할때 오류가 발생한다. 이는 사실 필드와 지역변수의 차이가 아니라 각각이 
		 * 위치하는 메모리 영역의 특징이다. 힙 메모리에는 빈 공간이 저장될 수 없기 때문에 힙 메모리에 
		 * 위치하는 필드는 강제로 초기화되는 것이고 스택 메모리는 강제로 초기화되지 않으므로 여기에 저장되는
		 * 지역 변수 또한 그 특징을 지니고 있는 것이다.
		 */
		
		C c = new C();
		c.work1();
	}

}
