package J61;
/*Rozwiń program Gatunki, w ten sposób, żeby:
- obiekt typu Gatunek mógł przechowywać dane chromosomów. Powinna to być
tablica obiektów typu Chromosom o długości odpowiadającej liczbie
chromosomów
- Utwórz klasę Chromosom:
- w ten sposób aby dane dotyczące numeru chromosomu i długości ramion były
wprowadzane tylko wtedy, jeśli podane liczby są większe od 0 w przypadku numeru
chromosomu i większe lub równe 0 w przypadku długości ramion
- dodaj konstruktory:
- przyjmujący jako argumenty numer chromosomu i długości ramion, pole plciowy ustawiający
domyślnie jako false
- przyjmujący jako argumenty wszystkie dane
- kolejne gatunki były przechowywane w tablicy obiektów typu Gatunek

*/
public class Chromosom {
private int nrChrom;
int dl_ramion;
private boolean plciowy;

public Chromosom(int nrChrom, int dl_ramion) {
	this.nrChrom= this.nrChrom;
	this.dl_ramion= dl_ramion;
	this.plciowy=false;
}
public Chromosom(int nrChrom, int dl_ramion, boolean plciowy) {
	this(nrChrom, dl_ramion);
	this.plciowy=plciowy;
}
public int getNrChrom() {
	return nrChrom;
}
public void setNrChrom(int nrChrom) {
	if(nrChrom>0){
		this.nrChrom = nrChrom;
	}
}
public int getDl_ramion() {
	return dl_ramion;
}
public void setDl_ramion(int dl_ramion) {
	if(dl_ramion>=0){
		this.dl_ramion = dl_ramion;
	}
}
public boolean isPlciowy() {
	return plciowy;
}
public void setPlciowy(boolean plciowy) {
	this.plciowy = plciowy;
}




}
