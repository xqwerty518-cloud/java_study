package 월요일_2026_09_07;

/**
 * 10.1.3 상속 문법
 * 클래스를 상속할 때는 extends 라는 키워드를 사용하며, 클래스명 다음에 extends 부모 클래스를 표기한다
 * 
 * class 자식 클래스 extends 부모 클래스 {
 * 
 * }
 * 
 * 자바의 클래스는 다중 상속이 불가능 한데 여기서 다중 상속은 부모 클래스가 2개 이상일때를 말한다.
 * 
 * 왜 다중 상속을 허용하지 않을까? 다음과 같이 클래스 A와 클래스 B를 클래스 C가 다중 상속 할때를 고려하자
 * 클래스 A와 클래스 B는 모두 data 필드를 포함하고 있으며 값은 각각 3과 4이다 상속을 하면 부모의 필드를 
 * 모두 내려받는다고 했으므로 클래스 C 내부에도 data 필드가 있을 것이다. 
 * 그렇다면 클래스 C의 data 필드에는 어떤 값이 들어갈까? 만일 A 클래스의 값이 적용되면 3 
 * B 클래스의 값이 적용되면 4가 저장될 것이다. 즉 이렇게 다중 상속을 허용하면 모호성이 발생한다. 
 * 이것이 바로 다중 상속을 허용하지 않는 이유다.
 * 
 * 간혹 혼동하는 때가 있는데 다음처럼 자식 클래스가 많은 것은 다중 상속이 아니다.
 * 즉 자식 클래스는 100개이든 1000개이든 상관 없다. 다시 한번 말하지만 부모 클래스가 2개 이상일때가 
 * 불가능 한것이다. 
 * 
 * 클래스를 상속하는 방법을 알아봤으므로 이제 앞에서 다뤘던 대학생과 직장인 예시를 직접 상속 문법을 적용해 
 * 코드로 작성해 보자 
 */

class Human{
	String name;
	int age;
	void eat() {
		
	}
	void sleep() {
		
	}
}

class Student extends Human{
	int studentID;
	void goToSchool() {
		
	}
}

class Worker extends Human{
	int workerID;
	void goToWork() {
		
	}
}

public class 상속_문법 {

	public static void main(String[] args) {
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "김민성";
		s.age = 16;
		s.studentID = 128;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		Worker w = new Worker();
		w.name = "김환";
		w.age = 22;
		w.workerID = 20231213;
		w.eat();
		w.sleep();
		w.goToWork();
	}

}
