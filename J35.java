package Zadania;

import java.util.Scanner;

/*P�tle
 Napisz program, kt�ry wczyta liczby podane przez u�ytkownika dot�d, dop�ki nie
wykryta zostanie liczba 0.Nast�pnie wy�wietli� sum� wszystkich podanych liczb*/
public class J35 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int l = 0;

		int suma = 0;
		do {
			System.out.println("Podaj liczbe: ");
			l = sc.nextInt();
			suma += l;

		} while (l != 0);
		System.out.println("Suma podanych liczb to: " + suma);

		sc.close();
	}
}
