package 금2026_10_02;

import java.util.ArrayList;

/**
 * 17.1 컬렉션 프레임워크란
 * 지금까지 여러 개의 데이터를 묶어서 관리할 때는 배열을 썼다. 
 * 근데 배열은 치명적인 단점이 있다. 
 * 17.2.1 ArrayList 선언과 생성 
 * ArrayList<String> list = new ArrayList<String>();
 * 여기서 String 부분이 제네릭이다 이 리스트 안에는 String만 넣을 거다 라고 타입을 미리 
 * 정해두는 걷. 이렇게 하면 두가지 장점이 생긴다. 
 * 1. 타입 안정성 : 실수로 다른 타입을 넣으려고 하면 컴파일 단계에서 오류가 발생한다. 
 * 2. 캐스팅 불필요 : 꺼낼 때 원래 타입을 그대로 쓸 수 있다. 크기를 한 번 정하면 바로 바꿀 수 없다는 것이다. 
 * 
 * 이 문제를 해결하려고 자바가 제공하는 게 컬렉션 프레임 워크다 데이터 묶음(컬렉션)을 다루는
 * 여러 클래스를 미리 만들어 둔것이다. 그중에서 가장 많이 쓰는게 ArrayList 다. 
 * 
 * 17.2 ArrayList란?
 * ArrayList는 크기가 자동으로 늘어나는 배열이라고 생각하면 된다. 내부적으로는 배열을 쓰는데
 * 공간이 모자라면 더 큰 배열을 새로 만들어서 기존 데이터를 옮기는 작업을 자동으로 해준다. 
 * 그래서 개발자는 걱정 없이 계속 데이터를 추가할 수 있다. 
 * 
 */

public class ArrayList_기초 {

	public static void main(String[] args) {
		 /**
		  * 17.2.2 기본 자료형은 직접 못 넣는다. 
		  */
		 //ArrayList<int> nums = new ArrayList<int>(); 오류
		 ArrayList<Integer> nums =  new ArrayList<Integer>(); // 정답
		 /**
		  * ArrayList는 객체만 담을 수 있다. int double 같은 
		  * 기본 자료형은 객체가 아니라서 직접 못넣고 이걸 클래스로 감싼 래퍼 클래스를 써야한다. 
		  */
		 
		 nums.add(10);
		 /**
		  * 이렇게 그냥 10을 넣어도 되는 이유는 자바가 자동으로 Integer.valueOf(10)
		  * 으로 바꿔주기 때문이다 이걸 오토박싱이라고 부른다. 
		  */
		 
		 /**
		  * 17.3 ArrayList의 주요 메서드
		  */
		 
		 // 17.3.1 데이터 추가 - add()
		 ArrayList<String> list = new ArrayList<String>();
		 list.add("사과"); // 맨 뒤에 추가 -> [사과]
		 list.add("바나나"); // [사과,바나나]
		 list.add(0,"복숭아"); // 0번 위치에 끼워넣기 [복숭아,사과,바나나]
		
		 System.out.println(list.toString());
		 
		 // 17.3.2 데이터 꺼내기 get()
		 String s = list.get(0); // "복숭아" 
		 System.out.println(s);
		 // 배열의 arr[0] 과 똑같은 역할인데 문법이 다를 뿐이다. 
		 
		 // 17.3.3 크기 확인 size()
		 list.size();
		 /**
		  * 배열의 length랑 같은 개념이다 배열은 필드고 ArrayList는 메서드라는것이
		  * 차이점이다. 
		  */
		 
		 // 17.3.4 데이터삭제 remove()
		 list.remove(1); // 인덱스로 삭제
		 list.remove("사과"); // 처음 나오는 사과 삭제 (값으로 삭제)
		 System.out.println(list.toString());
		 
		 // 17.3.5 값 변경 set()
		 list.set(0, "딸기");
		 System.out.println(list.toString());
		 
		 // 17.3.6 포함 여부 확인 contains()
		 System.out.println(list.contains("바나나")); // true / false
		 
		 /**
		  * 17.4 배열 vs ArrayList 비교 
		  *  
		  *       		  	   배열           ArrayList
		  * 크기  			고정,변경불가        자동으로 늘어남
		  * 담을 수 있는 것 	  기본자료형+참조자료형  참조자료형만(래퍼클래스 필요)
		  * 길이 확인        arr.length(필드) list.size() (메서드)
		  * 값 접근             arr[0]         list.get(0)
		  * 값 추가/삭제       직접 구현해야함     add() remove() 제공
		  */
		 
	}

}
