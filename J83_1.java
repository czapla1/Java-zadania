package Zadania;

import java.time.LocalDate;
import java.util.Scanner;

/*Napisz program który po podaniu daty urodzin przez użytkownika wyświetla na
ekranie który to był dzień tygodnia.
Następnie wyświetla wszystkie lata do chwili obecnej w których urodziny użytkownika
przypadały na ten dzień tygodnia.*/
public class J83_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj date urodzenia w formacie rrrr mm dd (oddzielone spacją): ");
		int rok = sc.nextInt();
		int miesiac = sc.nextInt();
		int dzien = sc.nextInt();
		LocalDate data_ur = LocalDate.of(rok, miesiac, dzien);
		System.out.print("Urodziłeś się w: ");
		System.out.println(data_ur.getDayOfWeek());

		System.out.println(
				"Lata kiedy " + dzien + " " + miesiac + " " + rok + " przypadał w " + data_ur.getDayOfWeek() + " to:");
		for (int i = rok; i <= LocalDate.now().getYear(); i++) {
			if (LocalDate.of(i, miesiac, dzien).getDayOfWeek().equals(data_ur.getDayOfWeek())) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
