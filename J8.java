package Zadania;

/*Napisz program sortujący liczby podane w tabeli*/
public class J8 {

	public static void main(String[] args) {

		int[] tab11 = { 5, 3, 2, 6, 4 };

		int pom;
		for (int i = 0; i < tab11.length; i++) {
			for (int j = 0; j < tab11.length - 1; j++) {
				if (tab11[j + 1] < tab11[j]) {
					pom = tab11[j + 1];
					tab11[j + 1] = tab11[j];
					tab11[j] = pom;
				}
			}

		}
		System.out.println("Posortowane wartości to:  ");
		for (int i = 0; i < tab11.length; i++) {
			System.out.print(tab11[i] + " ");
		}

	}

}
