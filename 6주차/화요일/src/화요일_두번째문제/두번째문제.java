package 화요일_두번째문제;

class Counter{
	static int totalCount; // 전체 카운트 개수
	private int value; // 각 카운터의 현재 값 
	
	Counter(){
		value = 0;
		totalCount++;
	}
	
	void increase() {
		value++;
	}
	
	static int getTotalCount() {
		return totalCount;
	}
	
	int getValue() {
		return value;
	}
}

public class 두번째문제 {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
		c1.increase();
		c1.increase();
		System.out.println(c1.getValue());
		System.out.println(Counter.getTotalCount()+"\n");
		
		c2.increase();
		c2.increase();
		System.out.println(c2.getValue());
		System.out.println(Counter.getTotalCount()+"\n");
		
		c3.increase();
		c3.increase();
		System.out.println(c3.getValue());
		System.out.println(Counter.getTotalCount());
	}

}
