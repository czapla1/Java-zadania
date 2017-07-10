package Zadania;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/*Tablice
Napisz program, który utworzy tablicę 20 liczb całkowitych z przedziału 1...10, a następnie
wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza się w tablicy.*/
public class J43 {

	public static void main(String[] args) {

		int[] tab1 = new int[20];
		Random gen = new Random();
		HashMap<Integer, Integer> mapa = new HashMap<>();

		for (int i = 0; i < tab1.length; i++) {
			tab1[i] = gen.nextInt(10) + 1;
			System.out.print(tab1[i] + " ");
		}
		for (int i = 1; i <= 10; i++) {
			int licznik = 0;
			for (int j = 0; j < tab1.length; j++) {

				if (tab1[j] == i) {
					licznik++;
					mapa.put(i, licznik);
				}
			}
		}

		System.out.println();
		Iterator it = mapa.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println("Liczba: " + pair.getKey() + " wystąpiła: " + pair.getValue() + " raz");

		}

	}
}