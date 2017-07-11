package Zadania;

/*Napisz program który wyliczy ile pudełek jest potrzebnych do rozmieszczenia w nich klocków
 oraz ile bedzie klocków w ostatnim pudełku zakładając zmienna liczbę klocków oraz pojemność pudełek*/
public class J1 {

	public static void main(String[] args) {

		int klocki = 37;
		int ile_w_pudelku = 7;

		int ile_pudelek1 = (klocki / ile_w_pudelku);
		int ile_pudelek2 = (klocki / ile_w_pudelku) + 1;
		int ile_w_ostatnim = klocki % ile_w_pudelku;

		if (ile_w_ostatnim == 0) {
			System.out.println("Ilosc potrzebnych pudełek: " + ile_pudelek1);
			System.out.println("Ilość klocków w ostatnim pudełku: " + ile_w_pudelku);
		} else {
			System.out.println("Ilosc potrzebnych pudełek: " + ile_pudelek2);
			System.out.println("Ilość klocków w ostatnim pudełku: " + ile_w_ostatnim);
		}

	}

}
