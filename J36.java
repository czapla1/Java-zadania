package Zadania;

import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*Pêtle
 Napisz program, który pobiera od u¿ytkownika ci¹g liczb ca³kowitych. Pobieranie
danych koñczone jest podaniem wartoœci 0 (nie wliczana do danych).
W nastêpnej kolejnoœci program powinien wyœwietliæ sumê najwiêkszej oraz
najmniejszej z podanych liczb oraz ich œredni¹ arytmetyczn¹.
 */
public class J36 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {
			}
		});

		int l = 0;

		do {
			System.out.println("Podaj liczbe lub 0 zeby zakonczyæ: ");
			l = sc.nextInt();
			list.add(l);

		} while (l != 0);

		for (Integer x : list) {
			System.out.print(x + ", ");
		}
		System.out.println();
		int min = list.get(0);
		for (int i = 1; i < list.size() - 1; i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}

		System.out.println();
		int max = list.get(0);
		for (int i = 1; i < list.size() - 1; i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}

		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Œrednia: " + ((min + max) / 2.0));
		sc.close();
	}

}
