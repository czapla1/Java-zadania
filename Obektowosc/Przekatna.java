package Obektowosc;

import java.util.Random;

/*Napisz zgodnie z zasadami programowania obiektowego program, który w tablicy 10×10 umieszcza losowo na przekątnej
liczby od 0 do 9, a poza przekątną zera. Dodatkowo program
oblicza sumę liczb znajdujących się na przekątnej. Klasa powinna zawierać trzy metody z parametrami:
T czytaj_dane(double [][]macierz, int rozmiar) — metoda
umieszcza dane w tablicy.
T przetworz_dane(double [][]macierz, int rozmiar) — metoda
oblicza i wyświetla sumę liczb znajdujących się na
przekątnej.
T wyswietl_wynik(double [][]macierz, int rozmiar) — metoda
wyświetla zawartość tablicy na ekranie monitora.*/
public class Przekatna {
	double[][] tab;

	public void czytaj_dane(double[][] macierz, int rozmiar) {
		tab = new double[rozmiar][rozmiar];
		Random gen = new Random();
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (i == j) {
					tab[i][j] = gen.nextInt(10);
				} else {
					tab[i][j] = 0;
				}
			}
		}
	}

	public void przetworz_dane(double[][] macierz, int rozmiar) {
		double suma = 0;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (i == j) {
					suma += tab[i][j];
				}
			}
		}
		System.out.println("Suma elementów na przekątnej wynosi: " + suma);
	}

	public void wyswietl_wynik(double[][] macierz, int rozmiar) {
		System.out.println("Wydruk tablicy: ");
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (i == j) {

					System.out.print(tab[i][j] + " ");
				} else {

					System.out.print(tab[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Przekatna p = new Przekatna();
		int rozmiar = 10;
		double[][] tab = new double[rozmiar][rozmiar];
		p.czytaj_dane(tab, rozmiar);
		p.przetworz_dane(tab, rozmiar);
		p.wyswietl_wynik(tab, rozmiar);

	}

}
