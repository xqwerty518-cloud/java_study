package 수요일_네번째문제;

class TextProcessor{
	private String[] words;
	
	TextProcessor(String words){
		this.words = words.split(" ");
	}
	
	String getLongestWord() {
		
		int leng =  words[0].length();
		String word = words[0];
		
		for(int i=0; i<words.length; i++) {
			if(words[i].length() > leng) {
				leng = words[i].length();
				word = words[i];
			}
		}
		
		return word;
	}
	
	String getShortestWord() {
		
		int leng =  words[0].length();
		String word = words[0];
		
		for(int i=0; i<words.length; i++) {
			if(words[i].length() < leng) {
				leng = words[i].length();
				word = words[i];
			}
		}
		
		return word;
	}
	
	/**
	 * n보다 긴 단어 갯수 반환 
	 * @param n
	 * @return
	 */
	int countWordsLongerThan(int n) {
		int count = 0;
		for(int i=0; i<words.length; i++) {
			if(words[i].length() > n) {
				count++;
			}
		}
		return count;
	}
}

public class 네번째문제 {
	public static void main(String[] args) {
		TextProcessor words = new TextProcessor("The quick brown fox jumps over lazy dog");
		System.out.println(words.getLongestWord());
		System.out.println(words.getShortestWord());
		System.out.println(words.countWordsLongerThan(4));
		
	}
}
