package Zadania;

import java.util.Scanner;
/*P�tle
 Napisz program rysuj�cy w konsoli �choink� z�o�on� ze znak�w gwiazdki (*).
U�ytkownik programu powinien poda� liczb� ca�kowit� n, n > 0, okre�laj�c� wysoko��
choinki (liczb� wierszy)*/
public class J39 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj wysoko�c choinki n, n > 0: ");
		int wys = sc.nextInt();

		for (int i = 1; i <= wys; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}
