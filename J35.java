package Zadania;

import java.util.Scanner;

/*Pêtle
 Napisz program, który wczyta liczby podane przez u¿ytkownika dot¹d, dopóki nie
wykryta zostanie liczba 0.Nastêpnie wyœwietliæ sumê wszystkich podanych liczb*/
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
