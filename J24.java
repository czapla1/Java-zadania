package Zadania;

import java.util.Scanner;

/*Operacje wejscia-wyjscia
Napisz program, który wyœwietla napis w kolejnoœci liter odwrotnej wzglêdem
orygina³u.*/
public class J24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj zdanie: ");
		String zdanie = sc.nextLine();
		StringBuffer strb = new StringBuffer();
		StringBuffer strb1 = strb.append(zdanie);
		System.out.println("Wyraz '"+strb+"' czytany od ty³u to: "+strb1.reverse());

		sc.close();
	}

}
