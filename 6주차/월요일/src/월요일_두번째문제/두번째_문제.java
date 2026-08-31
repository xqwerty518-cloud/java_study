package 월요일_두번째문제;

class Student {
	String name;
	int[] scores = new int[3];

	Student(String name, int[] scores) {
		this.name = name;
		this.scores = scores;
	}

	int getAverage() {
		int max = 0;
		for (int i = 0; i < this.scores.length; i++) {
			max += this.scores[i];
		}
		return max / this.scores.length;
	}

	int getMax() {
		int max = this.scores[0];
		for (int i = 0; i < this.scores.length; i++) {
			if (this.scores[i] > max) {
				max = this.scores[i];
			}
		}
		return max;
	}
}

public class 두번째_문제 {

	public static void main(String[] args) {
		Student s1 = new Student("김환", new int[] { 100, 95, 87 });
		Student s2 = new Student("클로드", new int[] { 10, 30, 75 });

		System.out.println(s1.name + "의 평균값:" + s1.getAverage());
		System.out.println(s1.name + "의 가장 높은 점수:" + s1.getMax());

		System.out.println(s2.name + "의 평균값:" + s2.getAverage());
		System.out.println(s2.name + "의 가장 높은 점수:" + s2.getMax());
	}

}
