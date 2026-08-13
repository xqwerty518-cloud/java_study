package 목요일2026_08_13;

public class main메서드의_입력매개변수 {

	public static void main(String[] args) {
		/**
		 * 그동안의 예제를 작성하면서 기계적으로 작성했던 main() 메서드를 살펴보면 다음과 같이 입력 매개변수가 
		 * 배열의 형태를 띤다는것을 알 수 있다.
		 * 
		 * 즉 자바 코드를 실행하면 자바 가상 머신은 가장 먼저 main() 메서드를 실행하는데 이때 개발자는 
		 * main() 메서드를 실행하는데 필요한 자료를 배열 타입으로 넘겨 줄 수 있다. 그동안은 한 번도
		 * 데이터를 넘겨 준적이 없으므로 아무런 데이터도 전달되지 않았을 것이다. 
		 * 
		 * 입력 매개변수의 각 원소는 공백 문자로 구분되며, 모든 원소는 입력매개변수가 String[]이므로 문자열로 인식된다.
		 * 따라서 앞에서 입력한 매개변수에 따라 배열 ar에는 다음과 같이 값이 전달된다.
		 */
		
		String a = args[0];
		String b = args[1];
		String c = args[2];
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//String이므로 문자열이 연결돼 출력
		System.out.println(b+1); 
		System.out.println(c+1);
		
		int d = Integer.parseInt(b); //String -> int 변화
		double e = Double.parseDouble(c); // String -> double 변화
		System.out.println(d+1); // int+int 이므로 값이 더해짐
		System.out.println(e+1); // double+int이므로 실수로 출력
		
		/**
		 * 타입 변화 메서드
		 * 
		 * 문자열 -> 정수 : Integet.parseInt(문자열)
		 * 문자열 -> 실수 : DOuble.parseDouble(문자열)
		 * 정수 -> 문자열 : String.valueOf(정수)
		 * 실수 -> 문자열 : String.valueOf(실수)
		 */
	}

}
