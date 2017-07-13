package Zadania;

/*Napisz program który wyświetla liczby z zakresu 1-100. 
Jeżeli liczba jest podzielna przez 3 i 5 to zamiast liczny wyświetlane jest “FizzBuzz”.
Jeżeli liczba jest podzielna przez 3 to zamiast liczny wyświetlane jest “Buzz”
Jeżeli liczba jest podzielna przez 5 to zamiast liczny wyświetlane jest “Buzz”
*/
public class J4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Buzz");
			} else if (i % 5 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}
}
