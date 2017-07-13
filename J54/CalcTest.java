package J54;

/*Napisz program-kalkulator, który będzie składał się z dwóch klas:
-Calculator
- CalcTest
- W klasie Calculator zdefiniuj metody add i subtract w kilku przeciążonych wersjach,
aby mogły dodawać lub odejmować 2 lub 3 liczby (a+b+c lub a-b-c) wybranego przez
Ciebie typu liczbowego.
- W klasie CalcTest przetestuj działanie klasy Calculator*/
public class CalcTest {

	public static void main(String[] args) {

		Calc calc = new Calc();
		System.out.println("Wyniki dla metody add: ");

		calc.add(7, 19);
		calc.add(3.56, 7.89);
		calc.add(19, 15, 34);
		calc.add(1.34, 23.45, 12.67);

		System.out.println("Wyniki dla metody subtract: ");
		calc.subtract(7, 19);
		calc.subtract(3.56, 7.89);
		calc.subtract(19, 15, 34);
		calc.subtract(1.34, 23.45, 12.67);

	}

}
