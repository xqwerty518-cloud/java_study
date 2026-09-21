package 목요일;

/**
 * - 클래스명: Book - 필드: title(String), price(int), static int totalBooks 
 * - 생성자:
 * title, price 입력받아 초기화, totalBooks 1 증가 
 * - 메서드: applyDiscount(int percent) →
 * price를 할인율만큼 깎기, static getTotalBooks() 
 * - main에서 책 3권 만들고 1권 할인 적용 후 전체 책 수와
 * 할인된 가격 출력
 */

class Book {
	String title;
	int price;
	static int totalBooks;

	Book(String title, int price) {
		this.title = title;
		this.price = price;
		Book.totalBooks++;
	}

	double applyDiscount(double percent) {
		percent = percent/100;
		return price * (1 - percent);
	}

	static int getTotalBooks() {
		return Book.totalBooks;
	}

}

public class 세번째문제 {

	public static void main(String[] args) {
		Book b1 = new Book("사피엔스", 29000);
		Book b2 = new Book("클로드의 모든것", 33000);
		Book b3 = new Book("김환의 모든것", 17500);

		System.out.printf("가격:%.0f\n",b2.applyDiscount(100));
		System.out.println(Book.getTotalBooks());

	}

}
