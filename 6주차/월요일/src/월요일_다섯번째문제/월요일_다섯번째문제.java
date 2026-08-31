package 월요일_다섯번째문제;

public class 월요일_다섯번째문제 {

	public static void main(String[] args) {
		WordCounter str = new WordCounter();
		
		System.out.println(str.countWords("Hello Words Java"));
		System.out.println(str.countUpper("Hello Words Java"));
		System.out.println(str.countChar(""
				+ "안녕하세요 저는 김환입니다 그리고 현재"
				+ "클로드에게 도움을 받아 문제를 풀고 있어요"
				+ "내일은 알바를 쉬기때문에 오늘 공부가 끝나면 푹 쉬어줄 예정입니다."
				+ "클로드가 공부를 도와주고 이렇게 문제를 내줘서 참 고마워요"
				+ "이렇게 공부를 하니깐 문제가 풀리는것도 신기하고 그렇습니다."
				+ "과연 이 문제는 완벽한! 정답일지 궁급합니다."
				+ "저는 특정 문자를 다 라고 쓸 예정입니다.",'다'));

	}

}
