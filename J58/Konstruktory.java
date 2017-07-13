package J58;

/*Napisz kasę zawierającą dwa pola: pierwsze typu double i drugie typu char.
- Dopisz cztery przeciążone konstruktory:
- pierwszy przyjmujący jeden argument typu double,
- drugi przyjmujący jeden argument typu char,
- trzeci przyjmujący dwa argumenty – pierwszy typu double i drugi typu
char
- czwarty przyjmujący również dwa argumenty, ale w odwrotnej kolejności.
-Zmodyfikuj poprzedni program tak aby w konstruktorach dwuargumentowych były
wykorzystywane konstruktory jednoargumentowe.
*/
public class Konstruktory {

	double liczba;
	char znak;

	public Konstruktory(double liczba) {
		this.liczba = liczba;
	}

	public Konstruktory(char znak) {
		this.znak = znak;
	}

	public Konstruktory(double liczba, char znak) {
		this(liczba);
		this.znak = znak;
	}

	public Konstruktory(char znak, double liczba) {
		this(znak);
		this.liczba = liczba;
	}

	@Override
	public String toString() {
		return "Konstruktory [liczba=" + liczba + ", znak=" + znak + "]";
	}

}
