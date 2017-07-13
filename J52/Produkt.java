package J52;

/*Napisz program składający się przynajmniej z dwóch klas. Który będzie imitował kase
fiskalną.
-Sprzedawanie produktów
-Wydruk zakupionych produktów wraz z cenami
-Suma którą trzeba zapłacić.*/
public class Produkt {
	private String nazwa;
	private double cena;

	public Produkt(String nazwa, double cena) {
		this.nazwa = nazwa;
		this.cena = cena;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Produkt: " + nazwa + ", cena: " + cena;
	}

}
