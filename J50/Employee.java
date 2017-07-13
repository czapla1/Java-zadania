package J50;

import java.time.LocalDate;

/*Napisz program, w którym utworzysz dwie klasy:
- Employee - klasa, która będzie przedstawiała pracownika dowolnej
firmy. Podstawowe informacje o pracowniku jakie są potrzebne
pracodawcy to imię, nazwisko, rok urodzenia, staż pracy
- Company - klasa, w której utworzysz 3 obiekty reprezentujące
pracowników, a następnie wyświetlisz informację o nich na ekranie*/
public class Employee {

	private String imie;
	private String nazwisko;
	private LocalDate dataUr;
	private int staz;
	
	
	
	
	public Employee(String imie, String nazwisko, LocalDate dataUr, int staz) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUr = dataUr;
		this.staz = staz;
	}
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
	public int getStaz() {
		return staz;
	}
	public void setStaz(int staz) {
		this.staz = staz;
	}
	public LocalDate getDataUr() {
		return dataUr;
	}
	public void setDataUr(LocalDate dataUr) {
		this.dataUr = dataUr;
	}
	@Override
	public String toString() {
		return "[imie=" + imie + ", nazwisko=" + nazwisko + ", dataUr=" + dataUr + ", staz=" + staz + "]";
	}
	
	
}
