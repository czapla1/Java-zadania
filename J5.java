package Zadania;

/*Napisz program który wylosuje 10 liczb losowych z przedziału 0-49,
 a nastepnie wypisze wylosowane liczby parzyste i nieparzyste wraz z pozycją na której zostały wylosowane */
import java.util.Random;

public class J5 {

	public static void main(String[] args) {
		Random gen = new Random();
		int[] tab = new int[10];

		System.out.println("Wylosowane liczny losowe to: ");
		for (int i = 0; i < tab.length; i++) {

			tab[i] = gen.nextInt(50);
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		System.out.println("Wylosowane liczny parzyste: ");
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 0) {
				System.out.print(i + ":" + tab[i] + ", ");
			}

		}
		System.out.println();
		System.out.println("Wylosowane liczny nieparzyste: ");
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 != 0) {
				System.out.print(i + ":" + tab[i] + ", ");
			}
		}

	}

}
