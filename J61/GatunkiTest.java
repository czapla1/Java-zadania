package J61;

import java.util.Scanner;

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

Rozwiń program Gatunki , w ten sposób, żeby:
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
public class GatunkiTest {

	public static void main(String[] args) {
		
		Gatunki[]tablica= new Gatunki[2];
		/*Gatunki mrowka = new Gatunki("mrówka", "mrówka faraona", 34);
		mrowka.opis();
		mrowka.opisPelny();
		mrowka.liczbaChrom();
		System.out.println();
		Gatunki niezapominajka = new Gatunki("niezapominajka", "niezapominajka błotna", 12);
		niezapominajka.opis();
		niezapominajka.opisPelny();
		niezapominajka.liczbaChrom();*/
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<tablica.length;i++){
			System.out.println("Podaj nazwe rodzaju: ");
			String nazwaRodz=sc.nextLine();
			System.out.println("Podaj nazwe gatunkową: ");
			String nazwaGat=sc.nextLine();
			
			System.out.println("Podaj ilość chromowomow: ");
			int ilChrom=sc.nextInt();
			sc.nextLine();
			Gatunki gatunek = new Gatunki(nazwaRodz, nazwaGat, ilChrom);
			tablica[i]=gatunek;
		}
		
		for(int i=0;i<tablica.length;i++){
			tablica[i].opis();
			tablica[i].opisPelny();
			tablica[i].liczbaChrom();;
		}
		sc.close();
	}

}
