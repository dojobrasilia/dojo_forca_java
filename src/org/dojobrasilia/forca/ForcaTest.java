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

	@Test
	public void deve_manter_os_chutes_qndo_acerta(){
		Forca f = new Forca("oi");
		f.chuta('o');
		assertEquals(10, f.chutes());
	}

	@Test
	public void deve_manter_o_output_qndo_erra(){
		Forca f = new Forca("oi");
		f.chuta('a');
		assertEquals("..", f.output());
	}

	@Test
	public void deve_mostrar_o_acerto_no_output(){
		Forca f = new Forca("oi");
		f.chuta('o');
		assertEquals("o.", f.output());
	}
	
	@Test
	public void deve_mostrar_o_acerto_no_output_para_segunda_letra(){
		Forca f = new Forca("oi");
		f.chuta('i');
		assertEquals(".i", f.output());
	}
	
	@Test
	public void deve_mostrar_varios_acertos_no_output(){
		Forca f = new Forca("asa");
		f.chuta('a');
		assertEquals("a.a", f.output());
	}
	
	@Test
	public void deve_mostrar_varios_acertos_no_output_para_uma_palavra_grande(){
		Forca f = new Forca("abracadabra");
		
		f.chuta('a');
		assertEquals("a..a.a.a..a", f.output());
		
		f.chuta('r');
		assertEquals("a.ra.a.a.ra", f.output());
		assertEquals(10, f.chutes());

		f.chuta('z');
		assertEquals("a.ra.a.a.ra", f.output());
		assertEquals(9, f.chutes());
	}
	
	@Test
	public void deve_perder_errando_10_vezes(){
		Forca f = new Forca("oi");
		for (int i = 0; i < 10; i++) {
			f.chuta('z');
		}
		assertTrue(f.perdeu());
	}
	
}
