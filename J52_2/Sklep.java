package J52_2;

import java.util.HashMap;
import java.util.Scanner;

public class Sklep {

	public static void main(String[] args) {
		HashMap<String, Produkt> listaProduktowWSklepie = new HashMap<>();
		Produkt p1 = new Produkt("maslo", 5.20);
		Produkt p2 = new Produkt("chleb", 3.20);
		Produkt p3 = new Produkt("mleko", 2.50);
		listaProduktowWSklepie.put(p1.getNazwa(), p1);
		listaProduktowWSklepie.put(p2.getNazwa(), p2);
		listaProduktowWSklepie.put(p3.getNazwa(), p3);

		Koszyk koszyk1 = new Koszyk();
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj produkt lub koniec: ");
		String produkt = sc.nextLine();

		while (true) {
			if (!produkt.toLowerCase().equals("koniec")) {
				if (listaProduktowWSklepie.containsKey(produkt)) {
					koszyk1.addProduct(listaProduktowWSklepie.get(produkt));
					System.out.println("Podaj produkt lub koniec: ");
					produkt = sc.nextLine();
				} else {
					System.out.println("Nie ma takiego produktu w sklepie!");
					System.out.println("Podaj produkt lub koniec: ");
					produkt = sc.nextLine();
				}
			} else {
				break;
			}
		}

		koszyk1.drukujParagon();
		sc.close();
	}

}
