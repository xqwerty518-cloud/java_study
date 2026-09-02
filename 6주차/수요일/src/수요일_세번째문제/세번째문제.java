package 수요일_세번째문제;

import java.util.Random;

class TicketBooth {
	static int totalTicketsSold; //전체 판매량
	private String movieName;
	private int soldCount;
	
	 TicketBooth(String movieName) {
		// TODO Auto-generated constructor stub
		this.movieName = movieName;
		this.soldCount = 0;
	}
	
	/**
	 * 티켓을 파는 메서드 
	 * @param count
	 */
	void sellTicket(int count){ 
		soldCount+=count;
		totalTicketsSold+=count;
	}
	
	/**
	 * 전체 판매량을 반환하는 메서드 
	 * @return
	 */
	static int getTotalSold() {
		return totalTicketsSold;
	}
	
	int getsoldCount() {
		return soldCount;
	}
}

public class 세번째문제 {
	public static void main(String[] args) {
		TicketBooth m1 = new TicketBooth("스파이더맨");
		TicketBooth m2 = new TicketBooth("호프");
		
		Random r = new Random();
		
		int randomCount = r.nextInt(100)+1;
		int randomCount2 = r.nextInt(100)+1;
		
		m1.sellTicket(randomCount);
		m2.sellTicket(randomCount2);
		
	
		
		System.out.println(m1.getsoldCount());
		System.out.println(m2.getsoldCount());
		System.out.println(TicketBooth.totalTicketsSold);
	}
}
