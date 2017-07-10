package Zadania;

/*Petle
 Gra w �Za du�o, za ma�o�. Komputer losuje liczb� z zakresu 0...10, a gracz
(u�ytkownik) ma za zadanie odgadn��, co to za liczba poprzez podawanie kolejnych
warto�ci. Je�eli podana warto�� jest:
-wi�ksza � wy�wietlany jest komunikat �Poda�e� za du�� warto��,
-mniejsza � wy�wietlany jest komunikat �Poda�e� za ma�� warto��,
-identyczna z wylosowan� � wy�wietlany jest komunikat �Gratulacje� i gra
si� ko�czy*/
import java.util.Random;
import java.util.Scanner;

public class J37 {

	public static void main(String[] args) {
		Random gen = new Random();
		int liczbaLos = gen.nextInt(10);
		System.out.println(liczbaLos);
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczb� z przedzia�u 0-100");
		int liczba = sc.nextInt();

		while (liczbaLos != liczba) {
			if (liczbaLos > liczba) {
				System.out.println("Poda�e� za ma�� warto��");
				liczba = sc.nextInt();
			} else if (liczbaLos < liczba) {
				System.out.println("Poda�e� za du�� warto��");
				liczba = sc.nextInt();
			}
		}

		if (liczbaLos == liczba) {
			System.out.println("Gratulacje");
		}
		sc.close();
	}

}
