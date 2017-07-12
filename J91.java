package Zadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.util.Scanner;

/*Napisz program w którym użytkownik będzie miał podać ścieżkę dostępu do pliku.
Gdy będzie poprawna należy wyświetlić zawartość pliku na ekranie
W przypadku gdy będzie ona błędna należy obsłużyć wyjątek i poprosić użytkownika o
poprawną ścieżkę*/
public class J91 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {
			}
		});
		boolean flaga = true;
		System.out.println("Podaj scieżkę dostępu do pliku: ");
		String sciezka = sc.nextLine();
		File file = new File(sciezka);
		while (flaga) {
			try {
				Scanner in = new Scanner(file);
				while (in.hasNextLine()) {
					System.out.println(in.nextLine());
				}
				flaga = false;
				in.close();
			} catch (FileNotFoundException e) {
				System.out.println("Niepoprawna ścieżka do pliku, podaj poprawną ścieżkę: ");
				sciezka = sc.nextLine();
				file = new File(sciezka);
			}
		}
		flaga = false;
		sc.close();
	}
}
