package Zadania;

import java.util.Scanner;

/*Operacje wejscia- wyjscia
Napisz program por�wnuj�cy dwie liczby podane przez u�ytkownika za pomoc�
wszystkich znanych Ci operator�w por�wnania.*/

public class J21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l;
		double l1;
		while (true) {
			System.out.println("Podaj pierwsz� liczbe lub 0 zeby zakonczyc:  ");
			l = sc.nextDouble();
			if (l != 0) {
				System.out.println("Podaj drug� liczbe lub 0 zeby zakonczyc: ");
				l1 = sc.nextDouble();
				if (l1 != 0) {
					if (l > l1) {
						System.out.println("Pierwsza liczba jest wieksza od drugiej");
					} else if (l < l1) {
						System.out.println("Druga liczba jest wieksza od pierwszej");
					} else {
						System.out.println("Liczby s� r�wne");
					}
				} else {
					System.out.println("Koniec");
					break;
				}
			} else {
				System.out.println("Koniec");
				break;
			}
		}

		sc.close();
	}

}
