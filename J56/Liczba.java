package J56;
/*Napisz klasę przechowującą liczby typu int. Dołącz jednoargumentowy konstruktor
przyjmujący argument typu int.
Polu klasy nadaj nazwę liczba, tak samo nazwij argument konstruktora.
Zmodyfikuj powyższy program o przeciążony konstruktor bezargumentowy ustawiający jej
pole na wartość 0
*/

public class Liczba {

	int liczba;

	public Liczba(int liczba) {
		this.liczba = liczba;
	}

	public Liczba() {
		this.liczba = 0;
	}

	@Override
	public String toString() {
		return "Liczba [liczba=" + liczba + "]";
	}

}
