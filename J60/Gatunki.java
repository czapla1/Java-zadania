package J60;

/*Stwórz program Gatunki w którym będzie utworzonych kilka obiektów typu Gatunek
- Klasa Gatunek powinna zawierać:
- pola przechowujące:
- nazwę rodzaju
- nazwę gatunkową
- liczbę chromosomów
- Opis metody:
- podającą pełną nazwę (Rodzaj + gatunek)
- podającą liczbę chromosomów
- wypisującą wszystkie dane Gatunek o wartościach pól takich samych jak w
obiekcie, w którym została wywołana.
- W programie powinny być użyte wszystkie metody.*/
public class Gatunki {

	String nazwaRodzaju;
	String nazwaGatunkowa;
	int liczbaChromosomow;

	public Gatunki(int liczbaChromosomow) {
		this.liczbaChromosomow = liczbaChromosomow;
	}

	public Gatunki(String nazwaRodzaju, String nazwaGatunkowa) {
		this.nazwaRodzaju = nazwaRodzaju;
		this.nazwaGatunkowa = nazwaGatunkowa;
	}

	public Gatunki(String nazwaRodzaju, String nazwaGatunkowa, int liczbaChromosomow) {
		this.nazwaRodzaju = nazwaRodzaju;
		this.nazwaGatunkowa = nazwaGatunkowa;
		this.liczbaChromosomow = liczbaChromosomow;
	}

	public String getNazwaRodzaju() {
		return nazwaRodzaju;
	}

	public void setNazwaRodzaju(String nazwaRodzaju) {
		this.nazwaRodzaju = nazwaRodzaju;
	}

	public String getNazwaGatunkowa() {
		return nazwaGatunkowa;
	}

	public void setNazwaGatunkowa(String nazwaGatunkowa) {
		this.nazwaGatunkowa = nazwaGatunkowa;
	}

	public int getLiczbaChromosomow() {
		return liczbaChromosomow;
	}

	public void setLiczbaChromosomow(int liczbaChromosomow) {
		this.liczbaChromosomow = liczbaChromosomow;
	}

	public void opis() {
		System.out.println("Nazwa rodzaju to: " + getNazwaRodzaju() + ", nazwa gatunkowa to:  " + getNazwaGatunkowa());
	}

	public void liczbaChrom() {
		System.out.println("Liczba chromosomów to: " + getLiczbaChromosomow());
	}

	public void opisPelny() {
		System.out.println("Nazwa rodzaju to: " + getNazwaRodzaju() + ", nazwa gatunkowa to:  " + getNazwaGatunkowa()
				+ ", liczba chromosomów to: " + getLiczbaChromosomow());
	}
}
