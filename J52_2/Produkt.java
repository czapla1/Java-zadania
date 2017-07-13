package J52_2;

public class Produkt {
	private String nazwa;
	private double cena;

	public Produkt(String nazwa) {
		this.nazwa = nazwa;
	}

	public Produkt(String nazwa, double cena) {
		super();
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
		return "Produkt [nazwa=" + nazwa + ", cena=" + cena + "]";
	}

}
