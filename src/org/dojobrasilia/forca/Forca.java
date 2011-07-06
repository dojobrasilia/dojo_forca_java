package org.dojobrasilia.forca;

public class Forca {

	private String palavra;
	
	public Forca(String palavra) {
		this.palavra = palavra;
	}

	public String output() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < palavra.length(); i++) {
			sb.append('.');
		}
		return sb.toString();
	}

}
