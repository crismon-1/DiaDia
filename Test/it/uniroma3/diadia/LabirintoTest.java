package it.uniroma3.diadia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Labirinto;

public class LabirintoTest {
	private Labirinto l1;
	@Before
	public void setUp() {
		l1 = new Labirinto();
	}

	@Test
	public void testGetStanzaVincente() {
		assertEquals("Biblioteca", l1.getStanzaVincente().getNome());
	}
	@Test
	public void testGetStanzaIn(){
		assertEquals("Atrio", l1.getStanzaIn().getNome());
	}
}
