package com.example.infonegara;

public class RincianData {
	private String negara ;
	private String ibukota;
	private String benua;
	private String berdiri;
	private String matauang;
	private double luas;
	private int idBendera;

	// Konstruktor
	public RincianData(String negara, 
			           String ibukota,
			           String benua,
	                   String berdiri,
	                   String matauang,
	                   double luas,
			           int idBendera) {
		this.negara = negara;
		this.ibukota = ibukota;
		this.benua = benua;
		this.berdiri = berdiri;
		this.matauang = matauang;
		this.luas = luas;
		this.idBendera = idBendera;
	}
	
	// Metode lain-lain
	public String perolehNegara() {
		return negara;
	}
	
	public String perolehIbukota() {
		return ibukota;
	}
	
	public String perolehBenua() {
		return benua;
	}
		
	public String perolehBerdiri() {
		return berdiri;
	}

	public String perolehMatauang() {
		return matauang;
	}

	public double perolehLuas() {
		return luas;
	}

	public int perolehIdBendera() {
		return idBendera;
	}
	
}