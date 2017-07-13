package J52_2;

/*Napisz program sk�adaj�cy si� przynajmniej z dw�ch klas. Kt�ry b�dzie imitowa� kase
fiskaln�.
-Sprzedawanie produkt�w
-Wydruk zakupionych produkt�w wraz z cenami
-Suma kt�r� trzeba zap�aci�.*/
import java.util.ArrayList;
import java.util.List;

public class Koszyk {
	private List<Produkt> listaProduktow;
	private double suma;

	public Koszyk() {
		listaProduktow = new ArrayList<>();
		suma = 0.0;
	}

	public List<Produkt> getListaProduktow() {
		return listaProduktow;
	}

	public void setListaProduktow(List<Produkt> listaProduktow) {
		this.listaProduktow = listaProduktow;
	}

	public void addProduct(Produkt produkt) {
		this.listaProduktow.add(produkt);
		suma += produkt.getCena();

	}

	public void drukujParagon() {
		for (Produkt p : listaProduktow) {
			System.out.println(p);
		}

		System.out.println("Razem: " + suma);

	}

}
