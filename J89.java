package Zadania;

import java.util.InputMismatchException;
/*Napisz program pobierający od użytkownika liczbę. Jeżeli użytkownik wpisze znak w
miejsce liczby program powinien obsłużyć wyjątek i wykonać się ponownie oraz poprosić
o poprawne wpisanie wartości.*/
import java.util.Scanner;

public class J89 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int liczba = 0;
		boolean flaga = true;
		while (flaga) {
			System.out.println("Podaj liczbę całkowitą: ");
			try {
				liczba = sc.nextInt();
				System.out.println("Podana liczba to: " + liczba);
				flaga = false;
			} catch (InputMismatchException e) {
				System.out.println("Podano znak który nie jest liczbą: ");
				sc.nextLine();
			}
		}
		sc.close();
	}

}
