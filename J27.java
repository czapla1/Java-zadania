package Zadania;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*Instrukcje steruj¹ce
 Napisz program, który wypisze 5 losowych wartoœci typu int na ekran i stosuj¹c
instrukcje if-else dla ka¿dej z tych wartoœci program sklasyfikuje wartoœæ jako
(mniejsz¹, równ¹ lub wiêksz¹) od zadanej wartoœci przez u¿ytkownika.*/
public class J27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Podaj liczbe: ");
		double l1 = sc.nextDouble();
		Random generator = new Random();
		for (int i = 1; i <= 5; i++) {
			int gen = generator.nextInt(20);
			// System.out.print(gen+" ");
			if (gen < l1) {
				System.out.println("liczba: "+gen + " jest mniejsza od " + l1);
			} else if (gen > l1) {
				System.out.println("liczba: "+gen + " jest wieksza od " + l1);
			} else {
				System.out.println("liczba: "+gen + " jest rowna " + l1);
			}
		}

		sc.close();
	}

}
