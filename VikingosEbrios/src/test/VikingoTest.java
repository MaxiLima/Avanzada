package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import vikingos.Vikingo;

public class VikingoTest {
	
	Vikingo ragnar, rollo;
	
	@Before
	public void before(){
		ragnar = new Vikingo();
		rollo = new Vikingo();
	}

	@Test
	public void crearVikingoTest() {
		
		assertEquals(100, ragnar.getSalud());
		assertEquals(10, ragnar.getAtaque());
		assertEquals(5, ragnar.getDefensa());
		assertEquals("Normal", ragnar.getEstado());
		
	}
	
	@Test
	public void atacarVikingoTest(){
		
		ragnar.atacar(rollo);
		
		assertEquals(95, rollo.getSalud());
		
	}
	
	@Test
	public void beberTest(){

		ragnar.beber();
		rollo.sacudirVikingo();
		rollo.beber();
		
		assertEquals(7, ragnar.getAtaque());
		assertEquals(2, ragnar.getDefensa());
		assertEquals("Ebrio", ragnar.getEstado());
		
		assertEquals(10, rollo.getAtaque());
		assertEquals(5, rollo.getDefensa());
		assertEquals("Normal", rollo.getEstado());
		
	}
	
	@Test
	public void sacudirVikingTest(){

		ragnar.beber();
		ragnar.sacudirVikingo();
		rollo.sacudirVikingo();
		
		assertEquals(10, ragnar.getAtaque());
		assertEquals(5, ragnar.getDefensa());
		assertEquals("Normal", ragnar.getEstado());
		
		assertEquals(30, rollo.getAtaque());
		assertEquals(0, rollo.getDefensa());
		assertEquals("Enfurecido", rollo.getEstado());
		
	}

}
