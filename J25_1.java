package Zadania;

import java.util.Locale;
import java.util.Scanner;

/*Instrukcje steruj¹ce
 Napisz prosty kalkulator dla liczb zmiennoprzecinkowych, który pozwala
u¿ytkownikowi kolejno na:
-Wprowadzenie pierwszej liczby
-Wprowadzenie jednego z podstawowych dzia³añ matematycznych (plus,
minus, podziel, pomnó¿) - w postaci znaków +, -, /, *
-Wprowadzenie drugiej liczby*/

public class J25_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj pierwsza liczbê: ");
		sc.useLocale(Locale.ENGLISH);
		Double l1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Podaj operacjê ('+','-','*','/''%'): ");
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
		sc.close();

	}

}
