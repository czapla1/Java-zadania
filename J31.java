package Zadania;

/*Pêtle
 Napisz program który pobiera od u¿ytkownika wiek i wyœwietla napis „Mo¿esz
g³osowaæ!” lub „Nie mo¿esz g³osowaæ!” w zale¿noœci od jego wiek*/
import java.util.Scanner;

public class J31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj wiek: ");
		int wiek = sc.nextInt();

		if (wiek >= 18) {
			System.out.println("Mo¿esz g³osowaæ");
		} else if (wiek < 18) {
			System.out.println("Nie mo¿esz g³osowaæ");
		} else {
			System.out.println("Wiek nie jest poprawny");
		}

		sc.close();
	}

}
