package Zadania;

import java.util.Locale;
import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String wybor;
		double a;
		double b;
		double h;
		double r;
		System.out.println("Której figury pole chcesz liczyć (kwadrat/prostokąt/trojkat/kolo): ");
		wybor = sc.nextLine();
		sc.useLocale(Locale.ENGLISH);

		switch (wybor) {
		case "kwadrat":
			System.out.println("Podaj dł boku a: ");
			a = sc.nextDouble();
			System.out.printf("Pole kwadratu wynosi: %.2f", Math.pow(a, 2));
			break;

		case "prostokat":
			System.out.println("Podaj a: ");
			a = sc.nextDouble();
			sc.nextLine();
			System.out.println("Podaj b: ");
			b = sc.nextDouble();
			System.out.printf("Pole kwadratu wynosi: %.2f", (a * b));
			break;
		case "trojkat":
			System.out.println("Podaj podstawę a: ");
			a = sc.nextDouble();
			sc.nextLine();

			System.out.println("Podaj wysokość h: ");
			h = sc.nextDouble();
			System.out.printf("Pole trójkąta wynosi: %.2f", (a * 1 / 2 * h));
			break;
		case "kolo":
			System.out.println("Podaj promień r: ");
			r = sc.nextDouble();
			System.out.printf("Pole koła wynosi: %.2f", Math.pow(r, 2) * Math.PI);
			break;

		default:
			System.out.println("Nie ma takiej figury");

		}

		sc.close();
	}

}
