package NumeroBissexto.project;

import org.junit.Test;

import junit.framework.TestCase;

public class BissextoTest extends TestCase {
	Bissexto pesquisa = new Bissexto();
	
	
	@Test
	public void testNegativo() {
		assertFalse(pesquisa.numeroBissexto(-1));
	}
	
	@Test
	public void testZero() {
		assertFalse(pesquisa.numeroBissexto(0));
	}
	
	@Test
	public void testNaoBissexto() {
		assertFalse(pesquisa.numeroBissexto(1));
	}
	
	@Test
	public void testBissextos() {
		assertTrue(pesquisa.numeroBissexto(400));
		assertTrue(pesquisa.numeroBissexto(16));
	}
	
	@Test
	public void testNaoBissextoDivisivelPorQuatro() {
		assertFalse(pesquisa.numeroBissexto(100));
	}
}