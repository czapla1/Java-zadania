package J53;

/*Napisz program składający się z dwóch klas.
-Pierwsza niech zawiera kilka metod o nazwie dodaj(), ale zwracających
różne typy wyników i przyjmujących po minimum dwa parametry typów
liczbowych wybranych przez Ciebie. Ich zadaniem jest zwrócenie, lub
wyświetlanie sumy podanych argumentów.
- W drugiej klasie Testowej utwórz obiekt tej klasy i sprawdź działanie
swoich metod, wyświetlając wyniki działań na ekranie.
- Dodatkowo każda z metod niech wyświetla jaki zwraca typ i rodzaj
argumentów które pobrała, abyś wiedział, która z nich zadziałała.*/
public class Dodawanie {

	public void dodaj(int a, int b) {
		int suma = a + b;
		System.out.println("Metoda pobiera argumenty typu int i zwraca wynik typu int ");
		System.out.println("Suma liczb: " + a + " i " + b + " wynosi: " + suma + "\n");
	}

	public void dodaj(double a, double b) {
		double suma = a + b;
		System.out.println("Metoda pobiera argumenty typu double i zwraca wynik typu double ");
		System.out.println("Suma liczb: " + a + " i " + b + " wynosi: " + suma+ "\n");
	}

	public void dodaj(int a, int b, int c) {
		int suma = a + b + c;
		System.out.println("Metoda pobiera argumenty typu int i zwraca wynik typu int ");
		System.out.println("Suma liczb: " + a + " i " + b +" i "+ c+" wynosi: " + suma + "\n");
	}
	public void dodaj (double a, double b, double c) {
		double suma = a + b + c;
		System.out.println("Metoda pobiera argumenty typu double i zwraca wynik typu double ");
		System.out.println("Suma liczb: " + a + " i " + b +" i "+ c+" wynosi: " + suma + "\n");
	}
	
}
