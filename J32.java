package Zadania;

import java.util.Scanner;

/*P�tle
Napisz program kt�ry pobiera od u�ytkownika napis i liczb� nast�pnie wy�wietla
znaki z podanego napisu co podan� liczb�.
 */
public class J32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj wyrazenie: ");
		String wyrazenie = sc.nextLine();
		System.out.println("Podaj liczbe: ");
		int l = sc.nextInt();
		System.out.print("Co " + l + " znak z podanego wyra�enia to: ");
		for (int i = l - 1; i < wyrazenie.length(); i = i + l) {
			System.out.print("'" + wyrazenie.charAt(i) + "' ");
		}

		sc.close();
	}

}
