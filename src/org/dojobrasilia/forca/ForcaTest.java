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
	
	@Test
	public void deve_comecar_com_10_chutes(){
		Forca f = new Forca("oi");
		assertEquals(10, f.chutes());
	}

	@Test
	public void deve_decrementar_os_chutes(){
		Forca f = new Forca("oi");
		f.chuta('a');
		assertEquals(9, f.chutes());
	}

	
}
