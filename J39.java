package Zadania;

import java.util.Scanner;
/*Pêtle
 Napisz program rysuj¹cy w konsoli „choinkê” z³o¿on¹ ze znaków gwiazdki (*).
U¿ytkownik programu powinien podaæ liczbê ca³kowit¹ n, n > 0, okreœlaj¹c¹ wysokoœæ
choinki (liczbê wierszy)*/
public class J39 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj wysokoœc choinki n, n > 0: ");
		int wys = sc.nextInt();

		for (int i = 1; i <= wys; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}
