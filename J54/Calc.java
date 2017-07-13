package J54;

/*Napisz program-kalkulator, który będzie składał się z dwóch klas:
-Calculator
- CalcTest
- W klasie Calculator zdefiniuj metody add i subtract w kilku przeciążonych wersjach,
aby mogły dodawać lub odejmować 2 lub 3 liczby (a+b+c lub a-b-c) wybranego przez
Ciebie typu liczbowego.
- W klasie CalcTest przetestuj działanie klasy Calculator*/
public class Calc {
	public void add(int a, int b) {
		int suma = a + b;
		System.out.println("Suma liczb: " + a + " i " + b + " wynosi: " + suma + "\n");
	}

	public void add(double a, double b) {
		double suma = a + b;
		System.out.println("Suma liczb: " + a + " i " + b + " wynosi: " + suma + "\n");
	}

	public void add(int a, int b, int c) {
		int suma = a + b + c;
		System.out.println("Suma liczb: " + a + " i " + b + " i " + c + " wynosi: " + suma + "\n");
	}

	public void add(double a, double b, double c) {
		double suma = a + b + c;
		System.out.println("Suma liczb: " + a + " i " + b + " i " + c + " wynosi: " + suma + "\n");
	}

	public void subtract(int a, int b) {
		int roznica = a - b;
		System.out.println("Różnica liczb: " + a + " i " + b + " wynosi: " + roznica + "\n");
	}

	public void subtract(double a, double b) {
		double roznica = a - b;
		System.out.println("Różnica liczb: " + a + " i " + b + " wynosi: " + roznica + "\n");
	}

	public void subtract(int a, int b, int c) {
		int roznica = a - b - c;
		System.out.println("Różnica liczb: " + a + " i " + b + " i " + c + " wynosi: " + roznica + "\n");
	}

	public void subtract(double a, double b, double c) {
		double roznica = a - b - c;
		System.out.println("Różnica liczb: " + a + " i " + b + " i " + c + " wynosi: " + roznica + "\n");
	}

}
