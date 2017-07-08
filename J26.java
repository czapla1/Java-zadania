package Zadania;

import java.util.Locale;
import java.util.Scanner;

/*Instrukcje steruj�ce
 Napisz program sprawdzaj�cy czy podana liczba jest z przedzia�u <0,1>*/
public class J26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Podaj liczb�: ");
		double l1 = sc.nextDouble();

		if (l1 >= 0 && l1 <= 1) {
			System.out.println("Liczba z przedzia�u 0-1");
		} else {
			System.out.println("Liczba spoza przedzia�u 0-1");
		}

		sc.close();

	}

}
