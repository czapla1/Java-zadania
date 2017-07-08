package Zadania;

import java.util.Locale;
import java.util.Scanner;

/*Instrukcje steruj�ce
 Napisz prosty kalkulator dla liczb zmiennoprzecinkowych, kt�ry pozwala
u�ytkownikowi kolejno na:
-Wprowadzenie pierwszej liczby
-Wprowadzenie jednego z podstawowych dzia�a� matematycznych (plus,
minus, podziel, pomn�) - w postaci znak�w +, -, /, *
-Wprowadzenie drugiej liczby*/

public class J25_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj pierwsza liczb�: ");
		sc.useLocale(Locale.ENGLISH);
		Double l1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Podaj operacj� ('+','-','*','/''%'): ");
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
		sc.close();

	}

}
