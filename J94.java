package Zadania;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisz program w którym użytkownik wpisuje ciąg znaków a potem może wyświetlić znak
z podanego indeksu. Zagwarantuj działanie programu bez względu na wpisywane dane
przez użytkownika.*/

//14:50 15:18
public class J94 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj ciag znaków lub koniec żeby zakończyć: ");
		String ciag = sc.nextLine();

		int indeks = 0;
		boolean flaga = true;
		while (flaga) {
			System.out.println("Podaj numer litery do wyswietlenia począwszy od 1:");
			while (true) {
				try {
					indeks = sc.nextInt();
					sc.nextLine();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Podany znak nie jest liczbą! ");
					System.out.println("Podaj numer litery do wyswietlenia począwszy od 1:");
					sc.nextLine();
				}
			}
			if (indeks < 0) {
				System.out.println("Podana liczba jest ujemna!");
			} else if (indeks == 0) {
				System.out.println("Podana liczba to zero podaj liczbę dodatnią: ");
			} else if (indeks > ciag.length()) {
				System.out.println("Długość podanego ciągu to: " + ciag.length() + " znaków, podaj liczbę z zakresu 1-"
						+ ciag.length());
			} else {
				System.out.println("Litera na pozycji: " + indeks + " to: " + ciag.charAt(indeks - 1));
				flaga = false;
			}
		}
		sc.close();
	}
}
