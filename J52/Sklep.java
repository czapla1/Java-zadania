package J52;

/*Napisz program składający się przynajmniej z dwóch klas. Który będzie imitował kase
fiskalną.
-Sprzedawanie produktów
-Wydruk zakupionych produktów wraz z cenami
-Suma którą trzeba zapłacić.*/
import java.util.ArrayList;
import java.util.List;

public class Sklep {

	public static void main(String[] args) {

		Koszyk koszyk1 = new Koszyk();
		List<Produkt> listaProduktowWSklepie = new ArrayList<>();
		listaProduktowWSklepie.add(new Produkt("mleko", 3.50));
		listaProduktowWSklepie.add(new Produkt("mąka", 2.50));
		listaProduktowWSklepie.add(new Produkt("masło", 5.50));

		koszyk1.addDoKoszyka(listaProduktowWSklepie.get(0));
		koszyk1.addDoKoszyka(listaProduktowWSklepie.get(1));
		koszyk1.addDoKoszyka(listaProduktowWSklepie.get(2));
		koszyk1.drukujParagon();
	}

}
