package abc;

public class B {
	// a,b,c 사용 가능
	
	public void print() {
		A a = new A();
		
		System.out.print(a.a+" ");
		System.out.print(a.b+" ");
		System.out.print(a.c+" ");
		//System.out.println(a.d+" "); // private 접근 지정자로 지정된 필드는 접근 불가능 
		System.out.println();
	}
}
