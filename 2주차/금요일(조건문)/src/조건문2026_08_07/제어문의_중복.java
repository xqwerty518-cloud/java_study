package 조건문2026_08_07;

public class 제어문의_중복 {

	public static void main(String[] args) {
		/**
		 * 앞에서 5개의 제어문을 살펴봤다. 각 제어문 내부에는 또 다른 제어문을 포함할 수 있다. 예를 들어
		 * if문 내부에 if문 switch문 내부에 for문 for문 내부에 for문 등 제어문을 얼마든지 중복해 사용할 수 있다.
		 */
		
		//if-if중복
		int value1 = 5;
		int value2 = 3;
		
		if(value1 > 5) {
			if(value2 < 2){
				System.out.println("실행1");
			}
			else {
				System.out.println("실행2");
			}
		}else {
			System.out.println("실행3");
		}
		System.out.println();
		
		//switch-for중복
		int value3 = 2;
		switch(value3) {
		case 1:
			for(int k=0; k<10; k++) {
				System.out.print(k +" ");
			}
			break;
		case 2:
			for(int k = 10; k>0; k--) {
				System.out.print(k +" ");
			}
			break;
		}
		System.out.println();
		System.out.println();
		
		//for-for-if 중복
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.println(i +" "+ j);
				if(i==j) {
					System.out.println("i = j");
				}
			}
		}
	}

}
