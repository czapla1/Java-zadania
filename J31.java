package Zadania;

/*P�tle
 Napisz program kt�ry pobiera od u�ytkownika wiek i wy�wietla napis �Mo�esz
g�osowa�!� lub �Nie mo�esz g�osowa�!� w zale�no�ci od jego wiek*/
import java.util.Scanner;

public class J31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj wiek: ");
		int wiek = sc.nextInt();

		if (wiek >= 18) {
			System.out.println("Mo�esz g�osowa�");
		} else if (wiek < 18) {
			System.out.println("Nie mo�esz g�osowa�");
		} else {
			System.out.println("Wiek nie jest poprawny");
		}

		sc.close();
	}

}
