package Zadania;

import java.util.Scanner;
/*Pêtle
 Napisz program pobieraj¹cy od u¿ytkownika dwie liczby ca³kowite A oraz B, A < B, a
nastêpnie wyznaczaj¹cy sumê ci¹gu liczb od A do B, czyli sumê ci¹gu (A,A + 1,...,B).
 */
public class J33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj A: ");
		int a= sc.nextInt();
		System.out.println("Podaj B (B>A): ");
		int b= sc.nextInt();
	
		
		
		/*Petla for
		 * int suma=0;
		Integer []tab= new Integer[b-a];
		tab[0]=a;
		for(int i=1;a<b-1;i++){
			tab[i]=tab[i-1]+1;
			a=tab[i];
		}
		for(int x:tab){
			suma+=x;
		}
		
		System.out.println(suma);*/
		
		/*int wyraz=a;
		int suma=wyraz;
		while(wyraz<b-1){
			wyraz+=1;
			suma+=wyraz;
		}
		System.out.println(suma);*/
		
		
		int wyraz=a;
		int suma=wyraz;
		do{
			wyraz+=1;
			suma+=wyraz;
		}while(wyraz<b-1);
		System.out.println("Suma ci¹gu liczb od "+a+" do "+b+" wynosi: "+suma);
		
		
		sc.close();
	}

}
