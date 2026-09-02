package 수요일_두번째문제;

class Matrix{
	private int[][] data;
	
	Matrix(int[][] data){
		this.data = data;
	}
	
	int getSum() {
		int sum = 0;
		for(int i = 0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				sum += data[i][j];
			}
		}
		
		return sum;
	}
	
	/**
	 * 대각선 합
	 * 1 2 3
	 * 4 5 6 
	 * 7 8 9
	 * 
	 * 1+5+9 
	 * 
	 * 1 = 0 0
	 * 5 = 1 1
	 * 9 = 2 2
	 * @return
	 */
	int getDiagonalSum() {
		int sum = 0;
		for(int i=0; i<data.length; i++) {
			sum += data[i][i];
		}
		return sum;
	}
	
	void print() {
		for(int i = 0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class 두번째문제 {
	public static void main(String[] args) {
		Matrix arr = new Matrix(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
		
		System.out.println(arr.getSum());
		System.out.println(arr.getDiagonalSum());
		arr.print();
	}
}
