package 다른패키지실습; // 클래스 AA BB CC와 다른 패키지에 위치함

import 실습_다른_패키지에서_클래스접근지정자와_생성자접근지정자.AA; 
//import 실습_다른_패키지에서_클래스접근지정자와_생성자접근지정자.BB;
import 실습_다른_패키지에서_클래스접근지정자와_생성자접근지정자.CC;
/**
 * 클래스 AA와 클래스 CC는 public 접근 지정자를 포함 하고 있으므로 임포트 가능 
 */

public class 다른패키지 {
	public static void main(String[] args) {
		AA a = new AA(); 
		//BB b = new BB();
		//CC c = new CC();
		
		/**
		 * 클래스 AA는 public 생성자이므로 다른 패키지에서도 객체 선언 과 생성자 호출 가능 
		 * 
		 * 클래스 BB는 임포트를 할 수 없으므로 객체 선언과 호출 모두 불가능
		 * 
		 * 클래스 CC는 객체는 선언할 수 있지만(CC c) default 생성자이므로 생성자 호출(new CC()) 불가능 
		 */
	}
}
