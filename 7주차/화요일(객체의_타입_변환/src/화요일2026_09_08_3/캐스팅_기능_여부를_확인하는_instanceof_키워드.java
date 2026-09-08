package 화요일2026_09_08_3;

/**
 * 10.2.4 캐스팅 기능 여부를 확인하는 instanceof 키워드 
 * 캐스팅 할 수 있는지를 확인하려면 실제 객체를 어떤 생성자로 만들었는지와 클래스 사이의 상속 관계를 알아야한다.
 * 하지만 다른 사람이 만든 클래스를 사용할 때는 이런 정보를 하나하나 확인하는 것이 여간 번거로운 일이 아니다.
 * 심지어 자신이 만든 클래스나 객체도 프로젝트 규모가 커지거나 소스 코드가 길어지면 일일이 생성 객체의 
 * 타입을 확인하기가 쉽지 않다. 
 * 이를 위해 자브는 캐스팅 기능 여부를 불리언 타입으로 확인할 수 있는 문법 요소를 제공하고 있는데 이것이 바로 
 * instanceof 키워드다
 * 
 * 참조 변수 instanceof 타입 과 같이 작성하면 참조 변수가 해당 타입으로 캐스팅 할 수 있을 때 
 * true 그렇지 않을 때 false를 리턴한다 여기서 instanceof 뒤의 타입은 참조 변수가 표현될 수 있는 모든
 * 다형적 타입을 의미한다.예를 들어 A<-B<-C의 상속 구조에서 C c = new C() 와 같이 생성했을 때 
 * 생성된 객체는 C 타입으로 선언돼 있지만 다형적 표현 방법에 따라 A 및 B 타입으로도 선언될 수 있다. 
 * 따라서 c instanceof A,B 의 값은 모두 true다 
 * 
 * 
 */

class A{}
class B extends A{}

public class 캐스팅_기능_여부를_확인하는_instanceof_키워드 {

	public static void main(String[] args) {
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);
		
		if(aa instanceof B) {
			B b = (B) aa;
			System.out.println("aa를 B로 캐스팅 했습니다.");
		}else {
			System.out.println("aa는 B 타입으로 캐스팅이 불가능 !!");
		}
		
		if(ab instanceof B) {
			B b = (B) ab;
			System.out.println("ab를 B로 캐스팅 했습니다.");
		}else {
			System.out.println("ab는 B 타입으로 캐스팅이 불가능 !!");
		}
		
		if("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스 입니다");
		}
	}

}
