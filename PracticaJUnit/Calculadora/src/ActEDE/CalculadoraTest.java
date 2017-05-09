package ActEDE;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora c1;
	
	@Before
	public void setUp(){
		
		c1 = new Calculadora();
		
		System.out.println("setUp");
	}
	
	@BeforeClass
	public static void setupBeforeClass(){
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void setupAfterClass(){
		System.out.println("Después de todo");
	}
	
	@Test
	public void sumarTest(){
		
		double valorEsperado = 4;
		
		double valorReal = c1.sumar(2, 2); //2 + 2 = 4
		
		assertEquals(valorEsperado, valorReal,0.001);
		
		System.out.println("sumar");
	}
	
	@Test
	public void restarTest(){

		double valorEsperado = 4;
		
		double valorReal = c1.restar(6, 2); //6 - 2 = 4
		
		assertEquals(valorEsperado, valorReal,0.001);
		
		System.out.println("restar");
	}
	
	@Test
	public void MultiplicarTest(){

		double valorEsperado = 6;
		
		double valorReal = c1.multiplicar(2, 3); //2 * 3 = 6
		
		assertEquals(valorEsperado, valorReal,0.001);
		
		System.out.println("multiplicar");
	}
	
	@Test
	public void dividirTest(){

		double valorEsperado = 4;
		
		double valorReal = c1.dividir(8, 2); //8 / 2 = 4
		
		assertEquals(valorEsperado, valorReal,0.001);
		
		System.out.println("dividir");
	}
}
