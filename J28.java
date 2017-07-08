package Zadania;

import java.util.Random;
import java.util.Scanner;

/*Instrukcje steruj�ce
Napisz proste menu obs�ugi programu za pomoc� instrukcji switch dzi�ki kt�remu
u�ytkownik b�dzie m�g� uruchomi� jedno z trzech zada� (wykonanych poprzednio)
oraz wyj�� klawiszem q z prog 
 */
public class J28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Wybierz zadanie:\na-Kalkulator, \nb-Czy liczba jest z przedzia�u 0-1, \nc-Liczby losowe,\nq-Koniec,");
		String wybor = sc.nextLine();

		switch (wybor) {
		case "a":
			System.out.println("Podaj pierwsza liczb�: ");
			Double l1 = sc.nextDouble();
			sc.nextLine();
			System.out.println("Podaj operacj�: ");
			String operacja = sc.nextLine();

			System.out.println("Podaj drug� liczb�: ");
			Double l2 = sc.nextDouble();
			double wynik = 0;
			switch (operacja) {

			case "+":
				wynik = l1 + l2;
				break;
			case "-":
				wynik = l1 - l2;
				break;
			case "*":
				wynik = l1 * l2;
				break;
			case "/":
				if (l2 == 0) {
					System.out.println("Nie mo�na dzieli� przez 0");
				} else {
					wynik = l1 / l2;
				}
				break;
			case "%":
				wynik = l1 % l2;
				break;
			default:
				System.out.println("Nie ma takiej opracji");
				break;
			}

			System.out.println("Wynik: " + wynik);
			break;
		case "b":
			System.out.println("Podaj liczb�: ");
			double l3 = sc.nextDouble();

			if (l3 >= 0 && l3 <= 1) {
				System.out.println("Liczba z przedzia�u 0-1");
			} else {
				System.out.println("Liczba z spoza przedzia�u 0-1");
			}
			break;
		case "c":

			System.out.println("Podaj liczbe: ");
			double l4 = sc.nextDouble();
			Random generator = new Random();
			for (int i = 1; i <= 5; i++) {
				int gen = generator.nextInt(20);
				if (gen < l4) {
					System.out.println("liczba: "+gen + " jest mniejsza od " + l4);
				} else if (gen > l4) {
					System.out.println("liczba: "+gen + " jest wi�ksza od " +  + l4);
				} else {
					System.out.println("liczba: "+gen + " jest r�wna" + l4);
				}
			}
			break;
		case "q":
			System.out.println("Koniec");
			break;
		default:
			System.out.println("B��dny wyb�r");
			break;
		}

		sc.close();

	}

}
