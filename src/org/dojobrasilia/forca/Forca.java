package org.dojobrasilia.forca;

public class Forca {

	private String palavra;
	private int chutes;
	
	public Forca(String palavra) {
		this.palavra = palavra;
		this.chutes=10;
	}

	public String output() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < palavra.length(); i++) {
			sb.append('.');
		}
		return sb.toString();
	}

	public int chutes() {
		return chutes;
	}

	public void chuta(char c) {
		if(!palavra.contains(""+c)) {
			chutes -= 1;
		}
	}

}
