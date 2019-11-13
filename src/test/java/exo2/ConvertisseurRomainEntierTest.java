package exo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConvertisseurRomainEntierTest {
	
	ConvertisseurRomainEntier c;
	
	@BeforeEach
	void BeforeEach() {
		c = new ConvertisseurRomainEntier();
	}
	
	@Test	
	void shouldReturn0WhenEmpty() {
		assertTrue(c.getResultat("") == 0);
	}
	
	@Test
	void shouldReturn1WhenI() {
		assertTrue(c.getResultat("I") == 1);
	}
	
	@Test
	void shouldReturn5WhenV() {
		assertTrue(c.getResultat("V") == 5);
	}
	
	@Test
	void shouldReturn10WhenX() {
		assertTrue(c.getResultat("X") == 10);
	}
	
	@Test
	void shouldReturn50WhenL() {
		assertTrue(c.getResultat("L") == 50);
	}
	
	@Test
	void shouldReturn100WhenC() {
		assertTrue(c.getResultat("C") == 100);
	}
	
	

}
