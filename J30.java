package Zadania;

import java.util.Scanner;

/*Pêtle
 Podziel ci¹g znaków w zadanej zmiennej przez u¿ytkownika przy pomocy trzeciej
litery od koñca drugiej zmiennej podanej przez u¿ytkownika*/
public class J30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj ciag znaków: ");
		String ciag1 = sc.nextLine();
		System.out.println("Podaj drugi ciag znaków: ");
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
