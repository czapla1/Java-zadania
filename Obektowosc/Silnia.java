package Obektowosc;

import java.util.Scanner;

/*Napisz program, który rekurencyjnie oblicza kolejne wartości
n! dla n = 10 i wynik wyświetla na ekranie komputera.*/
public class Silnia {

	public long liczSilnia(int n) {
		long wynik = 1;
		if (n >= 2) {
			wynik *= n * liczSilnia(n - 1);
		}

		return wynik;
	}

	public static void main(String[] args) {
		Silnia s = new Silnia();
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj n: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Silnia od: " + i + " wynosi: " + s.liczSilnia(i));
		}
		sc.close();
	}

}
