package J52;

/*Napisz program składający się przynajmniej z dwóch klas. Który będzie imitował kase
fiskalną.
-Sprzedawanie produktów
-Wydruk zakupionych produktów wraz z cenami
-Suma którą trzeba zapłacić.*/
import java.util.ArrayList;

public class Koszyk {

	private double suma;
	private ArrayList<Produkt> listaZakupow;

	public Koszyk() {

		this.listaZakupow = new ArrayList<>();
		this.suma = 0.0;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public ArrayList<Produkt> getListaZakupow() {
		return listaZakupow;
	}

	public void setListaZakupow(ArrayList<Produkt> listaZakupow) {
		this.listaZakupow = listaZakupow;
	}

	public void addDoKoszyka(Produkt produkt) {
		listaZakupow.add(produkt);
		suma += produkt.getCena();
	}

	public void drukujParagon() {
		for (Produkt p : listaZakupow) {
			System.out.println(p);
		}

		System.out.println("Razem do zapłaty: " + suma);
	}

}
