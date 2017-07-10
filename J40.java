package Zadania;

import java.util.ArrayList;
import java.util.Scanner;

/*P�tle
Napisz program, dla podanej liczby ca�kowitej wy�wietla jej dzielniki. Przyk�adowo, dla
liczby 21 dzielniki to: 1, 3, 7, 21*/
public class J40 {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczb�: ");
		int liczba = sc.nextInt();

		for (int i = 1; i <= liczba; i++) {
			if (liczba % i == 0) {
				lista.add(i);
			}
		}

		for (Integer licz : lista) {
			System.out.print(licz + " ");
		}
	}

}
