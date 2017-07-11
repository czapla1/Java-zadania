package Zadania;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/*Napisz prosty stoper. Wyświetl na ekranie komunikat o tym, że w celu rozpoczęcia
pomiaru należy wcisnąć Enter. Następnie na ekranie pojawia się podobny komunikat,
że w celu zatrzymania pomiaru należy ponownie wcisnąć Enter.
Na końcu wyświetl czas jaki udało Ci się zmierzyć w sekundach*/
public class J84 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Wciśnij Enter żeby aktywować stoper: ");
		sc.nextLine();
		Instant now = Instant.now();

		System.out.println("Wciśnij Enter żeby zastopować stoper: ");
		sc.nextLine();
		Instant later = Instant.now();
		Duration gap = Duration.between(now, later);
		System.out.println("Upłynęło: " + gap.getSeconds() + " s");
		sc.close();
	}

}
