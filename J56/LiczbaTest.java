package J56;

/*Napisz klasę przechowującą liczby typu int. Dołącz jednoargumentowy konstruktor
przyjmujący argument typu int.
Polu klasy nadaj nazwę liczba, tak samo nazwij argument konstruktora.
Zmodyfikuj powyższy program o przeciążony konstruktor bezargumentowy ustawiający jej
pole na wartość 0
*/
public class LiczbaTest {

	public static void main(String[] args) {

		Liczba liczba = new Liczba();
		System.out.println(liczba);

		Liczba liczba1 = new Liczba(34);
		System.out.println(liczba1);

	}

}
