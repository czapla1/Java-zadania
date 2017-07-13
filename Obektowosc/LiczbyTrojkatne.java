package Obektowosc;

import java.util.Scanner;

/*Napisz program, który rekurencyjnie znajduje 10 pierwszych
liczb trójkątnych i wyświetla je na ekranie komputera.
Wskazówka
W matematyce liczba trójkątna to taka, którą można zapisać w postaci sumy
kolejnych początkowych liczb naturalnych: Tn = 1 + 2 + 3 + (n – 1)
+ n. Liczby należące do tego ciągu nazywane są trójkątnymi, gdyż można je
przedstawić w formie trójkąta. Na przykład #6 = 21.*/
public class LiczbyTrojkatne {

	public int liczy(int n) {
		int wynik = 1;
		if (n >= 2) {
			wynik = n + liczy(n - 1);
		}
		return wynik;
	}

	public static void main(String[] args) {
		LiczbyTrojkatne l = new LiczbyTrojkatne();
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbę n: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Liczba trójkątna " + i + " to: " + l.liczy(i));

		}

		sc.close();
	}

}
