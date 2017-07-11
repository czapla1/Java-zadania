package Zadania;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

public class J83 {

	/*
	 * Operacje na plikach Napisz program który będzie pobierał ciągi znaków od
	 * użytkownika i będzie je zapisywał w kolejnych liniach pliku tekstowego
	 * dopóki użytkownik nie w piszę „koniec” Następnie wyświetl cały zawartość
	 * pliku do którego został wpisany tekst.
	 */

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {
			}
		});

		String ciag = "";
		File file = new File("P1.txt");
		FileWriter fileWriter = new FileWriter(file, true);
		do {
			System.out.println("Podaj ciąg znaków do zapisu: ");

			fileWriter.write(ciag + "\n");
			ciag = sc.nextLine();
		} while (!ciag.toLowerCase().equals("koniec"));

		fileWriter.close();

		System.out.println("Odczyt danych z pliku: ");
		Scanner in = new Scanner(file);
		while (in.hasNext()) {
			System.out.print(in.nextLine() + "\n");
		}
		in.close();
		sc.close();
	}

}
