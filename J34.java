package Zadania;

import java.util.Scanner;

/*P�tle
Napisz program, kt�ry wczytuje od u�ytkownika liczb� ca�kowit� dodatni� n, a
nast�pnie wy�wietla na ekranie wszystkie pot�gi liczby 2 nie wi�ksze, ni� podana
liczba.
 */
public class J34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczb� ca�kowita dodatni�: ");
		int l = sc.nextInt();
		int potega = 2;
		System.out.print("Wysztkie potegi 2 nie wi�ksze od liczby "+l+" to: ");
		do {
			System.out.print(potega+" ");
			potega *= 2;

		} while (potega <= l);

		sc.close();
	}

}
