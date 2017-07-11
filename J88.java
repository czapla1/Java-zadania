package Zadania;

import java.util.Random;

/*Napisz trzy nowe wyjątki oraz metodę, która za każdym wywołanie będzie losowo
zgłaszała jeden z nich.
Otocz wywołanie tej metody instrukcją try-catch zawierającą po jednym bloku catch dla
każdego z wyjątków. Niech każdy blok catch wypisuje, który wyjątek złapała.*/
public class J88 {

	private class FirstExc extends Exception {
	}

	private class SecondExc extends Exception {
	}

	private class ThirdExc extends Exception {
	}

	public void losujWyjatek() throws FirstExc, SecondExc, ThirdExc {
		Random gen = new Random();
		int los = gen.nextInt(3) + 1;
		if (los == 1) {
			System.out.println("Wylosowana liczba to: " + los);
			throw new FirstExc();
		} else if (los == 2) {
			System.out.println("Wylosowana liczba to: " + los);
			throw new SecondExc();
		} else if (los == 3) {
			System.out.println("Wylosowana liczba to: " + los);
			throw new ThirdExc();
		}
	}

	public static void main(String[] args) {

		J88 obiekt = new J88();
		try {
			obiekt.losujWyjatek();
		} catch (FirstExc e) {
			System.out.println("Wyjątek FirstExc");
		} catch (SecondExc e) {
			System.out.println("Wyjątek SecondExc");
		} catch (ThirdExc e) {
			System.out.println("Wyjątek thirdExc");
		}

	}

}
