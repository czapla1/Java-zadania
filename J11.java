package Zadania;

/*Utwórz 10-cio elementową tablice i wypełnij ja losowymi liczbami całkowitymi z zakresu 0-99
 Zlicz i wypisz ile jest w tablicy osób kwalifikujących się do poniższych kategorii wiekowych:
 niemowlęta<1
 niepelnoletni<18
 dzieci szkolne >=7 i <=19
 pelnoletni>=18
 emeryt>67
 */
import java.util.Random;

public class J11 {

	public static void main(String[] args) {
		int niemowle = 0;
		int niepelnoletni = 0;
		int szkolne = 0;
		int pelnoletni = 0;
		int emeryt = 0;

		int[] tab12 = new int[10];
		Random gen = new Random();

		for (int i = 0; i < tab12.length; i++) {
			tab12[i] = gen.nextInt(100);
			System.out.print(tab12[i] + " ");
		}
		for (int x : tab12) {
			if (x < 1) {
				niemowle++;
			}
			if (x < 18) {
				niepelnoletni++;
			}
			if (x >= 7 && x <= 19) {
				szkolne++;
			}

			if (x >= 18) {
				pelnoletni++;
			}

			if (x > 67) {
				emeryt++;
			}
		}

		System.out.println();

		System.out.println("Niemowlęta: " + niemowle);
		System.out.println("Niepełnoletni: " + niepelnoletni);
		System.out.println("Dzieci szkolne:" + szkolne);
		System.out.println("Pełnoletni: " + pelnoletni);
		System.out.println("Emeryci: " + emeryt);

	}

}
