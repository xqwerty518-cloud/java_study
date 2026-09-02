package 수요일_다섯번째문제;

class Inventory {
	// 같은 인덱스끼리 짝
	private String[] itemNames;
	private int[] itemCount;

	Inventory(int w) {
		this.itemNames = new String[w];
		this.itemCount = new int[w];
	}

	void addItem(String name, int count) {
		for (int i = 0; i < itemNames.length; i++) {
			if (itemNames[i] == null) {
				itemNames[i] = name;
				itemCount[i] = count;
				break;
			}
		}

	}

	int findItem(String name) {
		for (int i = 0; i < itemNames.length; i++) {
			if (itemNames[i].equals(name)) {
				return itemCount[i];
			}

		}
		return -1;
	}

	int getTotalItems() {
		int sum = 0;
		for (int i = 0; i < itemCount.length; i++) {
			sum += itemCount[i];
		}
		return sum;
	}
}

public class 다섯번째문제 {

	public static void main(String[] args) {
		Inventory inventory = new Inventory(5);
		inventory.addItem("사과", 10);
		inventory.addItem("복숭아", 3);
		inventory.addItem("귤", 60);

		System.out.println(inventory.findItem("사"));
		System.out.println(inventory.getTotalItems());
	}

}
