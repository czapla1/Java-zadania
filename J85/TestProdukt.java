package J85;

import java.util.ArrayList;
import java.util.Scanner;

public class TestProdukt {

	public static void main(String[] args) {
		ArrayList<Produkt> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String wybor = "";
		boolean flaga = true;
		do {
			System.out.println("Podaj nazwę produktu lub koniec żeby zakończyć: ");
			wybor = sc.nextLine();
			Produkt produkt = new Produkt(wybor);
			if (!wybor.toLowerCase().equals("koniec")) {
				lista.add(produkt);
			} else {
				flaga = false;
			}

		} while (flaga);

		for (Produkt p : lista) {
			System.out.println(
					p.getNazwaProd() + " data produkcji: " + p.getDataProd() + " data użycia:  " + p.getDataUzycia());
		}

		sc.close();
	}

}
