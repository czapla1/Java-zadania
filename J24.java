package Zadania;

import java.util.Scanner;

/*Operacje wejscia-wyjscia
Napisz program, kt�ry wy�wietla napis w kolejno�ci liter odwrotnej wzgl�dem
orygina�u.*/
public class J24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj zdanie: ");
		String zdanie = sc.nextLine();
		StringBuffer strb = new StringBuffer();
		StringBuffer strb1 = strb.append(zdanie);
		System.out.println("Wyraz '"+strb+"' czytany od ty�u to: "+strb1.reverse());

		sc.close();
	}

}
