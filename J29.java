package Zadania;

import java.util.Scanner;

/*P�tle
Napisz program, kt�ry pobiera od u�ytkownika liczb� ca�kowit� dodatni�, a nast�pnie
wy�wietla na ekranie kolejno wszystkie liczby nieparzyste nie wi�ksze od podanej
liczby. Przyk�ad, dla 15 program powinien wy�wietli� 1, 3, 5, 7, 9, 11, 13, 15. 
*/
public class J29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczb� ca�kowit� dodatni�: ");
		int l = sc.nextInt();

		for (int i = 1; i <= l; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}

		}

		sc.close();
	}

}
