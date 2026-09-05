package 토요일_네번째문제;

class Grade{
	private String studentNams;
	private int[] scores;
	
	Grade(String name, int[] score){
		this.studentNams = name;
		this.scores = score;
	}
	
	double getAverage() {
		double sum = 0;
		for(int i =0; i<scores.length; i++) {
			sum+=scores[i];
		}
		return sum/scores.length;
	}
	
	String getLetterGrade() {
		if(getAverage()>=90) {
			return "A";
		}else if(getAverage()>=80) {
			return "B";
		}else if(getAverage() >= 70) {
			return "C";
		}else if(getAverage() >= 60) {
			return "D";
		}else {
			return "F";
		}
	}
}

public class 네번째문제 {

	public static void main(String[] args) {
		Grade s1 = new Grade("김환", new int[] {100,98,89,56,80});
		Grade s2 = new Grade("클로드 넌 빵점이야", new int[] {0,10,20,30,40});
		
		System.out.println(s1.getAverage());
		System.out.println(s2.getAverage());
		System.out.println(s1.getLetterGrade());
		System.out.println(s2.getLetterGrade());
	}

}
