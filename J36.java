package Zadania;

import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*P�tle
 Napisz program, kt�ry pobiera od u�ytkownika ci�g liczb ca�kowitych. Pobieranie
danych ko�czone jest podaniem warto�ci 0 (nie wliczana do danych).
W nast�pnej kolejno�ci program powinien wy�wietli� sum� najwi�kszej oraz
najmniejszej z podanych liczb oraz ich �redni� arytmetyczn�.
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
			System.out.println("Podaj liczbe lub 0 zeby zakonczy�: ");
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
		System.out.println("�rednia: " + ((min + max) / 2.0));
		sc.close();
	}

}
