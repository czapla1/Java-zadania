package Zadania;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*Napisz program kalkulator który reaguje na wyjątki i prosi o poprawienie wpisu*/
public class J93 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operacja = "";
		ArrayList<String> lista = new ArrayList<>();
		lista.add("+");
		lista.add("-");
		lista.add("*");
		lista.add("/");
		lista.add("%");

		double l1 = 0;
		double l2 = 0;
		System.out.println("Jaką operację chcesz wybrać ('+','-','*','/','%'): ");
		operacja = sc.nextLine();
		if (!lista.contains(operacja)) {
			System.out.println("Nie ma takiej operacji");
			System.out.println("Jaką operację chcesz wybrać ('+','-','*','/','%'): ");
			operacja = sc.nextLine();
		}

		System.out.println("Podaj pierwszą lczbę:  ");
		sc.useLocale(Locale.ENGLISH);
		boolean check = true;
		while(check){
		try {
			l1 = sc.nextDouble();
			sc.nextLine();
			check=false;
		} catch (InputMismatchException e) {
			System.out.println("Podano znak który nie jest liczbą.");
			System.out.println("Podaj pierwszą lczbę:  ");
			sc.nextLine();
			
		}
		}
		System.out.println("Podaj drugą lczbę:  ");
		boolean check1 = true;
		while(check1){
		try {
			l2 = sc.nextDouble();
			sc.nextLine();
			check1=false;
		} catch (InputMismatchException e) {
			System.out.println("Podano znak który nie jest liczbą.");
			System.out.println("Podaj drugą lczbę:  ");
			sc.nextLine();
			
		}
		}
		double wynik = 0;
		switch (operacja) {
		case "+":
			wynik = l1 + l2;
			System.out.printf("Wynik dodawania wynosi: %.2f", wynik);
			System.out.println();
			break;
		case "-":
			wynik = l1 - l2;
			System.out.printf("Wynik odejmowaniawynosi: %.2f", wynik);
			System.out.println();
			break;
		case "*":
			wynik = l1 * l2;
			System.out.printf("Wynik mnożenia wynosi: %.2f", wynik);
			System.out.println();
			break;
		case "/":
			if (l2 != 0) {
				wynik = l1 / l2;
				System.out.printf("Wynik dzielenia wynosi: %.2f", wynik);
				System.out.println();
			} else {
				System.out.println("Nie można dzielić przez 0!");
				System.out.println();
			}
			break;
		case "%":
			wynik = l1 % l2;
			System.out.println("Reszta z dzelenia " + l1 + " przez " + l2 + " wynosi: " + wynik);
			System.out.println();
			break;
		}
		sc.close();
	}

}
