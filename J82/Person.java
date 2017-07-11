package J82;

/*Napisz aplikację, która będzie pozwalała wczytać informacje o pracownikach firmy,
albo pobierając je od użytkownika, albo wczytując je z dysku.
Klasy, które powinna posiadać aplikacja:
Person - klasa reprezentująca osobę (imię nazwisko)
Employee - klasa reprezentująca pracownika (imię, nazwisko, wypłata) -
rozszerza klasę Person
Company - klasa przechowująca tablicę pracowników, powinna móc
przechowywać informacje o 3 pracownikach
CompanyApp - klasa, która pozwala wczytywać dane od użytkownika i
zapisać je na dysku lub odczytać dane z dysku i wyświetlić je na ekranie.*/

public class Person {

	private String imie;
	private String nazwisko;
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	
	
}
