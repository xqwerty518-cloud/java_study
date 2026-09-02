package 수요일_첫번째문제;

class Employee{
	private String name;
	private int baseSalary,bonus;
	
	Employee(String name,int baseSalary){
		this.name = name;
		this.baseSalary = baseSalary;
		this.bonus = 0;
	}
	
	void setBonus(int amount) {
		this.bonus = amount;
	}
	
	int getTotalSalary() {
		return this.baseSalary+this.bonus;
	}
	
	String getName() {
		return this.name;
	}
}

public class 첫번째문제 {

	public static void main(String[] args) {
		Employee e1 = new Employee("김사원", 15000000);
		Employee e2 = new Employee("클사원", 5000000);
		Employee e3 = new Employee("공사원", 100000);
		
		e1.setBonus(1000000);
		e2.setBonus(20000000);
		e3.setBonus(3000000);
		
		Employee[] arr = {e1,e2,e3};
		
		int max = arr[0].getTotalSalary();
		String name = arr[0].getName();
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i].getTotalSalary() > max) {
				max = arr[i].getTotalSalary();
				name = arr[i].getName();
			}
		}
		
		System.out.println("제일 급여가 높은 직원: "+name);
		System.out.printf("급여 : %,d",max);
		
	}

}
