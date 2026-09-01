package 화요일_첫번째문제;

import java.util.Arrays;

/**
 * 두개의 메서드 넓이 반환 둘레 반환
 * 
 */
class Rectangle {
	private String name;
	private int width;
	private int height;

	Rectangle(int width, int height,String name) {
		this.width = width;
		this.height = height;
		this.name = name;
	}

	int getArea() {
		return this.width * this.height;
	}

	int getPerimeter() {
		return (this.width + this.height) * 2;
	}
	
	String getName() {
		return this.name;
	}
}

/**
 * 각각 3개의 Rectangle 객체 생성하여 각각 넓이 둘레 출력 후 넓이가 가장 큰 사각형 찾아 출력
 */
public class 첫번째문제 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(12, 10,"첫");
		Rectangle r2 = new Rectangle(30, 35,"둘");
		Rectangle r3 = new Rectangle(60, 91,"삼");
		
		System.out.println("첫 번째 직사각형 의 넓이 "+r1.getArea());
		System.out.println("첫 번째 직사각형 의 둘레 "+r1.getPerimeter());
		System.out.println();
		System.out.println("두 번째 직사각형 의 넓이 "+r2.getArea());
		System.out.println("두 번째 직사각형 의 둘레 "+r2.getPerimeter());
		System.out.println();
		System.out.println("세 번째 직사각형 의 넓이 "+r3.getArea());
		System.out.println("세 번째 직사각형 의 둘레 "+r3.getPerimeter());
		
		Rectangle[] arr = {r1,r2,r3};
		int max = arr[0].getArea();
		String name = arr[0].getName();
	
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getArea() > max) {
				max = arr[i].getArea();
				name = arr[i].getName();
			}
		}
		System.out.println();
		System.out.println(name+" 이 가장 큰 사각형 입니다. 넓이: "+max);
	}
}
