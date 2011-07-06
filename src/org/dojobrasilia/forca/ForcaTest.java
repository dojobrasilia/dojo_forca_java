package org.dojobrasilia.forca;

import static org.junit.Assert.*;

import org.junit.Test;


public class ForcaTest {

	@Test
	public void deve_mostrar_as_letras_como_pontos(){
		Forca f = new Forca("abacate");
		assertEquals(".......",f.output());
	}
	
	@Test
	public void deve_mostrar_as_letras_como_pontos_no_caso_da_maca(){
		Forca f = new Forca("maçã");
		assertEquals("....",f.output());
	}
	
}
