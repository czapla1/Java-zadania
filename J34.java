package Zadania;

import java.util.Scanner;

/*Pêtle
Napisz program, który wczytuje od u¿ytkownika liczbê ca³kowit¹ dodatni¹ n, a
nastêpnie wyœwietla na ekranie wszystkie potêgi liczby 2 nie wiêksze, ni¿ podana
liczba.
 */
public class J34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbê ca³kowita dodatni¹: ");
		int l = sc.nextInt();
		int potega = 2;
		System.out.print("Wysztkie potegi 2 nie wiêksze od liczby "+l+" to: ");
		do {
			System.out.print(potega+" ");
			potega *= 2;

		} while (potega <= l);

		sc.close();
	}

}
