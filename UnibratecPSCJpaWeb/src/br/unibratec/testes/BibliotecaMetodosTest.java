package br.unibratec.testes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static br.unibratec.util.BibliotecaMetodos.isObjetoValido;

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
	
}