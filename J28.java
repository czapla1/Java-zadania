package Zadania;

import java.util.Random;
import java.util.Scanner;

/*Instrukcje steruj¹ce
Napisz proste menu obs³ugi programu za pomoc¹ instrukcji switch dziêki któremu
u¿ytkownik bêdzie móg³ uruchomiæ jedno z trzech zadañ (wykonanych poprzednio)
oraz wyjœæ klawiszem q z prog 
 */
public class J28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Wybierz zadanie:\na-Kalkulator, \nb-Czy liczba jest z przedzia³u 0-1, \nc-Liczby losowe,\nq-Koniec,");
		String wybor = sc.nextLine();

		switch (wybor) {
		case "a":
			System.out.println("Podaj pierwsza liczbê: ");
			Double l1 = sc.nextDouble();
			sc.nextLine();
			System.out.println("Podaj operacjê: ");
			String operacja = sc.nextLine();

			System.out.println("Podaj drug¹ liczbê: ");
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
					System.out.println("Nie mo¿na dzieliæ przez 0");
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
			System.out.println("Podaj liczbê: ");
			double l3 = sc.nextDouble();

			if (l3 >= 0 && l3 <= 1) {
				System.out.println("Liczba z przedzia³u 0-1");
			} else {
				System.out.println("Liczba z spoza przedzia³u 0-1");
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
					System.out.println("liczba: "+gen + " jest wiêksza od " +  + l4);
				} else {
					System.out.println("liczba: "+gen + " jest równa" + l4);
				}
			}
			break;
		case "q":
			System.out.println("Koniec");
			break;
		default:
			System.out.println("B³êdny wybór");
			break;
		}

		sc.close();

	}

}
