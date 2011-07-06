package org.dojobrasilia.forca;

public class Forca {

	private String palavra;
	
	public Forca(String string) {
		palavra = string;
	}

	public Object output() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < palavra.length(); i++) {
			sb.append('.');
		}
		return sb.toString();
	}

}
