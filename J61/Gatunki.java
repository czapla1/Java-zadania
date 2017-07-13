package J61;

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
- W programie powinny być użyte wszystkie metody.

Rozwiń program Gatunki, w ten sposób, żeby:
- obiekt typu Gatunek mógł przechowywać dane chromosomów. Powinna to być
tablica obiektów typu Chromosom o długości odpowiadającej liczbie
chromosomów
- Utwórz klasę Chromosom:
- w ten sposób aby dane dotyczące numeru chromosomu i długości ramion były
wprowadzane tylko wtedy, jeśli podane liczby są większe od 0 w przypadku numeru
chromosomu i większe lub równe 0 w przypadku długości ramion
- dodaj konstruktory:
- przyjmujący jako argumenty numer chromosomu i długości ramion, pole plciowy ustawiający
domyślnie jako false
- przyjmujący jako argumenty wszystkie dane
- kolejne gatunki były przechowywane w tablicy obiektów typu Gatunek

*/
public class Gatunki {

	String nazwaRodzaju;
	String nazwaGatunkowa;
	int liczbaChromosomow;
	Chromosom [] tablica;

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

	
	
	public Gatunki(String nazwaRodzaju, String nazwaGatunkowa, int liczbaChromosomow, Chromosom[] tablica) {
		this(nazwaRodzaju, nazwaGatunkowa,liczbaChromosomow);
		this.tablica = new Chromosom[liczbaChromosomow];
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
