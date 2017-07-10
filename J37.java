package Zadania;

/*Petle
 Gra w ”Za du¿o, za ma³o”. Komputer losuje liczbê z zakresu 0...10, a gracz
(u¿ytkownik) ma za zadanie odgadn¹æ, co to za liczba poprzez podawanie kolejnych
wartoœci. Je¿eli podana wartoœæ jest:
-wiêksza – wyœwietlany jest komunikat „Poda³eœ za du¿¹ wartoœæ”,
-mniejsza – wyœwietlany jest komunikat „Poda³eœ za ma³¹ wartoœæ”,
-identyczna z wylosowan¹ – wyœwietlany jest komunikat „Gratulacje” i gra
siê koñczy*/
import java.util.Random;
import java.util.Scanner;

public class J37 {

	public static void main(String[] args) {
		Random gen = new Random();
		int liczbaLos = gen.nextInt(10);
		System.out.println(liczbaLos);
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbê z przedzia³u 0-100");
		int liczba = sc.nextInt();

		while (liczbaLos != liczba) {
			if (liczbaLos > liczba) {
				System.out.println("Poda³eœ za ma³¹ wartoœæ");
				liczba = sc.nextInt();
			} else if (liczbaLos < liczba) {
				System.out.println("Poda³eœ za du¿¹ wartoœæ");
				liczba = sc.nextInt();
			}
		}

		if (liczbaLos == liczba) {
			System.out.println("Gratulacje");
		}
		sc.close();
	}

}
