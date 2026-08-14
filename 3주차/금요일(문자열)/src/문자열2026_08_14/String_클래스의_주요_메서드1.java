package 문자열2026_08_14;

import java.util.Arrays;
import java.util.Scanner;

public class String_클래스의_주요_메서드1 {

	public static void main(String[] args) {
		/**
		 * String 클래스는 문자열의 길이, 문자열 검색 문자열 변환 및 연결 문자열 수정이나 내용 비교 등
		 * 매우 풍부한 메서드를 제공한다 가장 대표적인 메서드를 소개한다.
		 * 
		 *   
		 * 문자열 길이  int  length() 					문자열의 길이 
		 * 
		 * 문자열 검색  char charAt(int index) 			인덱스 위치에서의 문자
		 * 
		 * 			int  indexOf(int ch)            문자열에 포함된 문자 또는 문자열의 위치를 앞에서부터 
		 * 			     indexOf(int ch,fromIndex)	검색했을때 일치하는 인덱스 값(fromlndex는 검색 시작 위치)
		 * 				 indexOf(String str)
		 *               indexOf(String str,fromIndex)
		 *               
		 * 		    int  lastIndex(int ch)			문자열에 포함된 문자 또는 문자열의 위치를 뒤에서부터
		 * 			     lastIndex(int ch fromIndex)검색했을 때 일치하는 인덱스 값
		 * 				 lastIndex(String str)
		 * 			     lastIndex(String str,fromIndex)
		 * 
		 * 문자열		float String.valueOf(boolean b) boolean, char, int, long, float, double 값
		 * 변환 및			  String.valueOf(char c)	 을 문자열로 변화기 위한 정적 메서드
		 * 검색			  String.valueOf(int i)
		 * 	 			  String.valueOf(long l)
		 * 				  String.valueOf(float f)
		 * 				  String.valueOf(double d)
		 * 
		 * 			double concat(String str)        문자열 연결(String 객체의 +연산과 동일)
		 * 
		 * 문자열 		byte[] getBytes()				 문자열을 byte[]로 변환
		 * 배열			   getBytes(Charset charset)				 
		 * 변환		char[] toCharArray()			 문자열을 char[]로 변환
		 */		
		
		// 문자열 길이
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println();
		
		// 문자열 검색
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1)); //한글 영문 구분 없이 인덱스 1위치의 문자
		System.out.println();
		
		//indexOf(), lastIndexOf
		System.out.println(str1.indexOf('a')); // 앞에서부터 첫 번째 a가 위치한 인덱스
		System.out.println(str1.lastIndexOf('a')); // 뒤에서부터 첫 번째 a가 위치한 인덱스
		System.out.println(str1.indexOf('a',8)); 
		System.out.println(str1.lastIndexOf('a', 8));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));
		System.out.println(str1.indexOf("Bye")); //해당 문자(열)이 없는 경우 -1 리턴
		System.out.println(str2.lastIndexOf("고맙습니다"));
		System.out.println();
		
		//문자열 변환 및 연결
		// @String.valueOf(기본 자료형)
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		//@concat(): 문자열 변환
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		String str6 = "안녕" + 3;
		String str7 = "안녕".concat(String.valueOf(3));
		
		//문자열을 byte[] 또는 char[]로 변경
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";
		
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		//toCharArray(): 문자열 -> char[] 변환
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		

		
	}

}
