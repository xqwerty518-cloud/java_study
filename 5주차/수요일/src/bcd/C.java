package bcd;

import abc.A;

public class C {
	// a 사용 가능 
	
	public void print() {
		A a = new A();
		
		System.out.print(a.a+" ");
		// 다른 패키지 내의 클래스에서는 자식 클래스가 아닐 때는 public 접근 지정자만 사용 가능 
		System.out.println();
	}
}
