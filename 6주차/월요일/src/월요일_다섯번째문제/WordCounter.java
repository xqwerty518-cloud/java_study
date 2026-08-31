package 월요일_다섯번째문제;

public class WordCounter {
	// 문자열을 입력 받아 단어 수, 대문자 수,특정 문자 등장 횟수를 출력
	
	/**
	 * 공백 기준으로 단어 수 반환
	 * ex) Hello words java
	 * return 3;
	 * 
	 * 문자열을 공백을 기준으로 나눈뒤 길이를 잼
	 */
	 int countWords(String str) {
		
		return str.split(" ").length;
	}
	 
	 /**
	  * 대문자 개수 반환 
	  * @param str(문자열)
	  * @return 대문자 갯수 
	  * 
	  * 이 글자가 대문자인가? 맞다면 count +1
	  * 그렇다며 이 글자가 대문자 인지 어떻게 확인하냐?
	  */
	 int countUpper(String str) {
		 int count = 0;
		 
		 for(int i=0; i<str.length(); i++) {
			 
			 if(str.charAt(i) >='A' && str.charAt(i)<='Z') {
				 count++;
			 }
		 }
		 
		 return count;
	 }
	 
	 /**
	  * 특정 문자 등장 횟수 반환 
	  * @param str 문자열 
	  * @param c 특정 문자 
	  * @return 특정 문자 갯수 
	  */
	 int countChar(String str, char c) {
		 int count = 0;
		 
		 for(int i=0; i<str.length(); i++) {
			 if(str.charAt(i) == c) {
				 count++;
			 }
		 }
		 
		 return count;
	 }
}
