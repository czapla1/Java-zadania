package Zadania;

import java.util.Locale;
import java.util.Scanner;
/*Operacje wejscia- wyjscia
Napisz program obliczaj�cy �redni� z trzech liczb podanych przez u�ytkownika.*/

public class J20 {

	public static void main(String[] args) {
		double suma = 0;
		int licznik = 0;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.UK);
		for (int i = 1; i <= 3; i++) {

			System.out.println("Podaj liczbe: ");
			double l = sc.nextDouble();
			suma += l;
			licznik++;
		}
		System.out.printf("�rednia wyniosi: %.2f", suma / licznik);
		sc.close();
	}

}
