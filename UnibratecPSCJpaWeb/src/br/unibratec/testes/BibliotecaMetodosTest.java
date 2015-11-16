package br.unibratec.testes;

import static br.unibratec.util.BibliotecaMetodos.isCPFvalido;
import static br.unibratec.util.BibliotecaMetodos.isEmailValido;
import static br.unibratec.util.BibliotecaMetodos.isObjetoValido;
import static br.unibratec.util.BibliotecaMetodos.isStringNao;
import static br.unibratec.util.BibliotecaMetodos.isStringSim;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BibliotecaMetodosTest {
	
	@Test
	public void testarIsObjetoValidoComStringNula() {
		String nula = null;
		
		boolean resultado = isObjetoValido(nula);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testarIsObjetoValidoComStringNaoNulaSohEspacoEmBranco() {
		String nula = " ";
		
		boolean resultado = isObjetoValido(nula);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testarIsObjetoValidoComStringNaoNulaNaoVazia() {
		String nula = "a";
		
		boolean resultado = isObjetoValido(nula);
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testarIsObjetoValidoComStringVazia() {
		String vazia = "";
		
		boolean resultado = isObjetoValido(vazia);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testarIsObjetoValidoComObjetoNulo() {
		Object nulo = null;
		
		boolean resultado = isObjetoValido(nulo);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testarNao() {
		String nao = "nao";
		assertTrue(isStringNao(nao));
		
		nao = "não";
		assertTrue(isStringNao(nao));
		
		nao = "Não";
		assertTrue(isStringNao(nao));
		
		nao = "NAo";
		assertTrue(isStringNao(nao));
		
		String outraCoisa = "sim";
		assertFalse(isStringNao(outraCoisa));
	}
	
	@Test
	public void testarSim() {
		String sim = "sim";
		assertTrue(isStringSim(sim));
		
		sim = "Sim";
		assertTrue(isStringSim(sim));
		
		sim = "SIm";
		assertTrue(isStringSim(sim));
		
		String outraCoisa = "talvez";
		assertFalse(isStringNao(outraCoisa));
	}
	
	@Test
	public void testarCPFvalido() {
		String cpfValido = "123.456.789-01";
		
		assertTrue(isCPFvalido(cpfValido));
	}
	
	@Test
	public void testarCPFinvalido() {
		String cpfInvalido = "123.456.789-0a";
		assertFalse(isCPFvalido(cpfInvalido));
		
		cpfInvalido = "123.456.78902";
		assertFalse(isCPFvalido(cpfInvalido));
		
		cpfInvalido = "123.456789-03";
		assertFalse(isCPFvalido(cpfInvalido));
		
		cpfInvalido = "123.456,789-04";
		assertFalse(isCPFvalido(cpfInvalido));
		
		cpfInvalido = null;
		assertFalse(isCPFvalido(cpfInvalido));
		
		cpfInvalido = "";
		assertFalse(isCPFvalido(cpfInvalido));
	}
	
	@Test
	public void testarEmailsValidos() {
		String emailValido = "pedropk@gmail.com";
		assertTrue(isEmailValido(emailValido));
	}
	
}