package J55;

/*Napisz program, który będzie się składał z dwóch klas:
- Pracownik - przechowująca takie dane jak imię, nazwisko i wiek
pracownika, oraz co najmniej trzy konstruktory, które posłużą do
inicjowania obiektów z różnymi parametrami - w przypadku gdy
przykładowo konstruktor przyjmuje tylko 1 parametr, zainicjuj pozostałe
pola jakimiś domyślnymi wartościami.
- Firma - klasa testowa, w której utworzysz kilka obiektów klasy Pracownik i
wyświetlisz dane na ekran.*/
public class Pracownik {
	private String imie;
	private String nazwisko;
	private int wiek;

	public Pracownik() {
		this.imie = "brak";
		this.nazwisko = "brak";
		this.wiek = 0;
	}

	public Pracownik(String imie) {
		this();
		this.imie = imie;
		this.nazwisko = "brak";
		this.wiek = 0;
	}

	public Pracownik(String imie, String nazwisko) {
		this(imie);
		this.nazwisko = nazwisko;
		this.wiek = 0;
	}

	public Pracownik(String imie, String nazwisko, int wiek) {
		this(imie, nazwisko);
		this.wiek = wiek;
	}

	@Override
	public String toString() {
		return "Pracownik [imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + "]";
	}

}
