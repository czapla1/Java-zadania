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
public class GatunkiTest {

	public static void main(String[] args) {
		Gatunki mrowka = new Gatunki("mrówka", "mrówka faraona", 34);
		mrowka.opis();
		mrowka.opisPelny();
		mrowka.liczbaChrom();
		System.out.println();
		Gatunki niezapominajka = new Gatunki("niezapominajka", "niezapominajka błotna", 12);
		niezapominajka.opis();
		niezapominajka.opisPelny();
		niezapominajka.liczbaChrom();

	}

}
