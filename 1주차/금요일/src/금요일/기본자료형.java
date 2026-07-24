package 금요일;

public class 기본자료형 {
	/**
	 * 기본 자료형에는 참과 거짓을 저장하는 boolean, 정수를 저장하는 byte, short, int, long
	 * 실수를 저장하는 float과 double 그리고 문자를 저장하는 char 자료형이 있다.
	 * 
	 * boolean : 1바이트 : true,false
	 * byte : 1바이트 : 책으로 확인
	 * short : 2바이트
	 * int : 4바이트
	 * long : 8바이트
	 * float : 4바이트
	 * double : 8바이트
	 * char : 2바이트 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		/**
		 * 소수점: float은 7자리 double은 15자리 까지 가능
		 * float과 double의 정밀도 비교
		 */
		
		float f1 = 1.0000001f ;
		System.out.println(f1);
		float f2 = 1.000000001f ; // 오차 발생 
		System.out.println(f2);
		
		double f3 = 1.000000000000001;
		System.out.println(f3);
		double f4 = 1.0000000000000000; // 오차 발생
		System.out.println(f4+"\n");
		
		/**
		 * 자바에서는 반드시 지켜야 하는 규칙이 1개 있다. 항상 대입(=) 연산자를 중심으로 양쪽의 자료형이 똑같아야한다.
		 * 만일 자료형이 같지 않다면 오류가 발생한다. 그렇다면 코드에서 직접 숫자로 쓴 3은 어떤 자료형일까?
		 * 코드에 직접 작성한 값을 리터럴 이라고 하는데 위에 나와있는것 처럼 3을 저장할 수 있는 자료형이 4개나 있어서 컴파일러는
		 * 해당 값의 자료형을 그중 하나로 정해야 한다. 정수 리터럴의 기준은 크게 2가지로 나뉜다
		 * 첫 번째는 byte와 short 자료형에 저장할 수 있는 범위 내의 정숫값이 입력 됐을때이다.
		 * 이떄 정수 리터럴은 각가의 자료형 즉 byte 또는 short 자료형으로 인식 한다 이와 반대로 저 두개에 저장할 수 없는
		 * 범위의 정수 리터럴은 모두 int 자료형으로 인식한다. 크기에 상관 없이 int, long에 정수 리터럴을 입력할때도
		 * int 자료형으로 인식한다 다만 정수 리터럴 뒤에 long 을 나타내는 L또는l을 붙여 표기하면 long 자료형으로 인식한다. 
		 * 
		 * byte a = 3; > byte로 인식
		 * long a = 3L; > long으로 인식
		 * byte a = 500; > 오류 
		 * 
		 * 그럼 여기서 한가지 궁금증이 생긴다
		 * 
		 * long a = 3; 은 오류가 날것인가? 왜냐면 정수 리터럴은 모두 int형으로 인식한다고 했지 않았는가
		 * 정답은 아니다이다. 바로 컴파일러가 자동 타입 변환을 수행하기 때문이다. 
		 * 
		 * 자바는 실수 리터럴은 double 자료형으로 인식한다 위와 마찬가지로 float형은 F나f를 붙여주면 float으로 인식한다.
		 * 
		 * 문자 자료형
		 * char는 문자를 저장하는 자료형으로 문자를 작은따옴표 안에 표기한다. char 자료형은 정수를 저장할 수도 있지만 앞에서 
		 * 배운 정수 자료형 4가지와 다소 차이가 있다. 'A'라는 묹를 char 자료형 안에 저장하기 위해 코드를 char a = 'A'
		 * 와 같이 작성했다면 메모리에는 변수 a의 공간이 만들어지고 그 안에 문자가 들어가야 할 것이다. 하지만 메모리에는
		 * 문자를 기록 할 수 없다 메모리는 2진수 값만 저장할 수 있는 공간이기 때문이다. 
		 * 그렇다면 문자를 어떻게 저장할까? 바로 모든 문자를 특정 정숫값으로 바꿔 저장하는 것이다.
		 * 자바는 세상의 모든 문자에 정숫값을 매겨 놓은 표를 사용하는데 이를 유니코드표라고 한다.
		 * 즉 문자를 저장할때 이 유니코드표를 보고 그 문자에 해달하는 정수로 바꿔 메모리에 저장한다. 이와 반대로 문자를 읽을 때는 
		 * 정수를 읽어와서 그 정수에 해당하는 문자를 출력한다.
		 * 따라서 char에 문자에 해당하는 정숫값을 직접 입력해도 똑같은 결과를 얻을 수 있다. 
		 * 이것이 바로 char 자료형에 정수를 저장할 수 있는 이유다. 
		 */
		
		char a = 'A'; // 문자
		char b = 65; // 10진수
		char c = 0b1000001; // 2진수
		char d = 00101; // 8진수
		char e = 0x0041; // 16진수
		char f = '\u0041'; // 유니코드 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f+"\n");

		 // 자바에서의 진법 변환 방법
		 /**
		  * 10진수 : 숫자 (int a = 11 -> 10진수 11)
		  * 2진수 : 0b+숫자(int b = 0b11 -> 10진수 3)
		  * 8진수 : 0+숫자 (int c = 011 -> 10진수 9)
		  * 16진수 : 0x+숫자 (int d = 0x11 -> 10진수 17)
		  */
		
		int data = 10;
		
		System.out.println(Integer.toBinaryString(data)); //10진수 -> 2진수
		System.out.println(Integer.toOctalString(data)); //10진수 -> 8진수
		System.out.println(Integer.toHexString(data)+"\n"); //10진수 -> 16진수
		
		System.out.println(Integer.parseInt("1010",2)); // 2진수 -> 10진수
		System.out.println(Integer.parseInt("12",8)); // 8진수 -> 10진수
		System.out.println(Integer.parseInt("a",16)); // 16진수 -> 10진수


	}
}
