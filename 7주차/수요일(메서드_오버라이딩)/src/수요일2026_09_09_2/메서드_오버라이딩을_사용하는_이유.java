package 수요일2026_09_09_2;

/**
 * 10.3.2 메서드 오버라이딩을 사용하는 이유
 * 메서드 오버라이딩은 왜 사용하는 것일까? 다음 예를 보면 직관적으로 이해할 수 있다. 
 * 먼저 부모 클래스로 Animal 클래스를 생성하고 이 클래스를 상속받는 자식 클래스로
 * Bird cat Dog 클래스를 생성했다. 
 * 
 * 4개의 클래스 모두 cry() 메서드를 포함하고 있다. Animal 클래스 내부에 cry() 메서드는 
 * 아무런 내용도 포함되고 있지 않으며 나머지 자식 클래스에는 각각 자신만의 울음소리를 출력하는 내용이 들어있다. 
 * 이제 부모 클래스를 포함해 모든 클래스의 객체를 선언하고 각각의 
 * 타입을 객체의 타입과 일치시켜 놓았다. 이 때 각각의 객체에 cry() 메서드를 실행하면 당연히 각각의 울음소리가 
 * 출력될 것이다. 
 * 
 * 이번에는 다형적 표현을 사용해 각각의 자식 클래스 타입으로 객체를 생성하고 이를 모두를 부모 클래스 타입으로 
 * 선언했다. 
 * 
 * 이떄 참조 변수 ab ac ad는 모두 Animal 타입이지만 각각 서로 다른 메서드로 오버라이딩 됐으므로
 * 각각의 cry() 메서드는 서로 다른 출력 결과를 보인다. 
 * 여기서 꼭 알아야 할것은 Animal 클래스 내부에 아무런 기능을 수행하지 않는 cry() 메서드가 있는 이유다.
 * 다형적 표현으로 자식 클래스들의 객체를 부모 클래스인 Animal 타입으로 선언할 수는 있지만 
 * 이렇게 되면 Animal 내부에 메서드만 사용할 수 있다. 즉 만일
 * Animal 클래스 내부에 cry() 메서드가 없었다면 어떤 참조 변수도 cry() 메서드를 호출할 수 없을 것이다. 
 * 이것이 바로 아무런 기능도 수행하지 않는데도 Animal 클래스 내부에 cry() 메서드를 넣어둔 이유다.
 *  
 */

class Animal{
	void cry() {
		
	}
}

class Bird extends Animal{
	void cry() {
		System.out.println("짹쨱");
	}
}

class Cat extends Animal{
	void cry(){
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍 ");
	}
}

public class 메서드_오버라이딩을_사용하는_이유 {

	public static void main(String[] args) {
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();
		ad.cry();
		ac.cry();
		ab.cry();
		System.out.println();
		//이렇게 모든 객체를 부모 타입 하나로 선언하면 다음처럼 배열로 한번에 관리할 수 있다는 장점이 있다. 
		Animal[] animals = new Animal[] {new Bird(), new Cat(), new Dog()};
		
		for(Animal animal:animals)
			animal.cry();
	}

}
