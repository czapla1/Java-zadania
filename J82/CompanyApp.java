package J82;

import java.io.File;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

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
public class CompanyApp {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		String decyzja;
		
		Company com= new Company();
		String zmienna="";
		File file = new File("P1.txt");
		FileWriter fw = new FileWriter(file,true);
		
		do{
		System.out.println("Co chcesz zrobić? \n1-wpisać dane, \n2-odczytać dane, \nkoniec - zakończyć,");
		decyzja= sc.nextLine();
		if(decyzja.equals("1")){
			int i=0;
			while(i<com.getPracownicy().length){
				Employee emp= new Employee();
				System.out.println("Podaj imie: ");
				zmienna= sc.nextLine();
				emp.setImie(zmienna);
				fw.write(zmienna+" ");
				System.out.println("Podaj nazwisko: ");
				zmienna= sc.nextLine();
				emp.setNazwisko(zmienna);
				fw.write(zmienna+" ");
				System.out.println("Podaj wypłatę: ");
				zmienna= sc.nextLine();
				emp.setWyplata(zmienna);
				fw.write(zmienna+" ");
				
				i++;
				
			}
			
			fw.close();
		}else if(decyzja.equals("2")){
			Scanner in= new Scanner(file);
			while(in.hasNextLine()){
				System.out.println(in.nextLine());
			}
			in.close();
		}
		
		
		}while(!decyzja.toLowerCase().equals("koniec"));
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
