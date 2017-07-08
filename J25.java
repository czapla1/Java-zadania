package Zadania;

import java.util.Scanner;

/*Operacje wejscia-wyjscia
 Napisz program zliczaj¹cy litery, znaki bia³e, cyfry wprowadzone z klawiatury*/
public class J25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj zdanie zawiaraj¹ce litery, znaki bia³e i cyfry: ");
		String zdanie = sc.nextLine();
		zdanie = zdanie.toLowerCase();
		int licznik = 0;
		int licznik1 = 0;
		int licznik2 = 0;
		for (int i = 0; i < zdanie.length(); i++) {
			if (zdanie.charAt(i) >= 97 && zdanie.charAt(i) <= 122) {
				licznik++;
			} else if (zdanie.charAt(i) >= 48 && zdanie.charAt(i) <= 57) {
				licznik1++;
			} else if (zdanie.charAt(i) == ' ' || zdanie.charAt(i) == '\n' || zdanie.charAt(i) == '\t') {
				licznik2++;
			}
		}
		System.out.println("Iloœæ liter: " + licznik);
		System.out.println("Iloœæ liczb: " + licznik1);
		System.out.println("Iloœæ znaków bia³ych: " + licznik2);
		sc.close();
	}

}
