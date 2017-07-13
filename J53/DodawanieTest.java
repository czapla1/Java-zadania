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
public class DodawanieTest {

	public static void main(String[] args) {
		Dodawanie test1 = new Dodawanie();
		test1.dodaj(3, 4);
		test1.dodaj(3.34, 4.67);
		test1.dodaj(4,7,9);
		test1.dodaj(4.34,7.67,9.89);

	}

}
