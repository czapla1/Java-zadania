package Zadania;

import java.util.Scanner;

/*Pêtle
Napisz program, który pobiera od u¿ytkownika liczbê ca³kowit¹ dodatni¹, a nastêpnie
wyœwietla na ekranie kolejno wszystkie liczby nieparzyste nie wiêksze od podanej
liczby. Przyk³ad, dla 15 program powinien wyœwietliæ 1, 3, 5, 7, 9, 11, 13, 15. 
*/
public class J29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbê ca³kowit¹ dodatni¹: ");
		int l = sc.nextInt();

		for (int i = 1; i <= l; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}

		}

		sc.close();
	}

}
