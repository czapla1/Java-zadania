package Obektowosc;

import java.util.Locale;
import java.util.Scanner;

public class PoleProstokata {
	/*Napisz zgodnie z zasadami programowania obiektowego program, który oblicza pole prostokąta. Klasa powinna zawierać
	trzy metody:
	1)czytaj_dane() — metoda umożliwia wprowadzenie do
	programu długości boków a i b z klawiatury. W programie
	należy przyjąć, że a i b oraz zmienna pole są typu double
	(rzeczywistego).
	2)przetworz_dane() — metoda oblicza pole prostokąta
	według wzoru pole = a*b.
	3)wyswietl_wynik() — metoda wyświetla długości boków a i b
	oraz wartość zmiennej pole w określonym formacie.
	Dla zmiennych a i b oraz pole należy przyjąć format
	wyświetlania ich na ekranie z dwoma miejscami po
	przecinku*/
	
	private double a;
	private double b;
	private double pole;
	
	public void czytaj_dane(){
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Podaj szerkosc prostokata a:");
		a=sc.nextDouble();
		System.out.println("Podaj długość prostokata b:");
		b=sc.nextDouble();
		sc.close();
	}
	public void przetworz_dane(){
	pole=a*b;	
	}
	public void wyswietl_wynik() {
		System.out.printf("Podana szerokość prostokąta to: %.2f",a);
		System.out.printf("\nPodana długość prostokąta to: %.2f",b);
		System.out.printf("\nPole prostokąta wynosi: %.2f",pole);
	}
	
	public static void main(String[] args) {
        PoleProstokata poleProstokata=new PoleProstokata();
        poleProstokata.czytaj_dane();
        poleProstokata.przetworz_dane();
        poleProstokata.wyswietl_wynik();
	}

}
