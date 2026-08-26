package bcd;

import abc.A;

public class D extends A {
	// a,b 사용 가능 
	
	public void print() {
		
		// 자식 클래스는 다른 패키지에 있어도 객체의 생성없이 protected 접근 지정자 필드까지 접근 가능 
		
		System.out.print(a +" ");
		System.out.print(b +" ");
		System.out.println();
	}
}
