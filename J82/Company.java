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
public class Company {
private String[]pracownicy;

public Company() {
	
	pracownicy =new String[2];
}

public String[] getPracownicy() {
	return pracownicy;
}

public void setPracownicy(String[] pracownicy) {
	this.pracownicy = pracownicy;
}


}
