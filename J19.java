package Zadania;

import java.util.Scanner;

/*Operacje wejscia-wyjscia
Napisz program który pobiera od u¿ytkownika imiê 
i wyœwietla napis „Witaj na kursie+imie"*/

public class J19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj imie: ");
		String imie = sc.nextLine();

		System.out.println("Witaj na kursie " + imie+"!");
		sc.close();
	}
}
