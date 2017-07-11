package Zadania;

/*Napisz metodę, która jako parametr będzie przyjmowała napis i wypisywała na
standardowe wyjście jego długość.
-Przekaż do tej metody null i zobacz, jaki wyjątek został zgłoszony.
-Otocz wywołanie metody blokiem try-catch, przechwyć ten wyjątek i wypisz „null exception”*/
public class J87 {

	public static void wypisz(String napis) {
		try {
			System.out.println("Długość podanego napisu to: " + napis.length() + " znaków");
		} catch (NullPointerException e) {
			System.out.println("null exception");
		}
	}

	public static void main(String[] args) {
		wypisz(null);
	}

}
