package org.dojobrasilia.forca;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ForcaTest {
	private Forca forca;

	@Before
	public void setup() {
		forca = new Forca("oi");
	}

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
		assertEquals(10, forca.chutes());
	}

	@Test
	public void deve_decrementar_os_chutes(){
		forca.chuta('a');
		assertEquals(9, forca.chutes());
	}

	@Test
	public void deve_manter_os_chutes_qndo_acerta(){
		forca.chuta('o');
		assertEquals(10, forca.chutes());
	}

	@Test
	public void deve_manter_o_output_qndo_erra(){
		forca.chuta('a');
		assertEquals("..", forca.output());
	}

	@Test
	public void deve_mostrar_o_acerto_no_output(){
		forca.chuta('o');
		assertEquals("o.", forca.output());
	}
	
	@Test
	public void deve_mostrar_o_acerto_no_output_para_segunda_letra(){
		forca.chuta('i');
		assertEquals(".i", forca.output());
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
	public void nao_deve_perder_de_cara(){
		assertFalse(forca.perdeu());
	}
	
	@Test
	public void deve_perder_errando_10_vezes(){
		for (int i = 0; i < 10; i++) {
			forca.chuta('z');
		}
		assertTrue(forca.perdeu());
	}
	
	@Test
	public void nao_deve_perder_errando_9_vezes(){
		for (int i = 0; i < 9; i++) {
			forca.chuta('z');
		}
		assertFalse(forca.perdeu());
	}
	
	@Test
	public void nao_deve_ganhar_de_cara(){
		assertFalse(forca.ganhou());
	}

	@Test
	public void deve_ganhar_qndo_acertar_tudo(){
		forca.chuta('o');
		forca.chuta('i');
		assertTrue(forca.ganhou());
	}
}
