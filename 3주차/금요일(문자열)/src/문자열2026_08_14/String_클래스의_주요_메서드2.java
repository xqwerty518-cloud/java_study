package 문자열2026_08_14;

import java.util.Arrays;

public class String_클래스의_주요_메서드2 {

	public static void main(String[] args) {
		/**
		 * toLowerCase(): 영문 문자를 모두 소문자로 변환한다.
		 * toUpperCase(): 영문 문자를 모두 대문자로 변환한다.
		 * replace(): 일부 문자열을 다른 문자열로 대체한다.
		 * substring(): 문자열의 일부만을 포함하는 새로운 문자열 객체를 생성한다.
		 * split(): 특정 기호를 기준으로 문자열을 분리한다.
		 * trim():문자열의 좌우 공백을 제거한다.
		 * equals(): 두 문자열의 위칫값이 아닌 실제 데이터값을 비교한다. 이때 대소문자를 구분한다.
		 * equalslgnoreCase(): 두 문자열의 위치값이 아닌 실제 데이터값을 비교한다 이때 대소문자를 구분하지 않는다.
		 */
		
		//문자열 수정
		// toLowerCase, UpperCase
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		//replace();
		System.out.println(str1.replace("Study", "공부"));
		
		//subString
		System.out.println(str1.substring(0,5)); // 0부터 5까지의 문자열을 새로운 객체로 생성
		
		//split()
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray));
		
		//trim()
		System.out.println("     abc      ".trim());
		
		System.out.println();
		
		//문자열의 내용 비교
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		//Stack 메모리 비교(==): 위치 비교
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str2==str4);
		
		//equals, equalsIgnoreCase: 내용 비교
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
		
		
	}

}
