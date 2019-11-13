package exo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConvertisseurRomainEntierTest {
	
	ConvertisseurRomainEntier c = new ConvertisseurRomainEntier();
	
	@Test	
	void shouldReturn0WhenEmpty() {
		assertTrue(c.getResultat("") == 0);
	}
	
	@Test
	void shouldReturn1WhenI() {
		assertTrue(c.getResultat("I") == 1);
	}

}
