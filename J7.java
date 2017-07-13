package Zadania;

/*Napisz program który dla podanego x tworzy tablicę o wymiarze x,
 uzypełnia tablicę liczbami losowymi z zakresu 0-50 a nastepnie wyświetla liczbę max i min.

  */
import java.util.Random;

public class J7 {

	public static void main(String[] args) {
		Random gen = new Random();

		int x = 4;
		int[] tab10 = new int[x];

		System.out.println("Wylosowane wartości:");
		for (int i = 0; i < tab10.length; i++) {
			tab10[i] = gen.nextInt(50);
			System.out.print(tab10[i] + " ");

		}

		int min = tab10[0];
		for (int i = 1; i < tab10.length; i++) {
			if (tab10[i] < min) {
				min = tab10[i];
			}
		}
		System.out.println("\nWartość min:");
		System.out.println(min);

		int max = tab10[0];
		for (int i = 1; i < tab10.length; i++) {
			if (tab10[i] > max) {
				max = tab10[i];
			}
		}
		System.out.println("Wartość min:");
		System.out.println(max);
	}

}
