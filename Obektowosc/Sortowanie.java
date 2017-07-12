package Obektowosc;

/*Napisz zgodnie z zasadami programowania obiektowego program, który sortuje n liczb (w programie jest ich sześć). Klasa
powinna zawierać trzy metody z parametrami:
T czytaj_dane(int [] liczby, int n) — metoda czyta dane
i umieszcza je w tablicy o nazwie liczby.
T przetworz_dane(int [] liczby, int n) — metoda sortuje dane
według wybranego algorytmu sortowania (w programie
wykorzystano algorytm sortowania bąbelkowego).
T wyswietl_wynik(int [] liczby, int n) — metoda wyświetla
zawartość posortowanej tablicy liczby na ekranie monitora.*/
public class Sortowanie {
	public void czytaj_dane(int[] liczby, int n) {
		liczby[0] = 57;
		liczby[1] = 303;
		liczby[2] = 34;
		liczby[3] = 1025;
		liczby[4] = 8;
		liczby[5] = 20;
	}

	public void przetworz_dane(int[] liczby, int n) {
		for (int i = 0; i < liczby.length; i++) {
			for (int j = 0; j < liczby.length - 1; j++) {
				int pom = liczby[j];
				if (liczby[j + 1] > liczby[j]) {
					liczby[j] = liczby[j + 1];
					liczby[j + 1] = pom;
				}
			}
		}
	}

	public void wyswietl_wynik(int[] liczby, int n) {
		for (int i = 0; i < liczby.length; i++) {
			System.out.print(liczby[i] + " ");
		}
	}

	public static void main(String[] args) {
		int n = 6;
		int[] liczby = new int[n];
		Sortowanie s = new Sortowanie();
		s.czytaj_dane(liczby, n);
		s.przetworz_dane(liczby, n);
		s.wyswietl_wynik(liczby, n);

	}

}
