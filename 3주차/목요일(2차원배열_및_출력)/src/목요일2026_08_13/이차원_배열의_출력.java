package 목요일2026_08_13;

public class 이차원_배열의_출력 {

	public static void main(String[] args) {
		/**
		 * 2차원 배열은 가로 세로 방향으로 데아터가 분포돼 있어 2개의 인덱스를 사용한다. 따라서 2차원 배열의 모든 데이터를 출력하기
		 * 위해서는 기본적으로 이중 for 문을 사용해야 한다.
		 * 여기서 중요한 것은 반복 횟수를 지정하는 것이다. 앞서 살펴본 2차원 비정방 배열 예제에서는 2개의 행에 대해 각각
		 * 2회(a[0].length) 및 3회(a[1].length]를 반복해야한다 따라서 바깥쪽 for 문에는 행의 개수를 나타내는
		 * a.length 안쪽 for문에는 각 행별 열의 개수를 나타내는 a[i].length를 사용해야한다.
		 */
		
		int[][] a = {{1,2},{3,4,5}};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println();
		/**
		 * 앞서 1차원 배열에서 살펴본 집합 객체(배열,컬렉션)의 원소를 1개씩 모두 꺼낼 때 까지 방복하는 for-each 문을
		 * 사용할 수도 있다. 여기서도 이중 for-each문을 사용해야 한다. 2차원 배열에 꺼낸 하나의 원소가 1차원 배열이기 때문이다.
		 */
		for(int[] w :a) {
			for(int n : w) {
				System.out.println(n);
			}
		}
	}

}
