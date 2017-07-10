package Zadania;

import java.util.Random;

/*Tablice
 Napisz program który: tworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z przedziału
[−10,...,10],
-wypisze na ekranie zawartość tablicy,
-wyznaczy najmniejszy oraz największy element w tablicy,
-wyznaczy średnią arytmetyczną elementów tablicy,
-wyznaczy ile elementów jest mniejszych, ile większych od średniej.
-wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego do
pierwszego.*/
public class J42 {

	public static void main(String[] args) {

		int[] tab1 = new int[10];
		int suma = 0;
		double srednia = 0;
		Random gen = new Random();
		int licz = 0;
		for (int i = 0; i < tab1.length; i++) {
			tab1[i] = gen.nextInt(21) - 10;
		}
		System.out.print("Zawartość tablicy to: ");
		for (int l : tab1) {

			System.out.print(l + " ");
		}

		int min = tab1[0];
		for (int i = 1; i < tab1.length; i++) {
			if (tab1[i] < min) {
				min = tab1[i];
			}
		}
		System.out.println("\nWartość min: " + min);

		int max = tab1[0];
		for (int i = 1; i < tab1.length; i++) {
			if (tab1[i] > max) {
				max = tab1[i];
			}
		}
		System.out.println("Wartość max: " + max);

		for (int i = 0; i < tab1.length; i++) {
			suma += tab1[i];
		}
		srednia = (double) suma / tab1.length;
		System.out.println("Suma wynosi :" + suma);
		System.out.println("Średnia wynosi: " + srednia);

		int licznik = 0;
		for (int i = 0; i < tab1.length; i++) {
			if (tab1[i] > srednia) {
				licznik++;
			}
		}
		System.out.println("Ilość elementów większych od średniej: " + licznik);
		System.out.println("Ilość elementów mniejszych od średniej: " + (tab1.length - licznik));

		System.out.println("Zawartość tablicy w kolejności odwrtonej:  ");
		for (int i = tab1.length - 1; i >= 0; i--) {
			System.out.print(tab1[i] + " ");
		}

	}

}
