package 일26_09_13_1;

import java.util.HashMap;

/**
 * hashCode() 메서드는 객체의 위치와 관련된 값으로 실제 위치를 나타내는 값은 아니다.
 * 객체의 위치값을 기준으로 생성된 고윳값 정도로 생각하는 것이 적절하다. 앞에서 두 객체의 내용을 
 * 비교하기 위해 equals() 메서드를 오버라이딩해 봤다. 일반적으로 두 객체의 내용을 비교하기 위해서는
 * equals() 메서드를 오버라이딩하는 것만으로도 충분하다. 하지만 HashTable, HashMap 등에서
 * 동등 비교를 하고자 할 때는 hashCode() 까지 오버라이딩 해야한다. 
 * 
 * HashMap 자료 구조는 데이터를 (Key, value)의 쌍으로 저장하며 Key값은 중복 되지 않는다.
 * 따라서 Key 값이 서로 같은지를 확인해야 하는데 이 과정은 다음과 같이 2가지로 구성돼 있다. 
 * 첫 번째 단계에서는 두 객체의 hashCode() 값을 비교 한다. 일단 두 객체의 hashCode() 값이 
 * 동일할 때 equals 메서드를 호출하며 이 값이 true이면 같은 객체로 인식을 한다. 
 * 이를 정리하면 HaseMap 관점에서 두 객체가 동일하기 위해서는 hashCode 값이 동일해야 하고
 * equals 메서드가 true를 리턴해야 한다. 
 * 
 * 좀 더 자세히 알아보자 HashMap은 (key,value)의 쌍으로 이뤄진 데이터들을 저장하는 자료구조다.
 * 예를 들어 Key가 integer 타입 value가 String 타입이라면 (1,"안녕"),(2,"방가") 와 같이
 * 데이터를 저장할 수 있다. 
 * 이때 HashMap은 두 쌍의 데이터를 포함하고 있다. 
 * 여기에 다음과 같이 동일한 Key 값을 가진 (1,"땡큐") 의 데이터를 추가하면
 * 새로운 데이터가 추가 되는 것이 아니라 이미 있는 key 값 위치에 데이터가 바뀐다. 
 * 
 * 따라서 HashMap에서는 추가하고자 하는 데이터셋의 Key가 기존의 Key들과 동일한지를
 * 확인하는 과정이 반드시 필요하다. HashMap 에서 사용되는 2개의 Key 값이 동일한지 확인 하는 과정은
 * 2단계로 이뤄진다. 첫 번째 단계에서는 두 Key의 hashCode() 값이 동일한지를 확인 한다
 * 두 번째 단계에서는 equals() 메서드를 이용해 동일 여부를 확인 한다. 
 * hashCode() 값이 일치하고 equals의 반환값이 true라면 같은 key 객체로 인식하므로 해당 데이터셋은
 * 기존 데이터셋을 덮어 쓴다. 반면 둘중 하나라도 만족하지 않으면 다른 객체로 인식하므로 새로운 데이터셋으로
 * 추가 된다. 다음 예를 살펴보자.
 */

class A{
	String name;
	A(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof A) {
			if(this.name == ((A) obj).name){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

class B{
	String name;
	B(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			if(this.name == ((B) obj).name){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}

/**
 * 클래스 A는 equals() 메서드만 오버라이딩 했다. 이 메서드는 비교 대상의 객체와 name 필드값이 동일하면
 * true를 리턴했다 반면 클래스 B는 equals 메서드와 더불어 hashCode 메서드를 오버라이딩 했다. 
 * 이 메서드의 내부에서는 name.hachCode를 실행하는데 String 클래스 내부의
 * hashCode 메서드는 문자열마다 고유의 해시코드를 만들어 리턴해 주는 메서드다. 
 * 따라서 문자열이 동일하면 동일한 해시코드가 리턴된다. 
 */

public class hashCode {

	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		System.out.println(hm1);
		
		HashMap<A, String> hm2 = new HashMap<A, String>();
		hm2.put(new A("첫 번째"), "데이터1");
		hm2.put(new A("첫 번째"), "데이터2");
		hm2.put(new A("두 번째"), "데이터3");
		System.out.println(hm2);
		
		HashMap<B, String> hm3 = new HashMap<B, String>();
		hm3.put(new B("첫 번째"), "데이터1");
		hm3.put(new B("첫 번째"), "데이터2");
		hm3.put(new B("두 번째"), "데이터3");
		System.out.println(hm3);
		/**
		 * 이제 HashMap 객체를 생성한 후 데이터를 추가하는 예를 살펴보자 
		 * 여기서 HashMap 객체를 생성하는 모양이 조금 이상한데 
		 * 지금은 무시해도 좋다 여기서는 Key값의 중복 여부만 신경써서 이해하도록 노력해보자.
		 * 
		 * 첫 번째로 만든 HashMap 객체는 (key,value) 의 자료형이 <Integer,String> 타입이다.
		 * 인티저는 기본 자료형 int를 클래스로 만들어 놓은 것으로 일단 여기서는 int라고 생각하자.
		 * 첫 번째에서는 3쌍의 데이터를 넣었는데 동일한 키 값이 중복돼 들어갔다. 따라서 최종적으로
		 * 저장된 데이터셋은 2개이고 key = 1 일 때의 value 값은 나중에 들어간 데이터 2 라는 것을
		 * 알 수 있다. 
		 * 
		 * 이제 두 번째 객체를 살펴보자 키값으로 A 객체가 들어갔다 여기서의 관건은 
		 * 처음 2개의 입력으로 사용된 키값이 동일한지다 이는 앞에서 설명한 2단계의 과정에 따라 결정된다. 
		 * 첫 번째 단계는 두 객체의 해시코드 값 비교다. 
		 * 그런데 클래스 A는 해시코드를 오버라이딩 하지 않았다. 따라서 클래스 A 내부에서 사용할 수 있는
		 * 해시코드는 Object의 해시코드다 앞에서 설명했던 것 처럼 오브젝트의 해시코드는 객체의 
		 * 위치에 따라 생성된 고윳값을 리턴한다. 그런데 두 객체가 서로 다른 위치에 생성될 것이므로
		 * 두 객체의 해시코드 값도 서로 다를 것이다. 따라서 첫번째 와 두번째 는 다른 Key로 인식한다.
		 * 따라서 이 해시맵 객체에 저장 결과를 보면 3쌍의 데이터가 들어가 있는 것을 볼 수 있다. 
		 * 
		 * 마지막 역시 해시코드 값과 이퀄스 메서드의 결과를 순차적으로 확인해 두 객체가 
		 * 동일한지를 결정한다. 클래스 B에서는 해시코드를 오버라이딩 했고 여기에서는 
		 * name.hashCode() 를 사용해 문자열에 따라 해시코드 값을 리턴하게 했다. 
		 * 그런데 두 객체의 name 값이 같으므로 두 값의 해시코드 값도 같을 것이다. 
		 * 첫 단계를 통과했으므로 이번엔 equals 메서드의 리턴값을 확인해야 한다. 
		 * 클래스 B는 이퀄스 메서드도 오버라이딩 했고 여기서 name 값이 동일할 때 true를 리턴하도록 했다. 
		 * 따라서 equals 역시 true를 리턴한다. 두 단계를 모두 통과했으므로 첫 번쨰 입력 Key와
		 * 두 번째 입력 Key는 동일한 Key값이 되는 것이다 
		 * 따라서 최종적으로 저장된 해시맵의 데이터를 보면 2쌍의 데이터만 들어가 있고 중복 저장된 
		 * Key값의 위치에는 나중에 들어간 value 값이 저장돼 있다는 것을 확인할 수가 있다. 
		 * 
		 * hashCode()를 설명하기 위해 나중에 다루게 될 제네릭 컬렉션 들의 문법을 가져다 쓰는 바람에
		 * 다소 어려워 졌는데 여기서는 Objcet의 hashCode() 메서드는 객체의 위치에
		 * 따라 고윳값을 리턴한다 는 것과 Hash... 형태의 자료구조에서는 동등 비교를 위해 
		 * hashCode() 결괏값을 비교하므로 필요할 때마다 equals 메서드와 함께 추가로 오버라이딩 해야 한다는
		 * 사실만 기억하자 
		 */
	}

}
