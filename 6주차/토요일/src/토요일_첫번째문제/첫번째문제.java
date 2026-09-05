package 토요일_첫번째문제;

class Libaray {
	private String[] bookTitles;
	private boolean[] isBorrwed;

	Libaray(int size) {
		bookTitles = new String[size];
		isBorrwed = new boolean[size];
	}

	void addBook(String title) {
		for (int i = 0; i < bookTitles.length; i++) {
			if (bookTitles[i] == null) {
				bookTitles[i] = title;
				isBorrwed[i] = false;
				break;
			}
		}
	}

	boolean borrowBook(String title) {
		for (int i = 0; i < isBorrwed.length; i++) {
			if (bookTitles[i].equals(title)) {
				isBorrwed[i] = true;
				return true;
			}
		}
		return false;
	}
	
	int getAvailableCount() {
		int count = 0; 
		for(int i=0; i<isBorrwed.length; i++) {
			if(bookTitles[i] != null && !isBorrwed[i]) {
				count++;
			}	
		}
		return count;
	}
}

public class 첫번째문제 {

	public static void main(String[] args) {
		Libaray l1 = new Libaray(5);
		
		l1.addBook("사피엔스");
		l1.addBook("상관없는거 아닌가");
		l1.addBook("난 몰라");
		l1.addBook("난 몰라유");
		l1.addBook("난 몰라부렀어유");
		
		l1.borrowBook("사피엔스");
		
		System.out.println(l1.getAvailableCount());
	}

}
