package 수요일;

public class 문자열ㅡ여섯번째 {

	public static void main(String[] args) {
		System.out.println("화면 출력");
		System.out.println(3 + 5 + " 화면");
		
		System.out.println();

		int a = 5;
		String b = "공부하기 존나 싫다";
		
		System.out.println(a);
		System.out.println(a+5);
		System.out.println(b+" 시발");
		
		System.out.println();
		
		System.out.printf("%d\n",30);
		System.out.printf("%o\n",30);
		System.out.printf("%x\n",30);
		System.out.printf("%s\n","시발");
		System.out.printf("%f\n",30.123792183671824);
		System.out.printf("%1.5f\n",1.12371289361287412);





	}

}

/**
 * 문자열을 String 자료형으로 저장되며 값의 표현은 "안녕" 등과 같이 큰따옴표 안에 표기해야 
 * 한다 문자열과 기본 자료형을 더하면 다시 문자열이 되며 연산결과는 문자열을 연결한 형태가 된다
 *  -> "안녕" + 3 -> 안녕3이 출력
 * System.out.println 은 줄바꿈 메서드이다.
 * System.out.print 1줄로 출력이 된다.
 * \n은 줄바꿈이 실행된다 
 * -> Sysoutln 과 sysout(1+"\n")은 같은 기능이다.
 * 
 * System.out.printf 는 형식대로 출력하기고 기본 형식은 
 * -> System.out.printf("출력 포멧" , 인자, 인자); 의 형태이다
 * 출력 포멧 내에 % 로 시작하는 위치는 인자로 값이 넘어오는 위치이며 출력 타입은 % 다음에 나오는 문자에 따라 결정된다
 * 
 * %d %o %x는 각각 정수를 넘겨 받아 10진수 8진수 16진수로 출력한다 
 * %s 와 %f 는 각각 문자열과 실수를 인자로 넘겨받아 출력한다.
 * %f로만 출력할 때는 소수점 아래의 자릿수가 여러개 표현되는데 이를 정형화 하는 방법으로 
 * %전체 자릿수 + . +소수점 자릿수 + f = %4.2f 처럼 표하는데 해석 하자면 전체 자릿수를 4자리로 하고 소수점 아래로는 2자리
 * 까지 표현하라는 뜻이다. 
 */
