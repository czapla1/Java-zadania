package J85;

import java.time.LocalDate;

public class Produkt {

	private LocalDate dataProd;
	private LocalDate dataUzycia;
	private String nazwaProd;

	public Produkt(String nazwaProd) {

		this.nazwaProd = nazwaProd;
		this.dataProd = LocalDate.now();
		setDataUzycia();
	}

	public LocalDate getDataProd() {
		return dataProd;
	}

	public LocalDate getDataUzycia() {
		return dataUzycia;
	}

	public void setDataUzycia() {
		String nazwaProdTemp = getNazwaProd();
		if (nazwaProdTemp.toLowerCase().contains("mleczny zapakowany")) {
			this.dataUzycia = dataProd.plusWeeks(2);
		} else if (nazwaProdTemp.toLowerCase().contains("mleczny")) {
			this.dataUzycia = dataProd.plusDays(4);
		} else if (nazwaProdTemp.toLowerCase().contains("puszka")) {
			this.dataUzycia = dataProd.plusYears(2);
		} else {
			this.dataUzycia = dataProd;
		}

	}

	public String getNazwaProd() {
		return nazwaProd;
	}

	public void setNazwaProd(String nazwaProd) {
		this.nazwaProd = nazwaProd;
	}

}
