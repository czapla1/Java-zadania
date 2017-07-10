package Zadania;
/*Tablice
Napisz program, w którym zadeklarujesz dwie tablice typu ca³kowitoliczbowego, które
bêd¹ przechowywa³y po 3 dowolne liczby typu int.
Program powinien wyœwietliæ sumê wszystkich liczb z obu tablic.*/
public class J41 {

	public static void main(String[] args) {
    int[]tab1={2,4,6};
    int[]tab2={11,14,20};	
		
    int suma1=0;
    int suma2=0;
    
    for(int i=0;i<tab1.length;i++){
    	suma1+=tab1[i];
    }
    for(int j=0;j<tab2.length;j++){
    	suma2+=tab2[j];
    }
    System.out.println("Suma wartoœci w tablicy 1 wynosi: "+ suma1);
    System.out.println("Suma wartoœci w tablicy 2 wynosi: "+ suma2);
    System.out.println("Suma wartoœci w obu tablicach wynosi: "+(suma1+suma2));
	}

}
