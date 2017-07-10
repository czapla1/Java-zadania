package Zadania;

import java.util.Scanner;

/*Pêtle
 Napisz program dzia³aj¹cy w trybie konsolowym (tekstowym) i rysuj¹cy na ekranie
prostok¹t.U¿ytkownik podaje znak wype³nienia prostok¹ta, pozycjê lewego górnego rogu
prostok¹ta (x,y) oraz d³ugoœci boków prostok¹ta (ab).
Przyjmujemy, ¿e lewy górny naro¿nik konsoli ma wspó³rzêdne (x,y) = (1,1).*/
public class J38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj znak wype³nienia prostok¹ta: ");
		String znak = sc.nextLine();
		System.out.println("Podaj pozycjê x: ");
		int x = sc.nextInt();
		System.out.println("Podaj pozycjê y: ");
		int y = sc.nextInt();
		System.out.println("Podaj d³ugoœæ prostok¹ta: ");
		int dl = sc.nextInt();
		System.out.println("Podaj szerokoœæ prostok¹ta: ");
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
