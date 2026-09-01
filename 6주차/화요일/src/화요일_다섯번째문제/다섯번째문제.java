package 화요일_다섯번째문제;


class StringAnalyzer {
	private String text;

	StringAnalyzer(String text) {
		this.text = text;
	}

	String isPalindrome() {

		byte[] arr = text.getBytes();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				return "회문이 아닙니다.";
			}
		}
		return "회문입니다.";
	}

	/**
	 * a e i o u 가 문자열에 있는지 봐야함 비교하면서 모음이 있다면 count +=1
	 * 
	 * @return 모음의 갯수
	 */
	int countVowels() {
		int count = 0;
		byte[] arr = text.getBytes();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				count++;
			}
		}

		return count;
	}

	String reverse() {
		char[] arr = text.toCharArray(); // h e l l o
		char[] newArr = new char[arr.length];
		int num = 0;
		for (int i = arr.length-1; i >= 0; i--) {
			newArr[num] = arr[i];
			
			num++;
		}
		return String.valueOf(newArr);
	}
}

public class 다섯번째문제 {

	public static void main(String[] args) {
		StringAnalyzer s1 = new StringAnalyzer("hello");
		System.out.println(s1.isPalindrome());
		System.out.println(s1.countVowels());
		System.out.println(s1.reverse());

	}

}
