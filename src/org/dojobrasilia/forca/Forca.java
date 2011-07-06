package org.dojobrasilia.forca;

public class Forca {

	private String palavra;
	private int chutes;
	private StringBuilder output;
	
	public Forca(String palavra) {
		this.palavra = palavra;
		this.chutes=10;
		output = new StringBuilder();
		for (int i = 0; i < palavra.length(); i++) {
			output.append('.');
		}
	}

	public String output() {
		return output.toString();
	}

	public int chutes() {
		return chutes;
	}

	public void chuta(char c) {
		if(palavra.contains(""+c)) {
			int i = palavra.indexOf(c) ; 
			do {
				output.setCharAt(i, c);
				i = palavra.indexOf(c, i + 1 );
			}while (i != -1);
		} else {
			chutes -= 1;
		}
	}

}
