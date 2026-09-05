package 토요일_두번째문제;

class Temperture {
	private double celsius;

	Temperture(double celsius) {
		this.celsius = celsius;
	}

	double toFahrenheit() {
		return this.celsius * 9 / 5 + 32;
	}

	static Temperture Tmeperatrue(double f) {
		double c = (f-32) * 5/9;
		Temperture t2 = new Temperture(c);
	
		return t2;
	}
	
	double getCel() {
		return this.celsius;
	}
}

public class 두번째문제 {

	public static void main(String[] args) {
		Temperture t = new Temperture(25);
		System.out.println(t.toFahrenheit());

		Temperture t2 = Temperture.Tmeperatrue(98.6);
		System.out.println(t2.getCel());
	}

}
