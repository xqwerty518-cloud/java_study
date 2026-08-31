package animals;

public class Dog {
	private String name;
	private int age;
	
	public Dog(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void bark() {
		System.out.println("멍멍! 나는 "+name+"이고 "+age+"살이야!");
	}
	
}
