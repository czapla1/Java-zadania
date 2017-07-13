package J55;

/*Napisz program, który będzie się składał z dwóch klas:
- Pracownik - przechowująca takie dane jak imię, nazwisko i wiek
pracownika, oraz co najmniej trzy konstruktory, które posłużą do
inicjowania obiektów z różnymi parametrami - w przypadku gdy
przykładowo konstruktor przyjmuje tylko 1 parametr, zainicjuj pozostałe
pola jakimiś domyślnymi wartościami.
- Firma - klasa testowa, w której utworzysz kilka obiektów klasy Pracownik i
wyświetlisz dane na ekran.*/
public class Firma {

	public static void main(String[] args) {
		Pracownik pracownik1 = new Pracownik();
		System.out.println(pracownik1);
		Pracownik pracownik2 = new Pracownik("Tomasz");
		System.out.println(pracownik2);
		Pracownik pracownik3 = new Pracownik("Tomasz", "Kot");
		System.out.println(pracownik3);
		Pracownik pracownik4 = new Pracownik("Tomasz", "Kot", 38);
		System.out.println(pracownik4);

	}

}
