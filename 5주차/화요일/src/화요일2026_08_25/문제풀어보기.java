package 화요일2026_08_25;

class VendingMachine{
	String machineName;
	int[] price = new int[3];
	
	VendingMachine(String machineName,int[] price){
		this.machineName = machineName;
		this.price = price;
	}
	
	public String prices() {
		
		int sum =0;
		int avg =0;
		
		for(int i=0; i<this.price.length; i++) {
			sum += this.price[i];
		}
		avg = sum/this.price.length;
		
		return "총 가격 : "+sum+" 평균 가격 : "+avg;
	}
}

public class 문제풀어보기 {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine("강의실 자판기",new int[]{1500,2000,1200});
		String str = vm.prices();
		System.out.println(vm.machineName);
		System.out.println(str);
	}

}
