package 월요일_첫번째문제;


class BankAccount{
	String name; //계좌주 이름
	int price; // 잔액
	static int totalCount = 0; // 총 계좌 수 
	
	BankAccount(String name,int price){
		this.name = name;
		this.price = price;
		BankAccount.totalCount++;
	}
	
	void printBalance() {
		System.out.println(this.name+"님 의 잔액은 "+this.price+"원 입니다.");
	}
	
	static void printTotal() {
		System.out.println("총 계좌의 갯수는 "+totalCount+"개 입니다.");
	}
}

public class 첫번째_문제 {
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount("김환", 65000);
		BankAccount a2 = new BankAccount("클로드", 30000);
		BankAccount a3 = new BankAccount("GPT", 29000);
		
		a1.printBalance();
		a2.printBalance();
		a3.printBalance();
		
		BankAccount.printTotal();
	}
}
