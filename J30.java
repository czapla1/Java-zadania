package Zadania;

import java.util.Scanner;

/*P�tle
 Podziel ci�g znak�w w zadanej zmiennej przez u�ytkownika przy pomocy trzeciej
litery od ko�ca drugiej zmiennej podanej przez u�ytkownika*/
public class J30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj ciag znak�w: ");
		String ciag1 = sc.nextLine();
		System.out.println("Podaj drugi ciag znak�w: ");
		String ciag2 = sc.nextLine();
		String zmienna = ciag2.charAt(ciag2.length() - 3) + "";
		System.out.println(zmienna);
		String[] tab = ciag1.split(zmienna);
		for (String x : tab) {

			System.out.print(x + " ");
		}

		sc.close();
	}

}
