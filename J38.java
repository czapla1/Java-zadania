package Zadania;

import java.util.Scanner;

/*P�tle
 Napisz program dzia�aj�cy w trybie konsolowym (tekstowym) i rysuj�cy na ekranie
prostok�t.U�ytkownik podaje znak wype�nienia prostok�ta, pozycj� lewego g�rnego rogu
prostok�ta (x,y) oraz d�ugo�ci bok�w prostok�ta (ab).
Przyjmujemy, �e lewy g�rny naro�nik konsoli ma wsp�rz�dne (x,y) = (1,1).*/
public class J38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj znak wype�nienia prostok�ta: ");
		String znak = sc.nextLine();
		System.out.println("Podaj pozycj� x: ");
		int x = sc.nextInt();
		System.out.println("Podaj pozycj� y: ");
		int y = sc.nextInt();
		System.out.println("Podaj d�ugo�� prostok�ta: ");
		int dl = sc.nextInt();
		System.out.println("Podaj szeroko�� prostok�ta: ");
		int szer = sc.nextInt();

		for (int j = 1; j <= y; j++) {
			System.out.print("\n");
		}
		for (int i = 1; i <= szer; i++) {
			for (int j = 1; j <= x; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= dl; j++) {
				System.out.print(znak);
			}
			System.out.println();
		}

		sc.close();
	}

}
