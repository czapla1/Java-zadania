package J50;

import java.time.LocalDate;

/*Napisz program, w którym utworzysz dwie klasy:
- Employee - klasa, która będzie przedstawiała pracownika dowolnej
firmy. Podstawowe informacje o pracowniku jakie są potrzebne
pracodawcy to imię, nazwisko, rok urodzenia, staż pracy
- Company - klasa, w której utworzysz 3 obiekty reprezentujące
pracowników, a następnie wyświetlisz informację o nich na ekranie*/
public class Company {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(1987, 07, 23);
		Employee prac1 = new Employee("Jan", "Nowak", date1, 5);
		LocalDate date2 = LocalDate.of(1986, 01, 21);
		Employee prac2 = new Employee("Tomasz", "Kot", date2, 5);
		LocalDate date3 = LocalDate.of(1987, 07, 23);
		Employee prac3 = new Employee("Ola", "Kowalska", date3, 5);

		System.out.println(prac1);
		System.out.println(prac2);
		System.out.println(prac3);
	}

}
